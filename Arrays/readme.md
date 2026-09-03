# Java Arrays

This folder contains examples and concepts related to **Arrays in Java**, including:

* Array declaration
* Array creation and memory allocation
* Array initialization
* Indexing
* Array traversal using `for` loop
* `for-each` loop
* Taking array input from the user
* Printing array elements
* One-dimensional arrays
* Two-dimensional arrays
* Taking input in 2D arrays
* Traversing 2D arrays
* Jagged arrays

---

## 1. What is an Array?

An **array** in Java is a data structure used to store multiple values of the **same data type** under a single variable name.

Example:

```java
int[] arr = {10, 20, 30, 40, 50};
```

Instead of creating separate variables:

```java
int a = 10;
int b = 20;
int c = 30;
int d = 40;
int e = 50;
```

we can store all values in one array:

```text
arr → [10][20][30][40][50]
        0   1   2   3   4
```

---

# 2. Array Declaration

An array can be declared without creating the actual array.

```java
int[] arr;
```

or:

```java
int arr[];
```

Both are valid Java syntax.

The recommended style is:

```java
int[] arr;
```

At this point, `arr` is only a reference variable. The array itself has not been created yet.

---

# 3. Array Creation and Allocation

An array can be created using the `new` keyword:

```java
int[] number = new int[3];
```

This creates an array capable of storing **3 integers**.

```text
number
   ↓
[ 0 ][ 0 ][ 0 ]
  0    1    2
```

The default value for an `int` array is `0`.

Declaration and creation can also be separated:

```java
int[] arr;

arr = new int[3];
```

### Important

```java
int[] arr;       // Declaration
arr = new int[3]; // Creation + allocation
```

Or both together:

```java
int[] arr = new int[3];
```

---

# 4. Array Initialization

We can directly initialize an array with values:

```java
int[] arr = {10, 20, 30, 40, 50, 60};
```

The array becomes:

```text
Index:  0   1   2   3   4   5
       -------------------------
Value: 10  20  30  40  50  60
```

---

# 5. Array Indexing

Array indexing starts from **0**.

For an array containing `n` elements:

```text
First index = 0
Last index  = n - 1
```

Example:

```java
int[] arr = {10, 20, 30, 40, 50};
```

Indexes:

```text
Value:  10   20   30   40   50
Index:   0    1    2    3    4
```

Accessing an element:

```java
System.out.println(arr[0]);
```

Output:

```text
10
```

Another example:

```java
System.out.println(arr[3]);
```

Output:

```text
40
```

---

# 6. The `.length` Property

Java arrays have a `length` property:

```java
arr.length
```

It gives the **number of elements** in the array.

Example:

```java
int[] arr = {10, 20, 30, 40, 50};

System.out.println(arr.length);
```

Output:

```text
5
```

### Important correction

`.length` gives the **number of elements**, not the last index.

For:

```java
int[] arr = {10, 20, 30, 40, 50};
```

```text
arr.length = 5
last index = 4
```

Therefore:

```java
arr.length - 1
```

gives the last valid index.

---

# 7. Traversing an Array Using `for` Loop

A traditional `for` loop can be used to traverse an array:

```java
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

Here:

```text
i → index
arr[i] → value
```

For example:

```text
i = 0 → arr[0]
i = 1 → arr[1]
i = 2 → arr[2]
...
```

### Why use `i < arr.length`?

Suppose:

```java
arr.length = 5
```

Valid indexes are:

```text
0 1 2 3 4
```

The condition:

```java
i < arr.length
```

allows:

```text
0 < 5 ✓
1 < 5 ✓
2 < 5 ✓
3 < 5 ✓
4 < 5 ✓
5 < 5 ✗
```

Therefore, it automatically stops before accessing an invalid index.

---

# 8. For-Each Loop

The **for-each loop** is used to traverse elements one by one.

Example:

```java
int[] arr = {1, 2, 3, 4, 5, 6};

for (int val : arr) {
    System.out.println(val);
}
```

Output:

```text
1
2
3
4
5
6
```

Here:

```java
val
```

contains the **value**, not the index.

Conceptually:

```text
val = arr[0] → 1
val = arr[1] → 2
val = arr[2] → 3
...
```

### Traditional `for` vs `for-each`

Traditional:

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

Here `i` represents the index.

For-each:

```java
for (int val : arr) {
    System.out.println(val);
}
```

Here `val` represents the value.

Use traditional `for` when you need the **index** or need more control over iteration.

Use for-each when you simply want to process every element.

---

# 9. Taking Array Input From the User

An array can be populated using `Scanner`.

```java
Scanner sc = new Scanner(System.in);

int[] array = new int[5];

for (int i = 0; i < array.length; i++) {
    System.out.println("Enter element of array:");
    array[i] = sc.nextInt();
}
```

If the user enters:

```text
10
20
30
40
50
```

the array becomes:

```text
[10][20][30][40][50]
```

The values can then be printed:

```java
for (int val : array) {
    System.out.println(val);
}
```

---

# 10. Two-Dimensional Arrays

A 2D array can be thought of as a **table containing rows and columns**.

Example:

```java
int[][] arrays = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Representation:

```text
        Column
        0  1  2
      ┌─────────
Row 0 │ 1  2  3
Row 1 │ 4  5  6
Row 2 │ 7  8  9
```

