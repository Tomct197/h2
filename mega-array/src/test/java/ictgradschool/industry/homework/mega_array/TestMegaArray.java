package ictgradschool.industry.homework.mega_array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMegaArray {
    private MegaArray megaArray;

    @BeforeEach
    public void setUp() {
        this.megaArray = new MegaArray();
        assertEquals(0, this.megaArray.getSize());
    }

    @Test
    public void testGetCapacity() {
        assertEquals(10, this.megaArray.getCapacity());
    }

    @Test
    public void testAddThreeItems() {
        // Check we can add three items to the megaArray OK
        testAddItems(3);

        // After adding three items, the max capacity should still be 10.
        assertEquals(10, this.megaArray.getCapacity());
    }

    @Test
    public void testIndexOfExistingItem() {
        // Add some stuff to the megaArray
        this.megaArray.addItem("A");
        this.megaArray.addItem("B");
        this.megaArray.addItem("C");

        // Check that the item indices are correct
        assertEquals(0, this.megaArray.indexOf("A"));
        assertEquals(1, this.megaArray.indexOf("B"));
        assertEquals(2, this.megaArray.indexOf("C"));
    }

    @Test
    public void testIndexOfNonExistingItem() {
        // Add some stuff to the megaArray
        this.megaArray.addItem("A");
        this.megaArray.addItem("B");
        this.megaArray.addItem("C");

        // Check that a non-existent item gives us -1 for the index
        assertEquals(-1, this.megaArray.indexOf("D"));
    }

    @Test
    public void testAddNineItems() {
        // Check we can add nine items to the megaArray OK
        testAddItems(9);

        // After adding nine items, the max capacity should still be 10.
        assertEquals(10, this.megaArray.getCapacity());
    }

    @Test
    public void testAddTenItems() {
        // Check we can add 10 items to the megaArray OK
        testAddItems(10);

        // After adding 10 items, the max capacity should now be 20.
        assertEquals(20, this.megaArray.getCapacity());
    }

    @Test
    public void testAddElevenItems() {
        // Check we can add 11 items to the megaArray OK
        testAddItems(11);

        // After adding 11 items, the max capacity should now be 20.
        assertEquals(20, this.megaArray.getCapacity());
    }

    @Test
    public void testAddTwentyItems() {
        // Check we can add 20 items to the megaArray OK
        testAddItems(20);

        // After adding 11 items, the max capacity should now be 40.
        assertEquals(40, this.megaArray.getCapacity());
    }

    @Test
    public void testAddOneHundredItems() {
        // Check we can add 100 items to the megaArray OK
        testAddItems(100);

        // After adding 11 items, the max capacity should now be 160.
        assertEquals(160, this.megaArray.getCapacity());
    }

    @Test
    public void testRemoveNonExistingItem() {
        // Add some stuff to the megaArray
        this.megaArray.addItem("A");
        this.megaArray.addItem("B");
        this.megaArray.addItem("C");

        // Try to remove something that doesn't exist
        this.megaArray.removeItem("D");

        // Make sure the megaArray wasn't affected.
        assertEquals("A", this.megaArray.getItem(0));
        assertEquals("B", this.megaArray.getItem(1));
        assertEquals("C", this.megaArray.getItem(2));
        assertEquals(3, this.megaArray.getSize());
        assertEquals(10, this.megaArray.getCapacity());
    }

    @Test
    public void testRemoveFirstItem() {
        // Add some stuff to the megaArray
        this.megaArray.addItem("A");
        this.megaArray.addItem("B");
        this.megaArray.addItem("C");

        // Try to remove something that doesn't exist
        this.megaArray.removeItem("A");

        // Make sure the item was removed.
        assertEquals("B", this.megaArray.getItem(0));
        assertEquals("C", this.megaArray.getItem(1));
        assertEquals(2, this.megaArray.getSize());
    }

    @Test
    public void testRemoveMiddleItem() {
        // Add some stuff to the megaArray
        this.megaArray.addItem("A");
        this.megaArray.addItem("B");
        this.megaArray.addItem("C");

        // Try to remove something that doesn't exist
        this.megaArray.removeItem("B");

        // Make sure the item was removed.
        assertEquals("A", this.megaArray.getItem(0));
        assertEquals("C", this.megaArray.getItem(1));
        assertEquals(2, this.megaArray.getSize());
    }

    @Test
    public void testRemoveLastItem() {
        // Add some stuff to the megaArray
        this.megaArray.addItem("A");
        this.megaArray.addItem("B");
        this.megaArray.addItem("C");

        // Try to remove something that doesn't exist
        this.megaArray.removeItem("C");

        // Make sure the item was removed.
        assertEquals("A", this.megaArray.getItem(0));
        assertEquals("B", this.megaArray.getItem(1));
        assertEquals(2, this.megaArray.getSize());
    }

    /**
     * Adds the given number of items to the megaArray, then checks that:
     * - All items were added
     * - Size is reported correctly
     *
     * @param numItems the number of items to add
     */
    private void testAddItems(int numItems) {
        // Try to add stuff to the megaArray. Adds the strings "0", "1", "2", etc...
        for (int i = 0; i < numItems; i++) {
            String item = "" + i;
            this.megaArray.addItem(item);

            // After we add each item, check that the number of items in the megaArray is reported correctly.
            // Should be 1, 2, 3, etc...
            assertEquals(i + 1, this.megaArray.getSize());
        }

        // Check that we can get all the items out of the megaArray again.
        for (int i = 0; i < numItems; i++) {
            String item = "" + i;
            assertEquals(item, this.megaArray.getItem(i));
        }
    }
}
