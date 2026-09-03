# Java Methods

This file demonstrates the fundamental concepts of **methods in Java**, including method declaration, method calls, parameters, arguments, return values, method overloading, execution flow, method call stack, scope, and call-by-value.

---

## 📁 File

```text
method.java
```

---

# 1. What is a Method?

A **method** is a block of code designed to perform a particular task.

Methods help us:

* Reuse code
* Organize programs
* Reduce code duplication
* Make programs easier to understand and maintain

### Basic Syntax

```java
returnType methodName(parameters) {
    // method body
}
```

Example:

```java
static void greet() {
    System.out.println("Inside greet method");
}
```

---

# 2. Method Declaration

A method is declared by specifying its return type, name, parameters, and body.

Example from this program:

```java
static void printTable(int num) {

    for(int i = 1; i <= 10; i++) {
        int table = num * i;
        System.out.println(table);
    }
}
```

Here:

| Component       | Value                       |
| --------------- | --------------------------- |
| Access modifier | Default/package-private     |
| `static`        | Method belongs to the class |
| Return type     | `void`                      |
| Method name     | `printTable`                |
| Parameter       | `int num`                   |
| Method body     | Code inside `{ }`           |

---

# 3. Method Call

A method executes when it is called.

Example:

```java
printTable(number);
```

The method receives the value stored in `number` and executes its code.

```text
main()
   ↓
printTable(number)
   ↓
printTable() executes
   ↓
Table is printed
   ↓
Control returns to main()
```

---

# 4. Parameters and Arguments

### Parameter

A **parameter** is a variable defined in the method declaration that receives a value.

```java
static void printTable(int num)
```

Here:

```text
num → parameter
```

### Argument

An **argument** is the actual value passed when calling the method.

```java
printTable(number);
```

Here:

```text
number → argument
```

### Example

```java
static void add(int a, int b) {
    System.out.println(a + b);
}

add(10, 20);
```

```text
Parameters: a, b
Arguments:  10, 20
```

---

# 5. Parameterized Method

A method can accept parameters.

Example:

```java
static void printTable(int num) {
    for(int i = 1; i <= 10; i++) {
        System.out.println(num * i);
    }
}
```

Calling:

```java
printTable(5);
```

produces:

```text
5
10
15
20
25
30
35
40
45
50
```

---

# 6. Non-Parameterized Method

A method does not necessarily need parameters.

Example:

```java
static void greetUser() {
    System.out.println("WelcomeUserXyz");
}
```

It can be called directly:

```java
greetUser();
```

There are no arguments passed to this method.

---

# 7. Void and Non-Void Methods

## Void Method

A `void` method does not return a value.

```java
static void greet() {
    System.out.println("Inside greet method");
}
```

## Non-Void Method

A non-void method returns a value.

Example:

```java
static int returnChar(int a, int b) {

    int h = a + b;

    return h;
}
```

Because the return type is `int`, the method must return an integer.

Example:

```java
int c = returnChar(a, b);
```

If:

```text
a = 90
b = 78
```

then:

```text
c = 168
```

---

# 8. Return Statement

The `return` statement sends a value back to the code that called the method.

Example:

```java
static int returnChar(int a, int b) {

    int h = a + b;

    return h;
}
```

Execution:

```text
returnChar(90, 78)
        ↓
     90 + 78
        ↓
      168
        ↓
   return 168
        ↓
c = 168
```

---

# 9. Method Overloading

**Method overloading** means creating multiple methods with the **same name but different method signatures**.

This program demonstrates overloading using `returnChar()`.

### First Method

```java
static int returnChar(int a, int b) {
    int h = a + b;
    return h;
}
```

Signature:

```text
returnChar(int, int)
```

### Second Method

```java
static int returnChar(int a, int b, int c) {
    int h = a + b + c;
    return h;
}
```

Signature:

```text
returnChar(int, int, int)
```

Because their signatures are different, Java allows both methods.

### Example

```java
returnChar(10, 20);
```

calls:

```text
returnChar(int, int)
```

while:

```java
returnChar(10, 20, 30);
```

calls:

```text
returnChar(int, int, int)
```

---

# 10. Method Signature

A **method signature** consists of:

* Method name
* Number of parameters
* Parameter types
* Order of parameter types

Example:

```java
static int returnChar(int a, int b)
```

Signature:

```text
returnChar(int, int)
```

Another:

```java
static int returnChar(int a, int b, int c)
```

Signature:

```text
returnChar(int, int, int)
```

### Important

The following are **not part of the method signature**:

* Return type
* Parameter variable names
* `static`
* Access modifiers such as `public` or `private`

For example:

```java
int add(int a, int b)
```

and:

```java
double add(int x, int y)
```

cannot coexist only by changing the return type because both have the signature:

```text
add(int, int)
```

---

# 11. Execution Flow of Methods

