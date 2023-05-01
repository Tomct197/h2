package ictgradschool.industry.homework.mega_array;

public class MegaArray {
    private String[] data;
    private int head;

    public MegaArray() {
        this.data = new String[10];
    }

    public int getSize() {
        return this.head;
    }

    public int getCapacity() {
        return this.data.length;
    }

    public String getItem(int i) {
        return this.data[i];
    }

    public void addItem(String item) {
        if (this.head + 1 == this.data.length) {
            grow();
        }
        this.data[head++] = item;
    }
    private void grow() {
        String[] newData = new String[this.data.length * 2];
        for (int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }
    public int indexOf(String item) {
        for (int i = 0; i < this.head; i++) {
            if (this.data[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public void removeItem(String item) {
        int index = indexOf(item);
        if (index != -1) {
            for (int i = index; i < this.head - 1; i++) {
                this.data[i] = this.data[i + 1];
            }
            this.head--;
        }
    }
}


