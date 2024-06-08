public class ListAnimal {

    public static void main(String[] args) {
        //make a new animal obj with 8 legs
        Animal spider = new Animal(8);
        System.out.printf("This spider has %d legs\n", spider.getLegs());
        spider.walk();
        spider.eat();
        System.out.println("");

        //make a new cat obj with 4 legs
        Cat cat = new Cat(4);
        cat.setName("Didi"); //set name for didi
        System.out.printf("This cat's name is %s\n", cat.getName());
        cat.getLegs();
        cat.walk(); 
        cat.eat();
        cat.play();
        
        System.out.println("");

        //make a new fish obj with 0 legs
        Fish fish = new Fish(0);
        fish.setName("Ebeng"); //set name for fish
        System.out.println("This fish's name is " + fish.getName());
        System.out.println("Ebeng has " + fish.getLegs() + " legs");
        fish.walk();
        fish.eat();
        fish.play();
        System.out.println("");

        //make a new snake obj with 0 legs
        Snake snake = new Snake(0);
        snake.setName("Wleowleo"); //set name for fish
        System.out.println("This snake's name is " + snake.getName());
        System.out.printf("%s has %d legs\n", snake.getName(), snake.getLegs());
        snake.walk();
        snake.eat();
        snake.play();
    }
}
