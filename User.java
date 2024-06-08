
import java.util.ArrayList;

public class User {
    protected String name;
    protected int age;
    protected ArrayList<Pet> pets;

    //....constructor....//
    public User(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
    }

    public int numberOfPets(){
        return pets.size();
    }

    public void addPets(Pet pet) {
        try {
            if(numberOfPets() >=2 ){
                throw new PetNumberLimit("Error: You cant add anymore pets, the limit is 2 pets");
            }
            pets.add(pet);
            System.out.println(name + " has obtained a new pet called " + pet.getName());
        } catch (PetNumberLimit e) {
            System.out.println(e.getMessage());
        }
    }  

    // @Override
    // public String toString(){
    //     return getClass().getSimpleName() + "{name='" + pet.getName() + " and has " + " legs}";
    // }

    //....getters....//
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPets() {
        return pets.toString();
    }

    // public String printPet(Pet pet){
    //     int a = ((int) pet).getLegs();
    //     return (pet.getClass().getSimpleName() + "{name='" + pet.getName() + " and has " + a +" legs}") ;
    // }
}
