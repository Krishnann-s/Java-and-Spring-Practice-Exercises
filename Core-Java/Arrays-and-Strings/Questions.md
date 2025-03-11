# Arrays and Strings

## Q1 Find Letters

Sita's teacher gives her an assignment to find the letters between the two given indexes of the word. Help Sita to complete her assignment by writing a program in java.

Index1 should be lesser than Index2 else print, "Index2 should be greater than Index1" and terminate the program.
If Index1 is greater than the entered word length then, print "<Index1> is greater than the word length" and terminate the program.
If Index2 is greater than the entered word length then, print "<Index2> is greater than the word length" and terminate the program.
Index position of a word starts with 0.

Note: Get the word and two indexes as input from the user

Please do not use System.exit(0) to terminate the program

`Sample Input 1:`

    Enter the word
    Environment

    Enter the two indices
    5
    10

`Sample Output 1:`

    onmen

`Sample Input 2:`

    Enter the word
    Rocket

    Enter the two indices
    10

`Sample Output 2:`

    10 is greater than the word length

`Sample Input 3:`

    Enter the word
    Energy

    Enter the two indices
    4
    9

`Sample Output 3:`

    9 is greater than the word length

`Sample Input 4:`

    Enter the word
    Picture

    Enter the two indices
    6
    4

`Sample Output 3:`

    Index2 should be greater than Index1

## Q2 Sum of Max

Sara gave an assignment to her students. She gave a set of numbers to her students, and the students have to add the first maximum number and the first minimum number, and then the second maximum number and the second minimum number, up to the nth number. From that number, the students have to print the maximum number. Write a Java programme to help the students solve this problem.

Requirements:

The size of the array should be greater than 1 and the size should be an even number, else print "<size> is an odd number.Please enter even number".
If the array size is less than or equal to zero, print "<size> is an invalid array size".
If the size of the array is even number then print, "The maximum number is <MaxNum>".

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided
Please do not use System.exit(0) to terminate the program.

`Sample Input/Output 1:`

    Enter the array size
    6

    Enter the number
    23
    48
    15
    68
    90
    10

    The maximum number is 100

Explanation:

1st maximum number = 90

1st minimum number = 10

Sum of 1st max and min = 100

2nd maximum number = 68

2nd minimum number = 15

Sum of 2nd max and min = 83

3rd maximum number = 48

3rd minimum number = 23

Sum of 3rd max and min = 71

Output will be "The maximum number is 100"

`Sample Input/Output 2:`

    Enter the array size
    5

    5 is an odd number.Please enter even number

`Sample Input/Output 3:`

    Enter the array size
    -9

    -9 is an invalid array size

## Q3 Subset of not

John gave an assignment to his students. He gave his students two sets of numbers; the students have to find if all the numbers in the second set are present in the first or not. Write a Java program to help the students find whether the second set of numbers is a subset of the first set of numbers or not

Requirements:

The size of both arrays should be greater than zero; otherwise print "<array size> is an invalid array size"
The length of the second array should be less than or equal to the first array; otherwise print "<size2> is an invalid size as it is greater than first array size <size1>".
If all the elements of array2 are present in array1, then print "Array2 of size <size2> is a subset of array1"; otherwise print "Array2 of size <size2> is not a subset of array1".

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided
Please do not use System.exit(0) to terminate the program.

`Sample Input/Output 1:`

    Enter the first array size
    5

    Enter the numbers
    16
    8
    2
    25
    6

    Enter the second array size
    3

    Enter the numbers
    8
    25
    2

    Array2 of size 3 is a subset of array1

`Sample Input/Output 2:`

    Enter the first array size
    3

    Enter the numbers
    58
    31
    20

    Enter the second array size
    1

    Enter the numbers
    25

    Array2 of size 1 is not a subset of array1

`Sample Input/Output 3:`

    Enter the first array size
    2

    Enter the numbers
    8
    19

    Enter the second array size
    3

    3 is an invalid size as it is greater than first array size 2

