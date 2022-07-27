package kata;

import java.io.*;

public class k_5_4_7_st_54_8_2 {
    public static void main(String[] args) throws IOException {
        Animal[] animalM1 = { new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"),
                new Animal("Cock"), new Animal("Bull"), new Animal("Ant"),
                new Animal("Tentecles"), new Animal("Worm")};
        ByteArrayOutputStream bai = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bai);
//        oos.writeInt(animalM1.length);
        oos.writeInt(31);
        for (int i = 0; i < animalM1.length ; i++) {
            oos.writeObject(animalM1[i]);
        }
//        oos.writeObject(3);
        oos.flush();
        oos.close();
        Animal[] animalM2 = deserializeAnimalArray(bai.toByteArray());
        System.out.println(animalM2.toString());
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        ObjectInputStream objectInputStream = null;
        Animal[] animals;
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
        try {
            animals = new Animal[len];
            for (int i = 0; i < len; ++i) {
                animals[i] = (Animal) objectInputStream.readObject();
            }
        } catch ( IOException | ClassNotFoundException | NegativeArraySizeException | ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
//            catch (IOException e) {
//                throw new IllegalArgumentException(e);
//            }

        try {
            objectInputStream.close();
        } catch (IOException | NegativeArraySizeException | ClassCastException  e) {
            throw new IllegalArgumentException(e);
        }
        return animals;
//        objectInputStream.close();

    }
}

//catch (IOException | EOFException  | ArrayIndexOutOfBoundsException | IllegalArgumentException  e) {
//        throw new IllegalArgumentException(e);
//        }