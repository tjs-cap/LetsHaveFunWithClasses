import java.time.LocalDate;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        Pet pet1 = new Pet("Fred", 17.0f,(byte)2,"Mad as a hatter!");
//        Pet pet3 = new Pet("Wilma",(byte)1);
        Dog dog1 = new Dog("Fido",20.0f,(byte)5,"Chunky","Brown","small",true);
        Cat cat1 = new Cat("Garfield",8.0f,(byte)7,"Likes lasagne","Ginger",true);
        Budgie b1 = new Budgie("Tweetie",0.05f,(byte)3,"With a cage","Blue",30f);
//        System.out.println(pet1.getName());
//        System.out.println(pet1.getAge());
//        pet1.getsOlder();
//        System.out.println(pet1.getAge());
//        pet1.eats();
//        pet1.sleeps();
//        pet3.eats();
//        System.out.println("Name is " + pet3.getName());
        dog1.eats();
        dog1.makesSound();
        cat1.eats();
        cat1.sleeps();
        b1.makesSound();

        Days myDays = Days.MONDAY;
        System.out.println(myDays);

        LocalDate dob = LocalDate.of(2000, 5, 15);
        Student s = new Student("Fred", "Flintstone", dob, 1,"Fraggle Rock!");
        System.out.println(s.firstName() + " " + s.lastName());

    }
}