`Sample Input/Output 4:`

    Enter the first array size
    -3

    -3 is an invalid array size

`Sample Input/Output 5:`

    Enter the first array size
    3

    Enter the numbers
    45
    12
    90

    Enter the second array size
    -5

    -3 is an invalid array size

## Q4 Number Game

Josh is creating a number game. In that game, each player will get a maximum of 5 chances, and for each chance he has to enter two numbers less than 10. If, at the end of the game, the sum of the numbers he entered is a prime number, then he will be the winner. Help him create this game using a Java program.

Requirements:

The number of chances should be in the range of 1 to 5 (both inclusive), else print "Your chance <chance> is out of range(1-5)" and terminate the program.
The number entered should be greater than 0 and less than 10, else print "<number> is an invalid number" and terminate the program.
If the sum of the number is prime print "The sum <sum> is a prime number.You won the game" else print "The sum <sum> is not a prime number.Better luck next time".

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided
Please do not use System.exit(0) to terminate the program.

`Sample Input/Output 1:`

    Enter the number of chances
    3

    Enter the numbers
    2
    3
    2
    4
    1
    1

    The sum 13 is a prime number.You won the game

`Sample Input/Output 2:`

    Enter the number of chances
    1

    Enter the numbers
    2
    4

    The sum 6 is not a prime number.Better luck next time

`Sample Input/Output 3:`

    Enter the number of chances
    7

    Your chance 7 is out of range(1-5)

`Sample Input/Output 4:`

    Enter the number of chances
    4

    Enter the numbers
    9
    15

    15 is an invalid number

## Q5 Prime Number Game

Aravind's teacher gives him an assignment on the topic "array." He got two arrays as input, and in those he has to add the elements of both arrays and store them in a new array, and then only add the last digits of all elements from the third array and store them in a new variable and check if it is a prime number or not. Help Aravind complete his assignment using Java.

Requirements:

- If both the array size is not the same, print "Both array size is different" then terminate the program.
- If the size is less than or equal to zero, print "<size> is an invalid array size" then terminate the program.
- If the elements entered in an array have a value less than zero, print "<arrValue> is an invalid input" and then terminate the program.

Note:

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
- Ensure to follow the object-oriented specifications provided in the question description.
- Ensure to provide the names for classes, attributes, and methods as specified in the question description.
- Adhere to the code template, if provided
- Please do not use System.exit(0) to terminate the program.

```
Sample input/Output1:

Enter the size of first array

4

Enter the array elements

2

3

4

5

Enter the size of second array

4

Enter the array elements

6

6

6

6

18 is not a prime number
```

**Explanation**

Array1 = {2,3,4,5}

Array2 = {6,6,6,6}

add the integers in the two arrays -> Array1[0] + Array2[0] = Array3[0]

2+ 6 = 8

3+6=9

4+6=10

5+6=11

Array3 = {8,9,10,11}

In a new variable only add last digits in a Array[3]

8+9+0+1=18

Check 18 for prime number

Hence 18 is not a prime number

```
Sample input/output2:

Enter the size of first array

2

Enter the array elements

0

23

Enter the size of second array

2

Enter the array elements

23

25

11 is a prime number
```

**Explanation**

Array1 = {0,23}

Array2 = {23,25}

add the integers in the two arrays -> Array1[0] + Array2[0] = Array3[0]

0+ 23 = 23

23+25=48

Array3 = {23,48}

In a new variable only add last digits in a Array[3]

3+8=18

Check 11 for prime number

Hence 11 is a prime number

Sample input/Output3:

Enter the size of first array

-2

-2 is an invalid array size

```
Sample input/Output4:

Enter the size of first array

3

Enter the array elements

1

2

3

Enter the size of second array

-2

-2 is an invalid array size

Sample input/Output5:

Enter the size of first array

2

Enter the array elements

-3

-3 is an invalid input

Sample input/Output6:

Enter the size of first array

1

Enter the array elements

23

Enter the size of second array

2

Both array size is different
```
