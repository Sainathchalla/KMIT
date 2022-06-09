import matrix.Create;
import java.util.Scanner;
public class Matrix{
	
	public static void main(String[] args) {
		int choice;
		Create c = new Create();
		c.create();
		while(true) {
			System.out.println("\n 1.addition \n 2.subraction \n 3.multiplication \n 4.sort 1D array \n 5.transpose \n 6.exit \n enter choice \n");
			Scanner s = new Scanner(System.in);
			choice= s.nextInt();
			switch(choice) {
			case 1:
				Create.Addmatrix a = c.new Addmatrix();
				a.add();
				break;
			case 2:
				Create.Submat s1 = c.new Submat();
				s1.sub();
				break;
			case 3:
				Create.Mulmat m = c.new Mulmat();
				m.mul();
				break;
			case 4:
				Create.Sortmat so = c.new Sortmat();
				so.sort();
				break;
                       case 5:
				Create.Trans t = c.new Trans();
				t.trans();
				break;
			case 6:
				System.exit(0);
			}
		}
	
	}
	
}	

