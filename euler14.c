#include <stdio.h>

//euler 14, solved:
//looking for the longest collatz sequence under a million

int main(int argc, char** argv)
{
	int count; //starts at one
	int n;
	for(int num = 99; num > 1; num--)
	{
		printf("entered for loop");
		count = 1;
		while(n!=1)
		{
			num = n;
			if(n % 2 == 0) //is even
			{
				n = n/2;
			}
			else
			{
				n = (3 * n) + 1;
			}
			count++;
		}
		printf("%d: %d\n",num,count);
	}
}
