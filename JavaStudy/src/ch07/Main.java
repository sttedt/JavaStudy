package ch07;

public class Main {
	public static void main(String[] args) {
		/* ������ ���� */
		Human human = new Human();
		human.setName("��");
		human.setType('O');
		human.setAge(20);

		/* BloodHouse ��ü ���� */
		String result = ""; // action() �޼ҵ� ȣ�� ��� ����
		/* action() �޼ҵ带 ȣ���ϸ鼭 �Ű������� ������ ���� �Ѱ��� */
		Snippet B = new Snippet();
		result = B.action(human);
		
		/* action() �޼ҵ� ȣ�� ��� ��� */
		System.out.println(result);
	}
}