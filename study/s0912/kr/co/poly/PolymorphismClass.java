package kr.co.poly;

import kr.co.inherit.Animal;
import kr.co.inherit.Cat;
import kr.co.inherit.Dog;

public class PolymorphismClass {

	public PolymorphismClass() {
		// 다형성 배열 : upCasting : 자동으로 해줌
		Animal[] animals = { 
				new Dog("바둑이", 5, "진돗개"),
				new Cat("나비", 3, false),
				new Dog("체리", 2, "푸들"),
				new Cat("까망이", 4, true)};
		
		/*
		 * System.out.println("---배열별로 개별실행---"); animals[0].makeSound();
		 * animals[1].makeSound(); animals[2].makeSound(); animals[3].makeSound();
		 */
		System.out.println("---동물들의 소리---"); // 회전문
		for (Animal animal : animals) {
			animal.makeSound();
		}

		System.out.println("---동물들의 행동---");
		for (Animal animal : animals) {
			if (animal instanceof Dog) {
				//개발자가 직접 : DownCasting
				Dog dog = (Dog) animal;
				dog.wagTail();
			} else if (animal instanceof Cat) {
				Cat cat = (Cat) animal;
				cat.climb();
			}
		}
		
		//다형성 메서드 호출
		playWithAnimal(new Dog("루피", 1, "비글"));
		playWithAnimal(new Cat("츄츄", 2, true));
	}

	private void playWithAnimal(Animal animal) {
		System.out.println("---나의 아가들과 놀아주기---");
		animal.eat();
		animal.makeSound();
		
		System.out.println("---나의 아가들의 행동---");
		if(animal instanceof Dog) {
			((Dog) animal).wagTail();
		} else if(animal instanceof Cat) {
			((Cat) animal).climb();
		}
		
	}
}
