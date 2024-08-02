package sampleLib;

public class S {

	public static void main(String[] args) {
		
	int [] a = {30 , 20 ,100 , 50 ,60 ,10};

		int highest = a[0];
		int secondHighest = a[0];
		
		for(int i = 0 ; i<=a.length-1 ; i++)
		{
			if(highest<a[i])
			{
				secondHighest=highest;
				highest=a[i];
			}
			else if(secondHighest<a[i] && a[i]!=highest)
			{
				secondHighest=a[i];
			}
		}
		System.out.println(secondHighest);
	}
}
