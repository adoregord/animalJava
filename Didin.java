import java.util.ArrayList;

public class Didin extends User{

    public Didin(String name, int getAge) {
        super(name, getAge);
    }

    @Override
    public String getName(){
        return name;
    }

    public ArrayList<String> allOfPets(){
        return pets;
    }

    public int numberOfPets(){
        return pets.size();
    }

}
