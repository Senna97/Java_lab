package stream.serialization;

import java.io.*;

class Person implements Serializable {
    String name;
    String title;

    public Person() {}
    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String toString() {
        return name + ", " + title;
    }
}

public class SerializationTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person personLee = new Person("Lee", "Manager");

        try (FileOutputStream fos = new FileOutputStream("serial.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personLee);

        } catch (IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fis = new FileInputStream("serial.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Object obj = ois.readObject();
            if (obj instanceof  Person) {
                Person p = (Person)obj;
                System.out.println(p);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
