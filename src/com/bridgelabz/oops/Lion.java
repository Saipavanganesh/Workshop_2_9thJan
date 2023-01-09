package com.bridgelabz.oops;

public class Lion extends Animal {
    public static void main(String[] args) {
        Lion lion = new Lion();
        String name = "Lion";
        System.out.println(lion.legs);
        System.out.println(lion.name);
        lion.eat();
    }
    public void eat(){
        System.out.println("Lion eats other animals");
    }
}
