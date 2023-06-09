/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.partpoe2;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PartPOE2 {
    static int taskNumber;
    static Task[] tasks;
    static int numTasks;

    public static void main(String[] args) {
        boolean loggedIn = login();
        if (loggedIn){
            //Displayed the menu options
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
            while (true){
                int choice = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                                Please select an option:
                                                                                1) Add Tasks
                                                                                2) Show Report
                                                                                3) Quit
                                                                                Enter a number for your choice"""));
                
                switch (choice) {
                    case 1 -> {
                        // Define tasks
                        numTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks do you want to enter:"));
                        tasks = new Task[numTasks];
                        for (int i = 0; i < numTasks; i++){
                            tasks[i] = addTask();
                        }   // Display tasks and duration
                        String taskDetails = "";
                        int totalDuration = 0;
                        for (int i = 0; i < numTasks; i++){
                            taskDetails += tasks[i].printTaskDetails() + "\n";
                            totalDuration += tasks[i].getTaskDuration();
                        }   JOptionPane.showMessageDialog(null, taskDetails + "\nTotal Duration of all tasks:" + totalDuration + "hours");
                    }
                    case 2 -> JOptionPane.showMessageDialog(null, "Coming Soon");
                    default -> System.exit(0);
                }
            }
        }
        
    }
    public static boolean login(){
        String username = "Nat_han";
        String password = "12Dan_K";
        int numTries = 0;
        while (numTries < 3){
            String enteredUsername = JOptionPane.showInputDialog(null, "Enter your username:");
            String enteredPassword = JOptionPane.showInputDialog(null, "Enter your password:");
            
            if (enteredUsername.equals(username) && enteredPassword.equals(password)){
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect username or password, try again");
                numTries++;
            }
        }
        JOptionPane.showMessageDialog(null, "Too many attempts. Exiting program");
        return false;
    }
    
    public static Task addTask(){
        // Prompt user details for tasks
        String taskName = JOptionPane.showInputDialog("Enter task name:");
        String taskDescription = JOptionPane.showInputDialog("Enter task descrption:");
        while (!Task.checkTaskDescription(taskDescription)){
            taskDescription = JOptionPane.showInputDialog("Please enter task description less than 50 characters");
        }
        String firstName = JOptionPane.showInputDialog("Enter first name of developer:");
        String lastName = JOptionPane.showInputDialog("Enter last name of developer:");
        String developerDetails = firstName + " " + lastName;
        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration (in hours):"));
        String taskID = Task.createTaskID(taskName, taskNumber, developerDetails);
        //Display the details
        String message = "";
        message += "Task Status: To Do\n";
        message += "Developer's Details:" + developerDetails + "\n";
        message += "Task Number:" + taskNumber + "\n";
        message += "Task Name:" + taskName + "\n";
        message += "Task Description" + taskDescription + "\n";
        message += "Task ID:" + taskID + "\n";
        message += "Task Duration:" + taskDuration + "hours\n";
        JOptionPane.showMessageDialog(null, message);
        
        taskNumber++;
        return new Task(taskName, taskDescription, developerDetails, taskDuration, taskID);
        
        
    }
}
// Reference List:
/*webucator.2023. Print in new line, Java. [Online].
Available at: https://www.webucator.com/article/how-to-write-a-unit-test-in-java/
[Accessed on 8 June 2023].

Farrel,J.2018. Print in new line, Java. 
Available at: Java Programming Ninth Edition
[Accessed on 9 June 2023].
*/