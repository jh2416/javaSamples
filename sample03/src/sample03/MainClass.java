package sample03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
// ����꿡 �ø��µ� �ѱ��� �� ���������� ��� �ذ���?
public class MainClass {

	public static void main(String[] args) throws Exception{
		
		// input(�Է�)-console
		Scanner sc = new Scanner(System.in);	//�Է��� �ޱ� ���� �غ��۾�
		
		// boolean���� �Է¹ޱ�
/*		boolean b;					// �Է��� �����͸� ������ ����
		System.out.print("b = ");	// �Է��ؾ� �� �����͸� ���
		b = sc.nextBoolean();		// �Է¹ޱ�
		System.out.println("b: " + b);*/
		// => b�� �����ϰ� �Է� �� �Է¹��� ����� ������ش�, ���� �ʴ� �ڷ����� �Է��ϸ� Exception�� ���.
		
		
		// integer���� �Է¹ޱ�
/*		int number;
		System.out.print("number = ");
		number = sc.nextInt();			// nextInt, nextBoolean�� �̹� ������� �ִ°�, �ٸ� �ڷ����鵵 ����
		System.out.println("number: " + number);
	*/	
		
		// double���� �Է¹ޱ�
/*		double d;
		System.out.print("double = ");
		d = sc.nextDouble();
		System.out.println("double: " + d);
		// ������ �Է��ص� ���������� �۵�
	*/
		
		
		// String���� �Է¹ޱ�
		String str;
		System.out.print("str = ");
		str = sc.next();				
		System.out.println("str: " + str);
		// ���ڿ��� �׻� ���ڸ� �̱� -> ���ڸ� �Է��ص� ���������� �۵���
		// �Ѱ��� �ȵǴ°� ���� => ����! ������ next�� �� ���ڸ� �� �޾Ƶ��̱� ����
		// �ذ��Ϸ���? BufferedReader ���
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ��� ���Ⱑ �ִ�, ������ ��� ����� ����
		// ������ scanner�� ���������� file�����, network ���������� ������ ���ӻ��� ����
		
		String str1;
		System.out.print("str1 = ");
		str1 = br.readLine();	// �׳� ����ϸ� error(Exception) �߻� -> main���� throws Exception
		// read�� readLine ���̴�? next�� nextLine��?
		System.out.println("str1: " + str1);
	}

}
