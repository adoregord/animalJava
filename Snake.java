public class Snake extends Animal implements Pet {
    private String name;

    public Snake(int legs){
        super(legs);
    }

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

}

