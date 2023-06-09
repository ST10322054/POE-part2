/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partpoe2;

import static com.mycompany.partpoe2.PartPOE2.taskNumber;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
class Task {
    private String taskName;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    
    public Task(String taskName, String taskDescription, int taskDuration, String taskID){
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskID = taskID;
        
    }
    public static boolean checkTaskDescription(String taskDescription){
        if (taskDescription.length() > 50){
            JOptionPane.showMessageDialog(null, "Please enter task description less than 50 characters");
            return false;
        }
        return true;
    }
    public static String createTaskID(String taskName, int taskNumber, String developerDetails){
        String taskID = "";
        taskID += taskName.substring(0, 2);
        taskID += ":";
        taskID += taskNumber;
        taskID += ":";
        taskID += developerDetails.substring(developerDetails.length() -3);
        return taskID.toUpperCase();
    }

    Task(String taskName, String taskDescription, String developerDetails, int taskDuration, String taskID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String printTaskDetails(){
        String message = "";
        message += "Task Status: To Do\n";
        message += "Developer Details:" + developerDetails + "\n";
        message += "Task Number:" + (taskNumber-1) + "\n";
        message += "Task Name:" + taskName + "\n";
        message += "Task Description:" + taskDescription + "\n";
        message += "TaskID:" + taskID + "\n";
        message += "Task Duration:" + taskDuration + "hours\n";
        return message;
        
    }
    public int getTaskDuration(){
        return taskDuration;
    }
    
}
