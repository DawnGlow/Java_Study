
public class CH_2 {
	public static void main(String[] args) {
		//�⺻ �ڷ����� �����Ͱ� ������ ���� ����ȴ�.
		//��ü �ڷ����� ��ü �޸� �ּҰ� ������ ����ȴ�.(c������ ������, Java������ ���۷���)
		//������ : byte = 1����Ʈ, char = 2����Ʈ, short = 2����Ʈ, int = 4����Ʈ, long = 8����Ʈ
		//�Ǽ��� : float = 4����Ʈ, double = 8����Ʈ
		//���� = boolean = 1����Ʈ
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
		
		//�ڵ�(������) �� ��ȯ : ���� ������ �޸𸮿��� ū ������ �޸𸮷� �̵�
		byte by = 10; // 1����Ʈ
		int in = by; // 4����Ʈ
		// 1����Ʈ - > 4����Ʈ
		System.out.println("in = " + in);
		//����� �� ��ȯ : ū ������ �޸𸮿��� ���� ������ �޸𸮷� �̵�
		int iVar = 100; // 4����Ʈ
		byte bVar = (byte)iVar;
		System.out.println("bVar = " +  bVar);
		iVar = 123456;
		bVar = (byte)iVar;
		System.out.println("bVar = " + bVar);
	}
}
