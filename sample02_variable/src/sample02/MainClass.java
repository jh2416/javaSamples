package sample02;

public class MainClass {
	
	public static void main(String[] args) {
		/*
		 	숫자(상수):
		 		2진수 : 0, 1
		 		8진수 : 0 ~ 7, 거의 잘 안씀
		 		10진수 : 0 ~ 9
		 		16진수 : 0 ~ 9 A B C D E F(15)
		 		
		 		[변환 예시]
		 		1010 1100 -> 2진수
		 		A	 C	  -> 16진수 -> 0xAC
		 	
		 		0xE5
		 		E	 5
		 		1110 0101

		 	
		 	변수: 빈 공간(메모리)에 데이터를 저장할 수 있는 수
		 		 데이터의 종류도 다양하다
		 */
		// 자료형
		// 숫자 자료형
		// -정수(byte, short, integer, long)
		
		byte by;	// 자료형(byte(예약어)), 변수(by)   1byte : 0~255
		by = 12;	// 대입 by가 그릇, 12가 값
		by = 25;	// 25로 변경
		//by = 255;	// 용량초과 에러; byte는 -128~127값만 받을 수 있음, 맨앞 부호비트때문에 반으로 줄어드는것
					// cast를 붙여주면(by = (byte)255;) 에러가 없어짐 왜?? 
					// -> casting이 데이터형을 원하는대로 변경해서 사용하는 방법이다.
		// int놔두고 byte를 쓸 일이 있나? -> 빠른 처리를 필요로 할 때 사용하면 좋다. 고수가 될수록 작은 용량의 자료형을 잘 다룬다.
		
		short sh;	// 2byte -> -32768~32767 (16칸이니까 부호비트 빼고 2^15범위)
		sh = -32768;
		
		int i;		// 제일 많이 쓰는 자료형 4byte -> -2147483648~2147483647(2^31) 대략21억(코테때 활용!)
		i = -2147483648;
		
		long l;		// 8byte
		l = 12345676789123L;	//compiler에서는 숫자부분을 int로 취급함 -> 맨 뒤에 L 붙여줘야함
		// 이러면 long을 무조건 써야하지 않나? -> 너무 큼, 접근에 용이한건 int
		
		
		// -실수(float, double)
		float f;  	// 4byte
		f = 123.456f;			//compiler에서는 숫자부분을 double로 취급함 -> 맨 뒤에 f 붙여줘야함
		
		double d;	// 8byte
		d = 234.5678901234;
		// 실무에선 무조건 double을 더 많이 사용함. 왜?
		// -> radian, float로는 정확한 원을 그릴 수 없음, 다른것도 마찬가지 : float의 소수점 부분이 짧음 -> 정확도가 낮아진다는 건가?
		// 맞다! float : single precision(sp)방식	1/8/23		
		//		double: double precision(dp)방식 1/11/52	마지막의 가수(mantissa)부분의 표현범위가 각각 23, 52로 정해져 있는데
		//												정해진 범위를 넘어가 버리면 정밀도가 떨어져 버리는 것이다.
		
		
		
		// 문자열 자료형
		// -문자(character)
		char c;		// 자바에서는 2byte (C언어랑 차이 있음)
		c = 'A';	// 한 문자만 표현할 때는 작은 따옴표, 큰따옴표 쓰면 에러남
		c = '한';	// 한글도 한 낱말은 사용가능
		
		// -문자열(string) String은 누군가 만들어둔 객체(wrapper class)임
		String str;
		str = "안녕";
		str = "Hello";
		
		// 논리(참, 거짓) (boolean)
		boolean b;
		b = true;		// == 1
		b = false;		// == 0
		
		
		// 변수 이름을 짓는 Rule
		int hh;				// ???? 뭔데 이게
		int humanheight;	// 1. 알아보기 쉽게
//		int 1abc;			// 2. 숫자는 맨앞에 X 
//		int char;			// 3. 예약어는 사용불가
//		int ch sg;			// 4. 중간에 띄어쓰기X
		int ABC;			// 5. 전부 대문자는 웬만하면 피하기  
		int abc;			// 6. 대소문자는 구분된다, 길이 제한도 없다
		int charPostXdot;	// 7. camel 기법
		int char_post_xdot; // 8. 특수문자는 _와 $만 허용, 권장은 하지 않음
		
		
		System.out.println(by); 		// 25
		System.out.println(sh); 		// -32768
		System.out.println("i = " + i); // i = -2147483648
		System.out.println("l = " + l); // l = 12345676789123
		
		System.out.println("f = " + f); // f = 123.456
		System.out.println("d = " + d); // d = 234.5678901234
		
		System.out.println(b); 			// false
		
//		String str1 = 234;		자료형 안맞으니 에러, 자료형 잘 맞춰주기!
//		int n = "abc";
	}
}
