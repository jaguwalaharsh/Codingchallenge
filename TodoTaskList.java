package com.mycompany.pratice;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoTaskList {
    private ArrayList<TodoTask> tt = new ArrayList<>(); 
    
    public void addTask(String description) {
        TodoTask task = new TodoTask(description);
        tt.add(task);
    }
    
    public void getTask() {
        for (int i = 0; i < tt.size(); i++ ) {
            System.out.println(tt.get(i));
        }
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         TodoTaskList todoList = new TodoTaskList();
         Scanner sc1 = new Scanner(System.in);
         
         while (true) {
             System.out.println("1. Add Task ");
             System.out.println("2. Display Task ");
             System.out.println("3. Exit");
             System.out.println(" Enter yur choice ");
             
             int choice = sc.nextInt();
             
             switch(choice) {
                 case 1:
                     String desc = sc1.nextLine();
                     todoList.addTask(desc);
                     break;
                 case 2:
                     todoList.getTask();
                     break;
                 default: 
                     break;
             }
         }
    }
}
