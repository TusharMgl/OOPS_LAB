import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class l8q5 {
    public static void main(String[] args) {
        Person person = new Person("Tushar", 19);
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            oos.writeObject(person);
            System.out.println("Person object serialized.");
        } catch (IOException e) {
            System.out.println("Error: Unable to serialize object.");
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Person - Name: " + deserializedPerson.name + ", Age: " + deserializedPerson.age);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: Unable to deserialize object.");
        }
    }
}
