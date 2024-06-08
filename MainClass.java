public class MainClass {

    public static void main(String[] args) {
        //make a new animal obj with 8 legs
        Spider spider = new Spider(8);
        System.out.printf("This spider has %d legs\n", spider.getLegs());
        spider.walk();
        spider.eat();
        System.out.println("");

        //make a new cat obj with 4 legs
        Cat Didi = new Cat(4);
        Didi.setName("Didi"); //set name for didi
        System.out.printf("This cat's name is %s\n", Didi.getName());
        System.out.println(Didi.getName() + " has " + Didi.getLegs() + " legs");
        Didi.walk(); 
        Didi.eat();
        Didi.play();
        System.out.println("");

        //make a new fish obj with 0 legs
        Fish Ebeng = new Fish(0);
        Ebeng.setName("Ebeng"); //set name for fish
        System.out.println("This fish's name is " + Ebeng.getName());
        System.out.println("Ebeng has " + Ebeng.getLegs() + " legs");
        Ebeng.walk();
        Ebeng.eat();
        Ebeng.play();
        System.out.println("");

        //make a new snake obj with 0 legs
        Snake Nawe = new Snake(0);
        Nawe.setName("Nawe"); //set name for fish
        System.out.println("This snake's name is " + Nawe.getName());
        System.out.printf("%s has %d legs\n", Nawe.getName(), Nawe.getLegs());
        Nawe.walk();
        Nawe.eat();
        Nawe.play();
        System.out.println("");

        //....Untuk obj user Didi dengan pet kucing....//
        Didin didi = new Didin("Didin keren");
        System.out.printf("The name of this user is %s\n", didi.getName());
        didi.addPets(Didi);
        didi.addPets(Nawe);
        didi.addPets(Ebeng);
        // didi.addPets(spider); Cant cuz spider doesnt implements pet
        System.out.printf("Didi has %d number of pets, there are %s", didi.numberOfPets(), didi.getPets());
    }
}
