import java.util.InputMismatchException;
import java.util.Scanner;

public class CoreMain {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try //예외가 발생할 수도 있는 상황 지정
		{
			System.out.print("첫 번째 값을 넣어주세요 :");
			double n1 = kb.nextInt();
						System.out.print("두 번째 값을 넣어주세요 :");
			double n2 = kb.nextInt();
			while(n2==0) 
			{
				System.out.print("0을 넣으셨습니다. 다시 넣어주세요 :");
				n2 = kb.nextInt();
			}
		
			double aa = n1/n2;
		
			System.out.println(aa);
		}
		catch(InputMismatchException e)//예외처리가 이루어지는 곳.
		//InputMismatchException = 숫자를 넣어야 하는데 문자를 넣었을 때
		{
			System.out.println("입력오류 : 문자를 입력했습니다.");
			return;
		}
		catch(ArithmeticException e)//예외처리가 이루어지는 곳.
		//ArithmeticException = 숫자를 잘못 넣었을 때
		{
			System.out.println("입력오류 : 0을 입력했습니다.");
			return;
		}
		
		System.out.println("종료");
	}

}
