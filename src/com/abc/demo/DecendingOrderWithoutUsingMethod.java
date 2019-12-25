package com.abc.demo;

public class DecendingOrderWithoutUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 65, 87, 65, 78, 96, 64, 45, 78 ,96};
		int temp = 0;

		System.out.println("Original Array:");
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
		System.out.println("Decending Order: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			System.out.println(+a[i]);
			}
		}
	}
