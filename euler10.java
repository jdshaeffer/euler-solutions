/*
John (J.D.) Shaeffer
Euler Problem #10: Solved: 23 Dec 2017

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/
public class Euler10
{
    public static void main(String[] args)
    {
        long sum = 0L;
        boolean prime; //memorize this prime number algorithm
        for(int i = 2; i < 2000000; i++)
        {
            prime = true;
            for(int j = 2; j <= i/j; j++)
            {
                if(i % j == 0)
                    prime = false;
            }
            if(prime)
            {
                sum += i;
                //System.out.println(i);
            }
        }
        //System.out.println("");
        System.out.println(sum);
    }
}
