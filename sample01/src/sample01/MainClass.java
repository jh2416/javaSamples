package sample01;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("헬로우 자바");	//()안을 출력하고 개행해라

		// 한줄 주석문	-> 컴파일 되지 않음, 프로그램에 직접적인 영향X
		
		/*
		   범위 주석문 
		   
		   Html은 <!-- -->
		   JSP는  <%-- --%>
		   mySQL, oracle 한줄 주석문 --
		 */
		
		System.out.println("Hello World");
		
		System.out.print("Hello");	//개행 안되니까 다음 출력때 Hello뒤로 바로 붙음
		System.out.print("월드");
		
		//기능 : escape sequence
		//      \n : 개행, \b : backspace(한칸 앞으로), \", \\ : ", \출력시키는 방법, \t : tab만큼 띄어쓰기
		System.out.print("World\n"); // == System.out.println("World");
		
		System.out.println("헬로우\b");
		
		System.out.println("\"Hello World\"");
		
		System.out.println("\tHello \tWorld");
		
		System.out.println("\\헬로우 월드\\");
		
		System.out.printf("--%s--\n", "Hello");	// f : format의 약자, Hello라는 문자열(String)을 s에 넣어 출력, 자동 개행은 안됨 
					  //표현 자료형		값				자주 사용하지는 않음
		System.out.println(1024); 		//숫자도 출력 가능
		
		System.out.println("Hello" + "World"); //여러 문자열 표현방법
	}

}
