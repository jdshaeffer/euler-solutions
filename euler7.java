/*
John (J.D.) Shaeffer
Euler Problem #7: Solved: 26 Nov 2017

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
*/
public class Euler7
{ 
    public static void main(String[] args)
    {
        int iCount = 1;
        boolean prime;
        for(int i = 2; i < 10000000; i++)
        {
            prime = true;
            for(int j = 2; j <= i/j; j++)
            {
                if(i%j == 0)
                    prime = false;
            }
            
            if(prime)
            {
                System.out.println(i + "  " + iCount);
                iCount++;
            }
        }
    }
}
