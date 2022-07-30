package kata;

import java.io.*;

public class k_5_4_7_st_54_8_2 {
    public static void main(String[] args) throws IOException {
        Animal[] animalM1 = {new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"),
                new Animal("Cock"), new Animal("Bull"), new Animal("Ant"),
                new Animal("Tentecles"), new Animal("Worm")};
        ByteArrayOutputStream bai = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bai);
        oos.writeInt(animalM1.length);
//        oos.writeInt(31);
        for (int i = 0; i < animalM1.length; i++) {
            oos.writeObject(animalM1[i]);
        }
//        oos.writeObject(3);
        oos.flush();
        oos.close();
        Animal[] animalM2 = deserializeAnimalArray(bai.toByteArray());
        System.out.println(animalM2.toString());
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animals;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int len = 0;
            len = objectInputStream.readInt();
            animals = new Animal[len];
            for (int i = 0; i < len; ++i) {
                animals[i] = (Animal) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException | NegativeArraySizeException | ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
        return animals;
    }
}

//catch (IOException | EOFException  | ArrayIndexOutOfBoundsException | IllegalArgumentException  e) {
//        throw new IllegalArgumentException(e);
//        }