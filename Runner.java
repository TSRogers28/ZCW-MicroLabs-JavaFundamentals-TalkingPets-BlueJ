import java.util.*;

public class Runner {
    int petNum;
    String type;
    String name;

    public Runner(){
        petNum = 0;
    }

    public static void main(String[] args){
       // Scanner scan = new Scanner(System.in);
        Runner runner = new Runner();
        int petNum = runner.getPetNumber();
      //  Pet pet = runner.setPetTypeAndReturn();
        runner.returnString(runner.getAllPets(petNum));
    }

    public int getPetNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, how many pets do you have");
        int petNum = scan.nextInt();
        return petNum;
    }

    public Pet setPetTypeAndReturn() {
       // Pet[] petArray = new Pet[petNum];
        Scanner scan = new Scanner(System.in);
        Pet pet = null;
            System.out.println("What kind of animal is it?");
            type = scan.nextLine();
            switch (type) {
                case "dog":
                    System.out.println("What is its' names?");
                    name = scan.nextLine();
                    pet = new Dog(name);
                    break;
                case "parrot":
                    System.out.println("What is its' names?");
                    name = scan.nextLine();
                    pet = new Parrot(name);
                    break;
                case "cat":
                    System.out.println("What is its' names?");
                    name = scan.nextLine();
                    pet = new Cat(name);
                    break;
                default:
                    System.out.println("The hell kinda animal's that?");
                    pet = setPetTypeAndReturn();
        }
        return pet;
    }


    public ArrayList<Pet> getAllPets(int petNum){
        ArrayList<Pet>  pets = new ArrayList<>();
        for(int x = 0; x < petNum; x++) {
            pets.add(setPetTypeAndReturn());
        }
        return pets;
    }


    public void returnString(ArrayList<Pet> pets){
        for(Pet pet: pets) {
            System.out.println("You have a " + pet.getClass().getSimpleName() + " and their name is " + pet.getName() + " and they say " + pet.speak());
        }
    }
}