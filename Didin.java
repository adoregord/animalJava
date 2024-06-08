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

    @Override
    public void addPets(String name){
        try {
            if(numberOfPets() >=2 ){
                throw new PetNumberLimit("Error: You cant add anymore pets, the limit is 2 pets");
            }
            pets.add(name);
        } catch (PetNumberLimit e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }
}
