package sample01;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("��ο� �ڹ�");	//()���� ����ϰ� �����ض�

		// ���� �ּ���	-> ������ ���� ����, ���α׷��� �������� ����X
		
		/*
		   ���� �ּ��� 
		   
		   Html�� <!-- -->
		   JSP��  <%-- --%>
		   mySQL, oracle ���� �ּ��� --
		 */
		
		System.out.println("Hello World");
		
		System.out.print("Hello");	//���� �ȵǴϱ� ���� ��¶� Hello�ڷ� �ٷ� ����
		System.out.print("����");
		
		//��� : escape sequence
		//      \n : ����, \b : backspace(��ĭ ������), \", \\ : ", \��½�Ű�� ���, \t : tab��ŭ ����
		System.out.print("World\n"); // == System.out.println("World");
		
		System.out.println("��ο�\b");
		
		System.out.println("\"Hello World\"");
		
		System.out.println("\tHello \tWorld");
		
		System.out.println("\\��ο� ����\\");
		
		System.out.printf("--%s--\n", "Hello");	// f : format�� ����, Hello��� ���ڿ�(String)�� s�� �־� ���, �ڵ� ������ �ȵ� 
					  //ǥ�� �ڷ���		��				���� ��������� ����
		System.out.println(1024); 		//���ڵ� ��� ����
		
		System.out.println("Hello" + "World"); //���� ���ڿ� ǥ�����
	}

}
