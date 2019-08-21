/*
John (J.D.) Shaeffer
Euler Problem #6: Solved: 26 Nov 2017

The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first 100 natural numbers and the square of the sum.
*/
public class Euler6
{
    public static void main(String[] args)
    {
        int sumSquare = 0;
        for(int i = 0; i <= 100; i++)
        {
            sumSquare += i*i;
        }
        int squareSum = 0;
        for(int i = 0; i <= 100; i++)
        {
            squareSum += i;
        }
        int squareSum2 = squareSum * squareSum;
        
        int answer = (squareSum * squareSum) - sumSquare;
        System.out.println(answer);
    }
}
