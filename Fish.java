public class Fish extends Animal implements Pet{
    private String name;
    private final int legs;

    public Fish(int legs){
        super(legs);
        this.legs = legs;
    }

    //override the original methods from pet interface and animal class
    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void walk(){
        System.out.printf("%s can't walk, %s swims\n", name, name);
    }

    @Override
    public void play(){
        System.out.printf("%s likes to play with his foods\n", name);
    }

    @Override
    public void eat(){
        System.out.println(name + " likes to eat bloodworms");
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "{name='" + name+ " and has " +  legs +" legs}\n";
    }
}
