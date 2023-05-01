# Mega Array (25 marks)

The number of Pokémon keeps increasing every single generation. If we use a simple array to store all the Pokémon, we'll eventually run out of space! For this question, we'll use our knowledge of arrays to build a *data structure* - which we'll call a `MegaArray` - that can store *any number* of elements (limited only by the computer's available memory), rather than a fixed number like an array.

The basic idea behind our `MegaArray` is that it will use an array to store data "behind the scenes". However, when our array is full of data, we'll *double* the size of the array. This will allow us to continually add more and more elements, resizing the array when we need to.

For this question, you'll be completing the methods and constructor of the `MegaArray` class, as well as creating a new method in that class. You may test your code as you go by running the provided `TestMegaArray` class, as you have done in the past with tests provided in some labs. The test which should pass are clearly labelled after each step.

### Part A: Creation (5 marks)
Examine the provided `MegaArray` class. You'll see two fields in this class. They are intended to be used as follows:

- `data`: The array that we'll use behind the scenes to store the items in our `MegaArray`.
- `head`: The index of the first empty element in the `data` array. When we add a new element to our `MegaArray`, it will be added at this index.

Now, perform the following steps:

1. Complete the `MegaArray` constructor so that it appropriately initializes the two fields. `data` should be able to hold 10 elements to start with, while `head` should be initialized to `0`.

2. Complete the `getSize()` method. This method should return the number of elements currently in the array.

3. Complete the `getCapacity()` method. This method should return the maximum possible number of elements the array can hold before it needs to be resized.

After completing part **Part A**, the following tests should pass:
- `testGetCapacity()`

**Hint:** Consider how the `head` value, and the `length` of the `data` array, can be used to answer steps 2 and 3 above.

### Part B: Adding and getting elements (7 marks)
Now, we'll add the ability to add elements (up to the point where we need to resize the array), get elements, and get the index of particular elements. Perform the following steps:

1. Complete the `getItem()` method. This method should simply return the element in our `MegaArray` at the given index.

2. Complete the `addItem()` method. This method should add the given item to our `MegaArray`, at the current `head` index. The head index should then be incremented.

3. Complete the `indexOf()` method. This method should return the index of the given item in our `MegaArray`, or should return `-1` if the given item doesn't exist.

   For example, if the `data` array contains the following elements:

   ```json
   ["A", "B", "C"]
   ```

   Then the index of "A" is 0, the index of "B" is 1, the index of "C" is 2, and the index of "Bob" is -1.

After completing part **Part B**, the following tests should pass:
- `testGetCapacity()`
- `testAddThreeItems()`
- `testIndexOfExistingItem()`
- `testIndexOfNonExistingItem()`
- `testAddNineItems()`

### Part C: Resizing the array (8 marks)
Next, we'll add the ability to add more elements to our `MegaArray` than its initial capacity. To do this, perform the following steps:

1. Create a new `private` method in the `MegaArray` called `grow()`. The method should take no arguments and return nothing. This method should double the size of the `data` array, according to the following algorithm:
    1. Create a new array of twice the size of the `data` array
    2. Copy all elements from the `data` array to the beginning of the new array
    3. Replace the `data` array with the newly created array.

2. Modify the `addItem()` method to appropriately use your new `grow()` method. Once an item has been added, if there's no more space in the `data` array, the `grow()` method should be called.

After completing part **Part C**, the following tests should pass:
- `testGetCapacity()`
- `testAddThreeItems()`
- `testIndexOfExistingItem()`
- `testIndexOfNonExistingItem()`
- `testAddNineItems()`
- `testAddTenItems()`
- `testAddElevenItems()`
- `testAddTwentyItems()`
- `testAddOneHundredItems()`

### Part D: Removing items (5 marks)
Finally, we'll add functionality to remove items from our `MegaArray`. To do this, complete the `removeItem()` method, which should remove the given item from our array, if it exists.

- If the given item doesn't exist in the array, this method should do nothing.

- If the item *does* exist, then all items to the *right* of (i.e. with a higher index than) that item should be shifted one place to the left. Then, the `head` should be updated appropriately.

For example, if the `data` array's contents is as follows:

```text
Contents: "A", "B", "C", ...
Indices:   0    1    2   ...
```

Then, calling `removeItem("B")` should result in the following:

```text
Contents: "A", "C", ...
Indices:   0    1   ...
```

After completing part **Part D**, *all* tests should pass.
