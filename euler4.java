/*
John (J.D.) Shaeffer
Euler Problem #4: Solved: 26 Nov 2017

A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/
public class Euler4
{
    public static void main(String[] args)
    {
        int[] arr0 = new int[3];
        int[] arr1 = new int[3];
        
        for(int i = 900; i < 1000; i++)
        {
            for(int j = 900; j < 1000; j++)
            {
                int product = i * j;
                String str = Integer.toString(product);
                if((str.charAt(0) == str.charAt(5)) && (str.charAt(1) == str.charAt(4)) && (str.charAt(2) == str.charAt(3)))
                {
                    System.out.println(product); //grab the biggest one!
                }
            }
        }
    }
}
