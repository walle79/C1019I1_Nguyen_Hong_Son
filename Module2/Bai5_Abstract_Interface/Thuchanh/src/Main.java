public class Main {
    public static void main(String[] args) {
        Animal chicken = new Chicken();
        chicken.makeSound();
        ((Chicken)chicken).howToEat();
        Animal tiger = new Tiger();
        tiger.makeSound();
        Fruits[] fruits = new Fruits[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruits fruit:fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
