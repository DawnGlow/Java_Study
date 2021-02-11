
public class CH_2 {
	public static void main(String[] args) {
		//기본 자료형은 데이터가 변수에 직접 저장된다.
		//객체 자료형은 객체 메모리 주소가 변수에 저장된다.(c에서는 포인터, Java에서는 레퍼런스)
		//정수형 : byte = 1바이트, char = 2바이트, short = 2바이트, int = 4바이트, long = 8바이트
		//실수형 : float = 4바이트, double = 8바이트
		//논리형 = boolean = 1바이트
		char c = 'a';
		System.out.println("c = " + c);
		int i = 10;
		System.out.println("i = " + i);
		double d = 10.258;
		System.out.println("d = " + d);
		boolean b = false;
		System.out.println("b = " + b);
		String s = "Hello Java World!";
		System.out.println("s = " + s);
		
		//자동(묵시적) 형 변환 : 작은 공간의 메모리에서 큰 공간의 메모리로 이동
		byte by = 10; // 1바이트
		int in = by; // 4바이트
		// 1바이트 - > 4바이트
		System.out.println("in = " + in);
		//명시적 형 변환 : 큰 공간의 메모리에서 작은 공간의 메모리로 이동
		int iVar = 100; // 4바이트
		byte bVar = (byte)iVar;
		System.out.println("bVar = " +  bVar);
		iVar = 123456;
		bVar = (byte)iVar;
		System.out.println("bVar = " + bVar);
	}
}
