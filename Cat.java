public class Cat extends Animal implements Pet{
    private String name;

    public Cat(int legs){
        super(legs);
    }

    //override the original methods from pet interface
    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void play(){
        System.out.println("Cats likes to play with ayam");
    }

}