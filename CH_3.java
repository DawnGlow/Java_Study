
public class CH_3 {
	
	public static void main(String[] args) {
		//�ּ�
		/*
		 * �����Ϸ��� ������ ���� �ʴ� ����
		 */
		// Ư�� ����
		// \t : ��, \n : �� �ٲ�, \' : ���� ����ǥ, \" : ū ����ǥ, \\ : ��������
		
		System.out.println("Good\tMorning");
		System.out.println("Good\nMorning");
		System.out.println("Good\'Morning\'");
		System.out.println("Good\"Morning\"");
		System.out.println("Good\\Morning\\");
		
		// ���� ����
		// printf()�޼��� �̿� : ���⼭ f�� format(����)�� �椡�Ѵ�
		// %d : 10����, %o : 8����, %x : 16����, %c : ����, %s : ���ڿ�, %f : �Ǽ�
		System.out.println("������ ����� 10�� �Դϴ�");
		System.out.printf("������ ����� %d�� �Դϴ�\n", 10); // printf������ ���๮�ڸ� �����־�� ���� �ٲ��!
		int num1 = 20;
		System.out.println("������ ����� " + num1 + "�Դϴ�");
		int num2 = 15;
		// ������ �������� println��� printf�� �������!
		System.out.printf("num2(10����) : %d\n", num2);
		System.out.printf("num2(8����) : %o\n", num2);
		System.out.printf("num2(16����) : %x\n", num2);
		
		System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\' �Դϴ�.\n", 'a', 'A');
		System.out.printf("\'%s\'�� �빮�ڷ� �ٲٸ� \'%s\'�Դϴ�.\n", "java", "JAVA");
		
		// �Ǽ��� ���� �ڿ� f, d ������!
		float f = 1.23f;
		double d = 1.23456d;
		System.out.printf("f = %f\n", f);
		System.out.printf("d = %f\n", d);
		
		// ���� ���� ���� ���
		// ���� ���� ����
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n", 12345);
		
		// ���� ������ ����
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		// ���Ĺ��� �Ҽ��� ���� ���
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.0f\n", 1.23);
		System.out.printf("%.1f\n", 1.23);
		System.out.printf("%.2f\n", 1.23);
		System.out.printf("%.3f\n", 1.23);
	}

}
