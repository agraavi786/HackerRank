package hacker;

//1 1 1 0 0 0 
//0 1 0 0 0 0 
//1 1 1 0 0 0 
//0 0 2 4 4 0 
//0 0 0 2 0 0 
//0 0 1 2 4 0 

import java.util.Scanner;

public class Hourglass {
	
	
	
	public static int hourGlass(int a[][]) {
       int maxSum = Integer.MIN_VALUE;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				int sum = a[i][j]+a[i][j+1]+a[i][j+2]
						+a[i+1][j]
								+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
				
				if (sum>maxSum) {
					maxSum=sum;
				}
			}
		}
		return maxSum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[][]= new int[6][6];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(hourGlass(a));
	
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		
//		int maxSum = Integer.MAX_VALUE;
//		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				int sum = a[i][j]+a[i][j+1]+a[i][j+2]
//						+a[i+1][j]
//								+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
//				
//				if (sum>maxSum) {
//					maxSum=sum;
//				}
//			}
//		}
//		System.out.println(maxSum+"||");
//		
//		
//		
//
	}
//
}
