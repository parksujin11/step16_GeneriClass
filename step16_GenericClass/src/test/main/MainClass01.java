package test.main;

import test.fruit.Apple;
import test.fruit.AppleBox;
import test.fruit.Banana;
import test.fruit.BananaBox;
import test.fruit.FruitBox;
import test.fruit.Orange;
import test.fruit.OrangeBox;

public class MainClass01 {
	public static void main(String[] args) {
		//������ ��� �ʹٸ�?
		AppleBox box1=new AppleBox();
		box1.push(new Apple());
		
		//�ٳ���
		BananaBox box2=new BananaBox();
		box2.push(new Banana());
		
		//������
		OrangeBox box3=new OrangeBox();
		box3.push(new Orange());
		
		//Generic �� apple�� �����ؼ� ��ü ����
		FruitBox<Apple> box4=new FruitBox<Apple>();
		box4.push(new Apple());
		//Generic �� banana�� �����ؼ� ��ü ����
		FruitBox<Banana> box5=new FruitBox<Banana>();
		//Generic �� orange�� �����ؼ� ��ü ����
		FruitBox<Orange> box6=new FruitBox<Orange>();
	}
}
