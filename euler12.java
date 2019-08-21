public class euler12
{
public static void main(String[] args)
{
        //find triangle numbers to test second for loop with
        long test = 28; //last tested 100000
        int count = 0;
        for(int i = 1; i <= test; i++)
        {
                int num = i * (i+1)/2;
                System.out.println(num);
        }
        //tests the number of divisors
        for(int i = 1; i <= test; i++)
        {
                if(test % i == 0) count++; //counts the number of divisors
        }
        System.out.println(count);
}
}

