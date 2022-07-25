package kata;

import java.io.*;
import java.lang.instrument.IllegalClassFormatException;
import java.util.Objects;
import java.util.Scanner;

public class k_5_4_7_st_54_8 {
    public static void main(String[] args) throws IOException {
        Animal[] animalM1 = { new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"),
                new Animal("Cock"), new Animal("Bull"), new Animal("Ant"),
                new Animal("Tentecles"), new Animal("Worm")};
        ByteArrayOutputStream bai = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bai);
//        oos.writeInt(animalM1.length);
        oos.writeInt(32);
        for (int i = 0; i < animalM1.length ; i++) {
            oos.writeObject(animalM1[i]);
        }
//        oos.writeObject(3);
        oos.flush();
        oos.close();
        Animal[] animalM2 = deserializeAnimalArray(bai.toByteArray());
        System.out.println(animalM2.toString());
    }

    public static Animal[] deserializeAnimalArray(byte[] data) throws IllegalArgumentException {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data));
        } catch (IOException | NegativeArraySizeException | ClassCastException  e) {
            throw new IllegalArgumentException(e);
        }
        int len = 0;
        try {
            len = objectInputStream.readInt();
        } catch (IOException | NegativeArraySizeException | ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
        Animal[] animals = new Animal[len];
        for (int i = 0; i < len; ++i) {
            try {
                animals[i] = (Animal) objectInputStream.readObject();
//            } catch (Exception e) {
//                System.out.println(e.fillInStackTrace());
//                throw new IllegalArgumentException(e);
            } catch ( IOException | ClassNotFoundException | NegativeArraySizeException | ClassCastException e) {
                throw new IllegalArgumentException(e);
            }
//            catch (IOException e) {
//                throw new IllegalArgumentException(e);
//            }
        }
        try {
            objectInputStream.close();
        } catch (IOException | NegativeArraySizeException | ClassCastException  e) {
            throw new IllegalArgumentException(e);
        }
        return animals;
//        objectInputStream.close();

    }
}

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}

//catch (IOException | EOFException  | ArrayIndexOutOfBoundsException | IllegalArgumentException  e) {
//        throw new IllegalArgumentException(e);
//        }