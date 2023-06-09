/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe2part;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class POE2Part {

    public static void main(String[] args) {
        //Display the welcome message
        JOptionPane.showMessageDialog(null, "Wlecome to EasyKanban");
        
        //User promp to the amount of tasks added
        int numberOfTask = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of tasks added:"));
        //Arraylist that stores the tasks
        ArrayList<Task> tasksList = new ArrayList<>();
        // loop for thr input of tasks
        for (int i = 0; i < numberOfTask; i++){
            
            String taskName = JOptionPane.showInputDialog("Enter the task name:");
            String developerDetails = JOptionPane.showInputDialog("Enter the developer's details(first name and last name:");
            double taskDuration = Double.parseDouble(JOptionPane.showInputDialog("Enter the task duration:"));
            String taskDescription = "";
            boolean invalidDescr = true;
            // loop through the inputs, can't be more than 50 characters
            while(invalidDescr){
                taskDescription = JOptionPane.showInputDialog("Enter the task description:");
                if (taskDescription.length() > 50){
                    JOptionPane.showMessageDialog(null, "Please enter task description less than 50 characters:");
                    
                }else{
                    invalidDescr = false;
                }
            }
            
            //created a task class and added it to the task list
            Task task = new Task(taskName, developerDetails, taskDuration, taskDescription);
            tasksList.add(task);
            //print details
            JOptionPane.showMessageDialog(null, task.printTaskDetials());
            // calculted the total duration of all tasks
            double totalDuration = 0;
            for (Task tasksList1 : tasksList) {
                totalDuration += task.getTaskDuration();
            }
            // display total duration
            JOptionPane.showMessageDialog(null, "Total duration of all tasks:" + totalDuration);
        }
        
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