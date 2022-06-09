package matrix;
import java.util.Scanner;

public class Create{
	int[][] arr1 = new int[2][2];
	int[][] arr2 = new int[2][2];
        int[] arr = new int[4];
	Scanner s = new Scanner(System.in);
	public void create() {
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("enter 2*2 element for matrix 1: ");
				arr1[i][j] = s.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("enter 2*2 element for matrix 2: ");
				arr2[i][j] = s.nextInt();
			}
		}
                for(int i=0;i<4;i++) {
				System.out.println("enter 1-D array element: ");
				arr[i] = s.nextInt();
			
               }
	}

	public class  Addmatrix{	
		public void add() {
			int[][] tot = new int[2][2];
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					tot[i][j] = arr1[i][j] + arr2[i][j];
				}
			}
			System.out.println("total : ");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(" "+tot[i][j]); 
				}
				System.out.println(" "); 
			}
		}
	}
	public class Submat{
		public void sub() {
			int[][] diff = new int[2][2];
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					diff[i][j] = arr1[i][j] - arr2[i][j];
				}
			}
			System.out.println("subtraction : ");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(" "+diff[i][j]); 
				}
				System.out.println(" "); 
			}
		}
	}
	public class Mulmat{
		public void mul() {
			int[][] multi = new int[2][2];
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					for(int k=0;k<2;k++) {
						multi[i][j]+=arr1[i][k]*arr2[k][j];
					}
				}
			}
			System.out.println("multiplication : ");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(" "+multi[i][j]); 
				}
				System.out.println(" "); 
			}
		}
	}
        public class Trans{
		public void trans() {
			int[][] trans = new int[2][2];
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					for(int k=0;k<2;k++) {
						trans[i][j]+=arr1[i][k]*arr2[k][j];
					}
				}
			}
			System.out.println("transpose : ");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(" "+trans[j][i]); 
				}
				System.out.println(" "); 
			}
		}
	}
	public class Sortmat{
		public void sort() {
			int t=0;
			for(int i=0;i<4;i++) {
				for(int j=i+1;j<4;j++) {
					if(arr[i]>arr[j]) {
						t=arr[i];
						arr[i]=arr[j];
						arr[j]=t;
					}
				}
			}
			System.out.println("sorted array : ");
			for(int i=0;i<4;i++) {
				System.out.print(" "+arr[i]);
			}
		}
	}

}