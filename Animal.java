public class Animal{
    private int legs;

    //make a constructor
    public Animal(int legs) {
        this.legs = legs;
    }
    
    //methods//
    public void walk(){
        if(legs <= 0){
            System.out.println("This animal can't walk");
            return;
        }
        System.out.println("This animal can walk");
    }

    public void eat(){
        System.out.println("Animals have to eat");
    }

    //getter-setter//
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }

}
