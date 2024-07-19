package anudip;
import java.util.Scanner;

public class TriangleAngles {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter three triangles");
		

		int angle1 =scanner.nextInt();
		int angle2 =scanner.nextInt();
		int angle3 =scanner.nextInt();
		
		if (angle1 + angle2 + angle3 == 180) {
			System.out.println("the angles form a triangle.");
		}
		else
		{
			System.out.println("The angles do not form a triangle.");
		}
		

	}

}
