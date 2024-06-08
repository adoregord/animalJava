public class Cat extends Animal implements Pet{
    private String name;
    private final int legs;

    public Cat(int legs){
        super(legs);
        this.legs = legs;
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

    @Override
    public String toString(){
        return getClass().getSimpleName() + "{name='" + name+ " and has " +  legs +" legs}\n";
    }
}