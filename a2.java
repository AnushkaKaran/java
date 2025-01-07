import java.util.Scanner;
public class a2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		
		System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
		String str=sc.next();

		if(str.equals("1")){
			System.out.println("Answer is "+(a+b));
		}
		else if(str.equals("2")){
			System.out.println("Answer is "+(a-b));
		}
		else if(str.equals("3")){
			System.out.println("Answer is "+(a*b));
		}
		else if(str.equals("4")){
			if(b==0){
				System.out.println("Not Valid");
			}
			else{
			System.out.println("Answer is "+(a/b));
		}
		}
		else{
			System.out.println("Something went wrong");
		}
	}
}