Consider:

```java
System.out.println("Start");
greet();
System.out.println("End");
```

The execution flow is:

```text
main()
   ↓
Print "Start"
   ↓
Call greet()
   ↓
Enter greet()
   ↓
Print "Inside greet method"
   ↓
greet() finishes
   ↓
Return to main()
   ↓
Print "End"
   ↓
main() finishes
```

Output:

```text
Start
Inside greet method
End
```

Java temporarily transfers control to the called method and then returns to the point where the method was called.

---

# 12. Method Call Stack

The **method call stack** is used by the JVM to keep track of active method calls.

Each method call gets a **stack frame**.

For example:

```text
main()
   ↓
methodA()
   ↓
methodB()
```

The stack conceptually looks like:

```text
┌──────────────┐
│ methodB()    │ ← Currently executing
├──────────────┤
│ methodA()    │
├──────────────┤
│ main()       │
└──────────────┘
```

When `methodB()` finishes, its frame is removed and execution continues in `methodA()`.

The stack follows:

```text
LIFO
Last In → First Out
```

---

# 13. Stack Frame

A stack frame contains information needed for a particular method invocation.

Conceptually, it can contain:

* Parameters
* Local variables
* Intermediate/temporary values
* Information required for returning from the method
* References to objects

Example:

```java
static int add(int a, int b) {

    int result = a + b;

    return result;
}
```

A conceptual stack frame could contain:

```text
add() Stack Frame
┌─────────────────────┐
│ a = 10              │
│ b = 20              │
│ result = 30         │
│ return information  │
└─────────────────────┘
```

---

# 14. Scope in Java

**Scope** is the region of the program where a variable can be accessed.

## Local Variable

```java
static void test() {

    int x = 10;

    System.out.println(x);
}
```

`x` can be accessed inside its applicable local scope.

---

## Block Scope

Variables declared inside a block `{ }` generally cannot be accessed outside that block.

Example:

```java
if (true) {

    int x = 10;

    System.out.println(x);
}
```

This works:

```java
System.out.println(x);
```

inside the block.

But this does not:

```java
if (true) {
    int x = 10;
}

System.out.println(x); // Error
```

because `x` is outside its scope.

---

# 15. Call by Value

Java uses **pass-by-value**.

This means a method receives a **copy of the argument's value**.

Example:

```java
static void change(int x) {
    x = 100;
}

public static void main(String[] args) {

    int a = 10;

    change(a);

    System.out.println(a);
}
```

Output:

```text
10
```

Why?

```text
main()                  change()

a = 10  ──copy──────→   x = 10
                        x = 100
```

Changing `x` does not change `a`.

### Important

Java is always **pass-by-value**.

For objects, the value being copied is the object's **reference value**. This is why modifying an object's fields inside a method can affect the same object, while assigning the parameter to a different object does not change the caller's reference.

---

# 16. Program Execution Summary

The overall execution of this program begins from:

```java
public static void main(String[] args)
```

Then Java executes statements sequentially.

The program:

```text
Start main()
     ↓
Print "Methods in java"
     ↓
Create Scanner
     ↓
Take number from user
     ↓
Call printTable(number)
     ↓
Print multiplication table
     ↓
Call greetUser()
     ↓
Call returnChar(a, b)
     ↓
Receive returned value
     ↓
Print result
     ↓
Call greet()
     ↓
Return to main()
     ↓
Execute scope example
     ↓
main() finishes
```

---

# 17. Key Concepts Covered

This file demonstrates:

* [x] Method declaration
* [x] Method syntax
* [x] Method calling
* [x] Parameters
* [x] Arguments
* [x] Parameterized methods
* [x] Non-parameterized methods
* [x] `void` methods
* [x] Non-void methods
* [x] Return values
* [x] Method overloading
* [x] Method signatures
* [x] Method execution flow
* [x] Method call stack
* [x] Stack frames
* [x] Variable scope
* [x] Block scope
* [x] Call-by-value

---

# 18. How to Run

Compile:

```bash
javac method.java
```

Run:

```bash
java method
```

The program asks for a number:

```text
Methods in java
ENTER NUMBER
5
```

Then it prints the multiplication table and demonstrates the other method concepts.

---

## Learning Takeaway

The most important concepts to remember are:

```text
Method
  ↓
Declaration
  ↓
Parameters
  ↓
Method Call
  ↓
Arguments
  ↓
Method Execution
  ↓
Return Value (if any)
  ↓
Control returns to caller
```

And for overloading:

```text
Same method name
       +
Different parameter list/signature
       =
Method Overloading
```

For the call stack:

```text
Last method called
        ↓
First method to return
        ↓
LIFO
```

For arguments:

```text
Arguments → values passed during method call

Parameters → variables receiving those values
```

For Java parameter passing:

```text
Java → Always Pass-by-Value
```
