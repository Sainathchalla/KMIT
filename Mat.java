package matrix;
public class Mat
{
	static int i,j,k,sum;
	public class Addmat{
		public void add(int x[][],int y[][]){
			for(i=0;i<2;i++){
				for(j=0;j<2;j++){
					System.out.print((x[i][j]+y[i][j])+"	");
				}
				System.out.println("\n");
			}
		}
	}
	public class Submat{
		public void sub(int x[][],int y[][]){
			for(i=0;i<2;i++){
				for(j=0;j<2;j++){
					System.out.print((x[i][j]-y[i][j])+"	");
				}
				System.out.println("\n");
			}
		}
	}
	public class Mulmat{
		public void mul(int x[][],int y[][]){
			for(i=0;i<2;i++){
				for(j=0;j<2;j++){
					sum=0;
					for(k=0;k<2;k++){
						sum=sum+(x[i][k]*y[k][j]);
					}
				System.out.print(sum+"	");
				}
				System.out.println("\n");
			}
		}
	}
	public class Transmat{
		public void trans(int x[][]){
			for(i=0;i<2;i++){
				for(j=0;j<2;j++){
					System.out.print(x[j][i]+"	");
				}
				System.out.println("\n");
			}
		}
	}
	public class Sort{
		public void sort(int x[]){
			for(i=1;i<4;i++)
			{
				j=i;
				k=x[i];
				while(j>0 && x[j-1]>k)
				{
					x[j]=x[j-1];
					j--;
				}
				x[j]=k;
			}
			for(i=0;i<4;i++){
				System.out.print(x[i]+"	");
			}
		}
	}
}