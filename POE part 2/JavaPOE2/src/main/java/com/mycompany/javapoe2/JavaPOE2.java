/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javapoe2;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class JavaPOE2 {

    public static void main(String[] args) {
         
        JOptionPane.showMessageDialog(null,"Welcome to EasyKanban");
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks"));
        String[] options = {"Add tasks", "Show reports", "Quit"};
        String[] tasks = new String[numTasks];
        int choice;
        int taskCount = 0;
        int totalHours = 0;
        boolean quit = false;
        
        do{
            choice = JOptionPane.showOptionDialog(null, "Select an option:", "Task Manager", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            switch (choice){
                case 0 -> {
                    if (taskCount < numTasks){
                        String taskName = JOptionPane.showInputDialog("Enter the Task name:");
        String taskDescription = JOptionPane.showInputDialog("Enter the task description");
        String developerDetails = JOptionPane.showInputDialog("Enter the developer's details");
        double taskDuration = Double.parseDouble(JOptionPane.showInputDialog("Enter the duration(In hours)"));
        String[] taskStatusOptions = {"To Do", "Doing", "Done"};
        String taskStatus = (String)JOptionPane.showInputDialog(null, "Select task status:", "Task Status", JOptionPane.QUESTION_MESSAGE, null, taskStatusOptions, taskStatusOptions[0]);
        JOptionPane.showMessageDialog(null, "The task name:" + taskName + "The task description:" + " " + taskDescription + "The developer details:" + " " + developerDetails + "The task duration:" + " " + taskDuration);
        
                    }
                    for (int i = 0; i < numTasks; i++){
                        tasks [i] = JOptionPane.showInputDialog("Enter task #" + (i + 1) + ":");
                    }
                    JOptionPane.showMessageDialog(null, "Task added successfully");
                }
                case 1 -> {
                    String report = "Task Report: \n";
                    for (int i = 0; i < numTasks; i++){
                        report += (i + 1) + "." + tasks[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, "Coming Soon");
                }
                case 2 -> {
                    quit = true;
                }
                default -> JOptionPane.showMessageDialog(null, "Goodbye");
            }
        } while (choice != 2);
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
    


    
   
