import java.util.Scanner;



public class StaticProject {

	public static void main(String[] args) {
		
			
		Scanner n= new Scanner(System.in);
		
		System.out.println("input x : ");
		int x=n.nextInt();
		System.out.println("input y : ");		
		int y=n.nextInt();
		
		
		if (x<y) {
			System.out.println("x is less");
		}
		if(x==y)  {
	System.out.println("x is equal ");
}
		
		if(x>y)  {
			System.out.println("x is greater ");
		}
	}

}
