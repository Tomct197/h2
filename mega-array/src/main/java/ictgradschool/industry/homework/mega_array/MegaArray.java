package ictgradschool.industry.homework.mega_array;

public class MegaArray {
    private String[] data;
    private int head;
    private int capacity;

    public MegaArray() {
        data = new String[10];
        head = 0;
        capacity = 10;
    }

    public int getSize() {
        return head;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getItem(int i) {
        if (i < 0 || i >= head) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + i);
        }
        return data[i];
    }

    public void addItem(String item) {
        if (this.head == this.capacity) {
            grow();
        }
        this.data[this.head++] = item;
        this.capacity = this.data.length;
    }

    public int indexOf(String item) {
        for (int i = 0; i < head; i++) {
            if (data[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        int newCapacity = data.length * 2;
        String[] newData = new String[newCapacity];
        for (int i = 0; i < getSize(); i++) {
            newData[i] = data[i];
        }
        data = newData;
        capacity = newCapacity;
    }

    public void removeItem(String item) {
        int index = indexOf(item);
        if (index == -1) {
            return;
        }
        for (int i = index + 1; i < head; i++) {
            data[i - 1] = data[i];
        }
        head--;
        data[head] = null;
    }
}


