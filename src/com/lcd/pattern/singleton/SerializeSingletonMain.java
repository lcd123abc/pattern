package com.lcd.pattern.singleton;

import java.io.*;

public class SerializeSingletonMain {
    public static void main(String[] args) throws IOException {
        HungrySingleton instance = HungrySingleton.getInstance();
        //Write Obj to File
        System.out.println(instance);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
            oos.writeObject(instance);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }

        //Read Obj from File
        File file = new File("tempFile");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            HungrySingleton newInstance = (HungrySingleton) ois.readObject();
            System.out.println(newInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            ois.close();
        }
    }
}
