public class Chicken extends Animal implements Edible {
    @Override
    public void makeSound() {
        System.out.println("Chíp chíp");
    }
    @Override
    public String howToEat(){
        return ("Eat by mouth");
    }
}
