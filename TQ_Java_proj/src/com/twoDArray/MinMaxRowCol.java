package com.twoDArray;

public class MinMaxRowCol {
//	WAP to find out row wise & column wise maximum & minimum element.
	public void rowMaxMin(int a[][])
	{
		for(int i=0; i<a.length; i++)
		{
			int rowMin = Integer.MAX_VALUE;
			int rowMax = Integer.MIN_VALUE;
			int colMin = Integer.MAX_VALUE;
			int colMax = Integer.MIN_VALUE;
			for(int j=0; j<a[i].length; j++)
			{
				if(rowMin > a[i][j])
				{
					rowMin = a[i][j];
				}
				if(rowMax < a[i][j])
				{
					rowMax = a[i][j];
				}
				if(colMin > a[j][i])
				{
					colMin = a[j][i];
				}
				if(colMax < a[j][i])
				{
					colMax = a[j][i];
				}
			}
			System.out.println("Row "+ (i+1) +" \tMin "+ rowMin +"\tMax " + rowMax);
			System.out.println("Col "+ (i+1) +" \tMin "+ colMin +"\tMax " + colMax);
		}
	}
	
	public static void main(String[] args) {
		int a[][] = {	{78, 65, 47, 61},
						{45, 77, 39, 94},
						{98, 21, 84, 52},
						{81, 59, 69, 70}};
		MinMaxRowCol m = new MinMaxRowCol();
		m.rowMaxMin(a);
	}
}
