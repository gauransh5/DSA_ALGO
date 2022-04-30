package solution;

import java.util.Scanner;

public class Solution {

	public static int[][] getMatrix() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();

		int[][] matrix = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] arr) {
		int r = arr.length;
		int c = arr[0].length;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void find(int[][] arr,int x) {
		int r = arr.length;
		int c = arr[0].length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if(arr[i][j]==x)
					System.out.print(arr[i][j]+" is present at ("+i+","+j+")");
			}
			System.out.println();
		}
	}
	public static void spiral(int[][] a) {
		int l=0;
		int r=a[0].length-1;
		int t=0;
		int d=a.length-1;
		int dir=0;
		while(t<=d&&l<=r) {
			if(dir==0) {
				for(int i=l;i<=r;i++) 
					System.out.print(a[t][i]+" ");
					t++;
				
			}
			else if (dir==1) {
				for(int i=t;i<=d;i++) 
					System.out.print(a[i][r]+" ");
					r--;
				
					
			}
			else if(dir==2) {
				for(int i=r;i>=l;i--) 
					System.out.print(a[d][i]+" ");
				d--;
				
			}else if(dir==3) {
				for(int i=d;i>=t;i--) 
					System.out.print(a[i][l]+" ");
				l++;
				
			} dir=(dir+1)%4;
			
		}
				
		
	}
	public static void main(String[] args) {
		int[][] r=getMatrix();
		//printMatrix(r);
		//find(r,4);
		
		spiral(r);
		
	}

}
