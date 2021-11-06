package com.pb.bondar.hw6;

public class Main {
    public static void main(String[] args) {
        Animal animals1 = new Animal();
        animals1.setName("Dog");
        animals1.setFood("meet");
        animals1.setLocation("Ukraine");
        animals1.makeNoise();
        animals1.sleep();

        Dog dog1 = new Dog();
        dog1.setName("Sharic");
        dog1.setFood("Kosti");
        dog1.eat();
        dog1.makeNoise();

        Cat cat1 = new Cat();
        cat1.setName("Murka");
        cat1.setFood("Fish");
        cat1.eat();
        cat1.makeNoise();

        Horse horse1 = new Horse();
        horse1.setName("Uragan");
        horse1.setFood("Appal");
        horse1.eat();
        horse1.makeNoise();

        Dog dog2 = new Dog("Labrador","black");
        Dog dog3 = new Dog("Corgi","brown");
        Dog dog4 = new Dog("Labrador","black");

        System.out.println("сравнение 2 и 3: " + dog2.equals(dog3));
        System.out.println("сравнение 2 и 4: " + dog2.equals(dog4));

        System.out.println("hashCode 2: " + dog2.hashCode());
        System.out.println("hashCode 3: " + dog3.hashCode());
        System.out.println("hashCode 4: " + dog4.hashCode());

        Cat cat2 = new Cat("shorthaired");
        Cat cat3 = new Cat("lengthhaired");
        Cat cat4 = new Cat("lengthhaired");

        System.out.println("сравнение кота 2 и 3: " + cat2.equals(cat3));
        System.out.println("сравнение кота 3 и 4: " + cat3.equals(cat4));

        System.out.println("hashCode кот 2: " + cat2.hashCode());
        System.out.println("hashCode кот 3: " + cat3.hashCode());
        System.out.println("hashCode кот 4: " + cat4.hashCode());

        Horse horse2 =new Horse("black","short",40);
        Horse horse3 =new Horse("black","short",40);
        Horse horse4 =new Horse("white","short",45);

        System.out.println("сравнение лошадей 2 и 3: " + horse2.equals(horse3));
        System.out.println("сравнение лошадей 3 и 4: " + horse3.equals(horse4));

        System.out.println("hashCode лошадь 2: " + horse2.hashCode());
        System.out.println("hashCode лошадь  3: " + horse3.hashCode());
        System.out.println("hashCode лошадь  4: " + horse4.hashCode());

        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(horse2);



    }
}
