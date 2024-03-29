/*
John (J.D.) Shaeffer
Euler Problem #2: Solved: 24 Nov 2017

Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/
public class Euler2
{
    public static void main(String[] args)
    {
        int sum = 0;
        int num1 = 1;
        int num2 = 2;
        int num3 = 0;
        
        System.out.println(num1);
        System.out.println(num2);
        
        while(num2 < 3000000)
        {            
            num3 = num1 + num2;
            num1 = num3 + num2;
            num2 = num3 + num1;
            
            if(num1 % 2 == 0)
                sum += num1;
            else if(num2 % 2 == 0)
                sum += num2;
            else if(num3 % 2 == 0)
                sum += num3;
            
            //just for checking purposes - to make sure I wasn't going over 4000000
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        }
        System.out.println("");
        System.out.println(sum + 2); //must add the first even number!
        //System.out.println(2+8+34+144+610+2584+10946+46368+196418+832040+3524578); //a check sum
    }    
}
