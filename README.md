# ADS

Problem 1.
In Problem 1, I found the minimum number from an array, recursion is used to find the minimum value in the array "arr". The function "findMin" recursively calls itself, reducing the size of the array n by 1, until it reaches the base case where the size of the array is 1.

Problem 2.
In this problem, we needed to find the average value of an array.
Recursion is used to find the sum of the elements of the arr array using the calculateSum function, which recursively calls itself to find the sum of the elements starting from a specified index. The calculateAvg function then calls calculateSum to find the sum of all the elements, and then returns the average value. The main function creates the array, calls calculateAvg, and displays the result on the console.

Problem 3.
This code can be used to check if a number is prime or not. With recursion, this code checks to see if a given integer is prime or not. The isPrime function is called from itself to check if the number is divisible by any other number (from 2 up to the root of the given number); if it is, then the number is not prime, otherwise it is. Recursive calls to the isPrime function occur until i reaches the root of n. If the check finishes and none of the numbers that are less than the root of n are divisible by n, the function will return true.

Problem 4.
This code calculates the factorial of number 5 using the recursive function factorial. The factorial of n is the product of all integers from 1 to n inclusive. In this case, if n is 0 or 1, the function returns 1. Otherwise, it calls itself with the argument n-1 and multiplies the result by n. Recursion is used to sequentially calculate the product of all integers from 1 to n.

Problem 5.
This code uses recursion to compute the nth Fibonacci number. When n is 0, 0 is returned, when n is 1, 1 is returned, and in all other cases a recursive function call is used to calculate the sum of the previous two Fibonacci numbers (n-1 and n-2).

Problem 6.
This code implements the function of raising an integer a to a positive integer degree n using recursion. Recursion is used in this code to calculate the power of the number a to be raised to the power of n. The recursive function powerOf() calls itself, decreasing the value of the argument n by 1 at each iteration until n reaches 0. In this case, the function returns 1. The value of a is then multiplied by the result returned by the recursive call to powerOf(a, n-1). This process continues until the value of n is 0, and the function begins to return values starting with 1, gradually increasing the result obtained by a according to the value of n.

Problem 7.
The code implements a reverse function that recursively flips the arr array between the two indexes start and end. Using recursion, the function reverses the first and last elements of the array, then the second and penultimate, and so on, until the start index is greater than or equal to end. The function recursively calls itself with an increased start index and a decreased end index, continuing to flip the array until the entire array is flipped. At the end, the flipped array is displayed.

Problem 8.
This code recursively checks if a given string consists only of digits. The isDigits function takes a string as an argument and compares the first character of the string with a digit. If the first character is a digit, isDigits is called for the rest of the string (without the first character), otherwise it returns false. If there are no digits left at the end of the string, it returns true. The code outputs "Yes" if the string consists only of digits, and "No" if the string contains characters other than digits.

Problem 9.
This code uses recursion to compute the binomial coefficient C(n,k), which is computed as the number of ways to choose k objects from n possible objects without regard to order.
The function binomialCoef(n, k) returns the value of this coefficient using the recursive formula C(n,k) = C(n-1, k-1) + C(n-1, k) until k reaches 0 or n. If k is 0 or n, the value of the coefficient is 1.

Problem 10.
This code finds the greatest common divisor (NOD) of two integers a and b using the Euclidean algorithm. The recursive function gcd takes two arguments a and b. If b is 0, then a is the greatest common divisor and the value of a is returned. Otherwise, the function gcd is called with arguments b and a%b (the remainder of a divided by b), which recursively finds the NOD for the new pair of numbers.
