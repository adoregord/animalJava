public class Snake extends Animal implements Pet {
    private String name;
    private final int legs;

    public Snake(int legs){
        super(legs);
        this.legs = legs;
    }

    //override the methods from pet interface
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
        System.out.printf("%s likes to sleep\n", name);
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "{name='" + name+ " and has " +  legs +" legs}\n";
    }
}

