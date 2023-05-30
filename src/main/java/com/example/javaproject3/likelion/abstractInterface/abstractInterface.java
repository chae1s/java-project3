package com.example.javaproject3.likelion.abstractInterface;

public class abstractInterface {
    public abstract static class Animal {
        public abstract void makeSound();

        public void eat() {
            System.out.println("먹이를 먹는다.");
        }
    }

    public static interface AnimalInterface {
        public void sound();

        public void run();
    }

    public static class AnimalMain {
        public static void main(String[] args) {
            Animal dog = new Dog();
            dog.makeSound();
            dog.eat();
        }
    }

    public static class Bird implements AnimalInterface {
        @Override
        public void sound() {

        }

        @Override
        public void run() {

        }
    }

    public static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return radius * radius * Math.PI;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * radius * Math.PI;
        }
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("멍멍");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Shape circle = new Circle(4);
            Shape rectangle = new Rectangle(5, 10);

            double rectangleArea = rectangle.calculateArea();
            double rectanglePerimeter = rectangle.calculatePerimeter();

            double circleArea = circle.calculateArea();
            double circlePerimeter = circle.calculatePerimeter();

            System.out.println("사각형의 넓이 : " + rectangleArea);
            System.out.println("사각형의 둘레 : " + rectanglePerimeter);
            System.out.println("원의 넓이 : " + circleArea);
            System.out.println("원의 둘레 : " + circlePerimeter);
        }
    }

    public static class Rectangle implements Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (width + height);
        }
    }

    public static interface Shape {
        public double calculateArea();

        public double calculatePerimeter();
    }
}
