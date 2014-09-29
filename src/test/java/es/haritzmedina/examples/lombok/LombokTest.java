package es.haritzmedina.examples.lombok;

import org.junit.Test;

import java.util.List;
import java.util.Vector;

public class LombokTest {

    @Test
    public void personTest(){
        // Load people list
        List<Person> people = new Vector<Person>();
        people.add(new Person("Haritz", "Medina"));
        people.add(new Person("Juan", "Palomo"));
        people.add(new Person("John", "Wood"));

        // Read people list
        for(Person person : people){
            System.out.println("Firstname: " + person.getFirstName() + " - Lastname : " + person.getLastName());
            System.out.println("Person to string:  " + person.toString());
        }
    }

    @Test
    public void enterpriseTest(){
        // Load people list
        List<Person> people = new Vector<Person>();
        people.add(new Person("Haritz", "Medina"));
        people.add(new Person("Juan", "Palomo"));
        people.add(new Person("John", "Wood"));

        // Create an empty enterprise
        Enterprise enterprise = new Enterprise();
        enterprise.setName("Google");
        System.out.println("Empty enterprise: " + enterprise.toString());

        // Add workers to enterprise
        enterprise.setPeople(people);
        System.out.println("Enterprise with workers: " + enterprise.toString());
    }

}