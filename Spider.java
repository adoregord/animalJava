public class Spider extends Animal{
    private String name;
    private final int legs;

    public Spider(int legs){
        super(legs);
        this.legs = legs;
    }

    @Override
    public void eat(){
        System.out.println("Spider likes to eat insects");
    }

    @Override
    public void walk(){
        System.out.println("Spider can walk and they can stick to a wall!");
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "{name='" + name+ " and has " +  legs +" legs}\n";
    }

}