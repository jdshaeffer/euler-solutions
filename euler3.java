/*
John (J.D.) Shaeffer
Euler Problem #3: Solved: 26 Nov 2017

The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143?
*/
public class Euler3
{
    public static void main(String[] args)
    {
        long test = 600851475143L; //need L at the end to literally tell compiler it's a long constant
        boolean prime;
        
        for(int i = 2; i < 10000; i++)
        {
            prime = true;
            for(int j = 2; j <= i/j; j++) //will only run once with the outer loop
            {
                if(i % j == 0)
                    prime = false;
            }
            if(prime)
                System.out.println(i + " is prime."); //prime number algorithm is correct
            if(test % i == 0)
                System.out.println(i + " is a factor."); //figure out which factors will multiply to 600851475143
        }
    }
}
