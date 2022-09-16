package pack_1;
class Animal
{
    void animals() {
        System.out.println("Talk about animal");
    }
}

public class AnimalOverriding extends Animal{
    public static void main(String[] args) {
        AnimalOverriding obj = new AnimalOverriding();
        obj.animals();

    }
    void animals() {
        super.animals();
        System.out.println("Dogs can walk and run");
    }

}