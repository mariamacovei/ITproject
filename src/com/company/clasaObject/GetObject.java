package com.company.clasaObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

//dezserializarea ,citirea obiectului din file
public class GetObject {

    public static  void main (String[] args) {
        try {
            //permite sa deschidem fileul pentru citire
            FileInputStream fis = new FileInputStream("main.itProger");
            //citim din fisier
            ObjectInputStream ois = new ObjectInputStream(fis);
            Course[] objects = (Course[]) ois.readObject();
           // Course kotlin = (Course) ois.readObject();

            System.out.println(Arrays.toString(objects));
            //System.out.println(kotlin);

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

      }
}
