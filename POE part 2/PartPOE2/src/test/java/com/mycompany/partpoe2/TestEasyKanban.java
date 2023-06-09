/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partpoe2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class TestEasyKanban {
    private Task task1, task2;
    
    @Before
    public void setUp(){
        task1 = new Task("Task 1", "Task 1 is the test task", "Nath Han", 3, "");
        task2 = new Task("Task 2", "Task 2 is also the test task", "Jane Han", 5, "");
    }
    
    @Test
    public void testTaskDescription(){
        assertTrue(Task.checkTaskDescription("Successful task description"));
        assertFalse(Task.checkTaskDescription("Failure, less than 50 characters"));
        
    }
    
    @Test
    public void testTaskID(){
        assertEquals("NA:0:HAN", Task.createTaskID("Task A", 1, "Nath Han"));
        assertEquals("TB:2:HAN", Task.createTaskID("Task B", 2, "Jane Han"));
    }
    
    @Test
    public void testTotalHours(){
        PartPOE2.tasks = new Task[] {task1, task2};
        PartPOE2.numTasks = 2;
        assertEquals(8, PartPOE2.totalDuration());
    }
    
}
