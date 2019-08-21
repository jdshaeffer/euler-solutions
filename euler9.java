/*
John (J.D.) Shaeffer
Euler Problem #9: Solved: 23 Dec 2017

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
public class Euler9
{
    public static void main(String[] args)
    {
        int a, b, c;
        
        for(a = 0; a < 500; a++)
        {
            for(b = 0; b < 500; b++)
            {
                for(c = 0; c < 500; c++)
                {
                    if((a * a) + (b * b) == (c * c))
                    {
                        if((a + b + c) == 1000)
                        {
                            System.out.println(a * b * c);
                        }
                    } 
                }
            }
        }  
    }
}
