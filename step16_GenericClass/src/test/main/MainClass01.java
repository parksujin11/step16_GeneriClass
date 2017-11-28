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
		//애플을 담고 싶다면?
		AppleBox box1=new AppleBox();
		box1.push(new Apple());
		
		//바나나
		BananaBox box2=new BananaBox();
		box2.push(new Banana());
		
		//오렌지
		OrangeBox box3=new OrangeBox();
		box3.push(new Orange());
		
		//Generic 을 apple로 지정해서 객체 생성
		FruitBox<Apple> box4=new FruitBox<Apple>();
		box4.push(new Apple());
		//Generic 을 banana로 지정해서 객체 생성
		FruitBox<Banana> box5=new FruitBox<Banana>();
		//Generic 을 orange로 지정해서 객체 생성
		FruitBox<Orange> box6=new FruitBox<Orange>();
	}
}
