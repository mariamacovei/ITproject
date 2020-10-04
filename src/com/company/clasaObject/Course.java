package com.company.clasaObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
//serializarea salvarea obiectululi in file
public class Course implements Serializable {
    private  int id;
    private String title;

    public Course(int id,String title) {
        this.id = id;
        this.title = title;
    }

    public String toString() {
        return id + "- " + title;
    }

    public boolean equals(Object obj) {
        Course course = (Course) obj;
        return id == course.id;

    }

    public static  void main ( String[] args){
        Course[] objects = {
            new Course(1,"android"),
            new Course(2,"kotlin")
        };
        //pentru deschiderea file sau inchidere
        try {
            FileOutputStream fos = new FileOutputStream("main.itProger");
            //serializarea obiectului
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //pentru a indeplini serealizarea
            oos.writeObject(objects);
          //  oos.writeObject(kotlin);

            //inchidem Outputstream
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        List<Course> listOfCourses = new ArrayList<>();
//        listOfCourses.add(new Course(1,"android"));
//        listOfCourses.add(new Course(2,"kotlin"));
//
//        printList(listOfCourses);
//
//        List<Lessons> listOfLessons = new ArrayList<>();
//        listOfLessons.add(new Lessons(1,"android"));
//        listOfLessons.add(new Lessons(2,"kotlin"));
//
//        printList(listOfLessons);
//
//        System.out.println(android);
//        System.out.println(kotlin);
//        System.out.println(android.equals(kotlin));
//
//        String str = "Hello";
//        String str2 = "Hello";
//        System.out.println(str.equals(str2));
//
//    }
//    public static void printList(List<? extends Course> list) {
//        for(Course el : list) {
//            System.out.println(el);
//
//        }
    }
}
