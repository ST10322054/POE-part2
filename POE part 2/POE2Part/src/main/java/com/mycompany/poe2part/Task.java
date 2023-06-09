/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe2part;

/**
 *
 * @author lab_services_student
 */
class Task {
    private static int taskCount = 0;
    private static final String TASK_ID_PREFIX = "TK";
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private double taskDuration;
    private String developerDetails;
    private String taskID;
    private String taskStatus;
    
    Task(String taskName, String developerDetails, double taskDuration, String taskDescription){
        this.taskName = taskName;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskDescription = taskDescription;
        this.taskNumber = taskCount++;
        this.taskID = createTaskID(TASK_ID_PREFIX);
        this.taskStatus = "To Do";
    }
    boolean checkTaskDescritption(){
        return taskDescription.length()<= 50;
    }
    String createTaskID(String prefix){
      String prefixString = prefix + "-";
      String developerInitials = developerDetails.substring(0, 2).toUpperCase();
      String developerLastName = developerDetails.substring(developerDetails.lastIndexOf(" ") + 1);
      String taskIDNumber = String.format("%03d", taskNumber);
      return prefixString + developerInitials + ":" + taskIDNumber + ":" + developerLastName.toUpperCase();
    }
    String printTaskDetials(){
        return "Task status:" + taskStatus + "\nDeveloperDetails:" + developerDetails + "\nTask number:" + taskNumber + "\nTask name:" + taskName + "\nTask description:" + taskDescription + "\nTask ID:" + taskID + "\nTask duration:" + taskDuration;
}
    double getTaskDuration(){
        return taskDuration;
        
    }
}

