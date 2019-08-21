//John (J.D.) Shaeffer - Euler 12 - solved: 
//Triangle numbers - finding the value of the first triangle number to have over 500 divisors
//calculate number of divisors as you go so you don't have to redo work - start n/2 and get like an even number 
//look at recursive solutions - could be a summing problem
//are divsiors of divisors divisors?

#include <stdio.h>

int main(int argc, char** argv)
{	
	int test = 11500;
	int count;
	int countmost;
	int nummost;
	int num = 55130250;
	for(int i = 10501; i <= test; i++)
	{
		count = 2;
		num =  num + i;
		//printf("%d\n",num); //print out the triangle numbers
		for(int divisor = 2; divisor <= ((num/2)+1); divisor++)
		{
			if(num % divisor == 0)
			{
				count++;
			}
		}
		if(count > countmost)
		{
			nummost = num;
			countmost = count;
		}
	}
	printf("\n");
	printf("countmost: %d\nnummost: %d\n",countmost,nummost); //i'm getting a smaller number than expected.... it can't be overflow...
	printf("%d\n\n",num);

	return 0;
}
