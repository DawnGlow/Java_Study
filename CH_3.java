
public class CH_3 {
	
	public static void main(String[] args) {
		//주석
		/*
		 * 컴파일러가 컴파일 하지 않는 영역
		 */
		// 특수 문자
		// \t : 탭, \n : 줄 바꿈, \' : 작은 따옴표, \" : 큰 따옴표, \\ : 역슬래쉬
		
		System.out.println("Good\tMorning");
		System.out.println("Good\nMorning");
		System.out.println("Good\'Morning\'");
		System.out.println("Good\"Morning\"");
		System.out.println("Good\\Morning\\");
		
		// 서식 문자
		// printf()메서드 이용 : 여기서 f는 format(형식)을 뜻한다
		// %d : 10진수, %o : 8진수, %x : 16진수, %c : 문자, %s : 문자열, %f : 실수
		System.out.println("오늘의 기온은 10도 입니다");
		System.out.printf("오늘의 기온은 %d도 입니다\n", 10); // printf에서는 개행문자를 적어주어야 행이 바뀐다!
		int num1 = 20;
		System.out.println("오늘의 기온은 " + num1 + "입니다");
		int num2 = 15;
		// 변수를 넣을때는 println대신 printf를 사용하자!
		System.out.printf("num2(10진수) : %d\n", num2);
		System.out.printf("num2(8진수) : %o\n", num2);
		System.out.printf("num2(16진수) : %x\n", num2);
		
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\' 입니다.\n", 'a', 'A');
		System.out.printf("\'%s\'를 대문자로 바꾸면 \'%s\'입니다.\n", "java", "JAVA");
		
		// 실수는 숫자 뒤에 f, d 붙이자!
		float f = 1.23f;
		double d = 1.23456d;
		System.out.printf("f = %f\n", f);
		System.out.printf("d = %f\n", d);
		
		// 서식 문자 정렬 기능
		// 여긴 왼 정렬
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n", 12345);
		
		// 여긴 오른쪽 정렬
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		// 서식문자 소수점 제한 기능
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.0f\n", 1.23);
		System.out.printf("%.1f\n", 1.23);
		System.out.printf("%.2f\n", 1.23);
		System.out.printf("%.3f\n", 1.23);
	}

}
