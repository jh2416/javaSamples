package sample03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
// 깃허브에 올리는데 한글이 다 깨지고있음 어떻게 해결함?
public class MainClass {

	public static void main(String[] args) throws Exception{
		
		// input(입력)-console
		Scanner sc = new Scanner(System.in);	//입력을 받기 위한 준비작업
		
		// boolean으로 입력받기
/*		boolean b;					// 입력한 데이터를 보관할 변수
		System.out.print("b = ");	// 입력해야 할 데이터를 명시
		b = sc.nextBoolean();		// 입력받기
		System.out.println("b: " + b);*/
		// => b에 보관하고 입력 후 입력받은 결과를 출력해준다, 맞지 않는 자료형을 입력하면 Exception이 뜬다.
		
		
		// integer으로 입력받기
/*		int number;
		System.out.print("number = ");
		number = sc.nextInt();			// nextInt, nextBoolean은 이미 만들어져 있는것, 다른 자료형들도 있음
		System.out.println("number: " + number);
	*/	
		
		// double으로 입력받기
/*		double d;
		System.out.print("double = ");
		d = sc.nextDouble();
		System.out.println("double: " + d);
		// 정수를 입력해도 정상적으로 작동
	*/
		
		
		// String으로 입력받기
		String str;
		System.out.print("str = ");
		str = sc.next();				
		System.out.println("str: " + str);
		// 문자열은 항상 숫자를 이김 -> 숫자를 입력해도 정상적으로 작동함
		// 한가지 안되는게 있음 => 띄어쓰기! 이유는 next가 빈 문자를 못 받아들이기 때문
		// 해결하려면? BufferedReader 사용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 얘는 띄어쓰기가 있던, 문장이 길던 상관이 없음
		// 목적은 scanner와 동일하지만 file입출력, network 같은데서도 쓰여서 쓰임새가 넓음
		
		String str1;
		System.out.print("str1 = ");
		str1 = br.readLine();	// 그냥 사용하면 error(Exception) 발생 -> main옆에 throws Exception
		// read랑 readLine 차이는? next랑 nextLine은?
		System.out.println("str1: " + str1);
	}

}
