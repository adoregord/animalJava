
import java.util.ArrayList;

public class User {
    protected String name;
    protected int age;
    protected ArrayList<String> pets;

    //constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.pets = new ArrayList<>();
    }

    public void addPets(String name) {
        pets.add(name);
    }  

    //....getters....//
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public ArrayList<String> getPets() {
        return pets;
    }

}