To access an element:

```java
arrays[row][column]
```

Examples:

```java
arrays[0][0]  // 1
arrays[0][2]  // 3
arrays[1][1]  // 5
arrays[2][0]  // 7
```

The first index represents the **row**.

The second index represents the **column**.

---

# 11. Creating a 2D Array

A rectangular 2D array can be created using:

```java
int[][] arrays = new int[3][4];
```

This creates:

```text
3 rows × 4 columns
```

```text
[0][0][0][0]
[0][0][0][0]
[0][0][0][0]
```

---

# 12. Traversing a 2D Array

Because a 2D array contains multiple rows, nested loops are normally used:

```java
for (int r = 0; r < arrays.length; r++) {

    for (int c = 0; c < arrays[r].length; c++) {
        System.out.print(arrays[r][c] + " ");
    }

    System.out.println();
}
```

Here:

```text
r → row index
c → column index
```

The outer loop moves between rows.

The inner loop moves through the elements of the current row.

---

# 13. `arrays.length` vs `arrays[r].length`

This is very important when working with 2D arrays.

```java
arrays.length
```

gives the number of **rows**.

```java
arrays[r].length
```

gives the number of elements in the **current row**.

Example:

```java
int[][] arrays = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Then:

```text
arrays.length      → 3
arrays[0].length   → 3
arrays[1].length   → 3
arrays[2].length   → 3
```

---

# 14. Taking Input in a 2D Array

A 2D array can also be filled using user input.

```java
int[][] arr = new int[4][5];

Scanner input = new Scanner(System.in);

for (int i = 0; i < arr.length; i++) {

    for (int j = 0; j < arr[i].length; j++) {

        System.out.println("Enter element:");
        arr[i][j] = input.nextInt();

    }
}
```

The user enters values row by row.

For a `4 × 5` array:

```text
Row 0 → 5 values
Row 1 → 5 values
Row 2 → 5 values
Row 3 → 5 values
```

---

# 15. Printing a 2D Array

Nested loops can be used to print the array:

```java
for (int i = 0; i < arr.length; i++) {

    for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }

    System.out.println();
}
```

The `println()` after the inner loop moves the output to the next line.

Example output:

```text
1 2 3
4 5 6
7 8 9
```

---

# 16. Jagged Arrays

Java allows different rows to have different lengths.

For example:

```java
int[][] arr = {
    {1, 2, 3, 4},
    {5, 6, 7, 8, 9},
    {10, 11, 12, 13, 14, 15, 16, 17}
};
```

This creates:

```text
Row 0 → 4 columns
Row 1 → 5 columns
Row 2 → 8 columns
```

This is called a **jagged array**.

The reason this is possible is that a Java 2D array is technically an **array of arrays**.

---

# 17. Important Array Concepts

### Array size is fixed

Once an array is created:

```java
int[] arr = new int[5];
```

its size cannot be changed.

You cannot make it:

```text
5 → 10
```

without creating another array.

For dynamically sized collections, Java provides `ArrayList`.

---

### Array indexes start from 0

```text
First element → index 0
Second element → index 1
Last element → length - 1
```

---

### Arrays store the same data type

This is valid:

```java
int[] arr = {1, 2, 3, 4};
```

This is not:

```java
int[] arr = {1, 2, "Hello", 4};
```

because `"Hello"` is a `String`, not an `int`.

---

# 18. Memory Concept

In Java, an array is an **object created on the heap**.

For example:

```java
int[] arr = new int[5];
```

Conceptually:

```text
Stack                     Heap

arr ───────────────────→ [0][0][0][0][0]
                          Array object
```

The variable `arr` holds a reference to the array object.

> Note: It is common to describe arrays as using contiguous storage for their primitive elements, but Java's 2D arrays are not necessarily one single contiguous rectangular block. A 2D array is an array of separate row arrays.

---

# 19. Complete Concepts Covered

This program demonstrates:

```text
Arrays
│
├── Declaration
│
├── Creation
│   └── new int[size]
│
├── Initialization
│
├── Indexing
│   └── Starts from 0
│
├── length
│
├── Traditional for loop
│
├── For-each loop
│
├── User input
│   └── Scanner
│
├── 2D Arrays
│   ├── Rows
│   ├── Columns
│   └── Nested loops
│
└── Jagged Arrays
    └── Different column sizes per row
```

---

# 20. How to Run

Compile:

```bash
javac arrays.java
```

Run:

```bash
java arrays
```

Make sure the Java JDK is installed and available through your system's `PATH`.

---

## Key Takeaways

1. `int[] arr` declares an array reference.
2. `new int[5]` creates an array containing 5 integer elements.
3. Array indexes start at `0`.
4. The last valid index is `length - 1`.
5. `.length` gives the **number of elements**, not the last index.
6. `for` gives direct control over the index.
7. `for-each` directly provides each element.
8. A 2D array uses `array[row][column]`.
9. `array.length` gives the number of rows.
10. `array[row].length` gives the size of that particular row.
11. Java supports jagged arrays where rows can have different lengths.
12. Arrays have a fixed size after creation.
13. Java arrays are objects stored on the heap, while a local array variable holds a reference to the array.
