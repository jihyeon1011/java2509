package kr.co.inherit;

public class Cat extends Animal {

	boolean isIndoor;

	public Cat(String name, int age, boolean isIndoor) {
		super(name, age);
		this.isIndoor = isIndoor;
	}

	public void climb() {
		System.out.println("Cat-" + name + "가 점프점프");

	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("Cat-"+name + "가 츄르를 먹어요");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Cat-실내묘: " + (isIndoor? "예": "아니요"));
	}
	
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("Cat-" + name +"가 야옹~");
	}
}
