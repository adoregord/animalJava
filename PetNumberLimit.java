public class PetNumberLimit extends Exception{
    public PetNumberLimit(){};

    public PetNumberLimit(String message){
        super("Error: You cant add anymore pets, the limit is 2 pets");
    }
}
