package test.fruit;

public class BananaBox {

	//�ɹ��ʵ�
	private Banana item;
	//��ü�� �����ϴ� �޼ҵ�
	public void push(Banana item) {
		this.item=item;
	}
	//��ü�� �������ִ� �޼ҵ�
	public Banana pull() {
		return item;
	}
}
