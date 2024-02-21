package com.mycompany.pratice;

import java.util.*;

public class CollectionCrudArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int ch;
        List<CollectionCrudArrayList_Student> saveStudData = new ArrayList<>();
        do {
            System.out.println("Enter choice ");
            System.out.println("1. Insert ");
            System.out.println("2. Display ");
            System.out.println("3. Update ");
            System.out.println("4. Delete ");
            ch = sc.nextInt();
           
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter Id ");
                    int id = sc.nextInt();
                    
                    System.out.println("Enter Name ");
                    String name = sc1.nextLine();
                    
                    System.out.println("Enter Hobby ");
                    String hobby = sc1.nextLine();
                    
                    CollectionCrudArrayList_Student stud = new CollectionCrudArrayList_Student(id, name, hobby);
                    saveStudData.add(stud);
                    System.out.println(saveStudData);
                }
                
                case 2 -> {
                    Iterator<CollectionCrudArrayList_Student> iterator  =  saveStudData.iterator();
                    while (iterator.hasNext()) {
                        CollectionCrudArrayList_Student studentData = iterator.next();
                        System.out.println("Student Data " + studentData.toString());
                    }
                }
            }
        } while (ch != 0);
    }
}
