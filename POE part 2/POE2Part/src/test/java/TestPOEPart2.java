
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class TestPOEPart2 {
    //Calling the methods 
    @Test
            public void checkTaskDescritption(){
                boolean success = testTaskDuration(taskDuration);
                if (success){
                    JOptionPane.showMessageDialog(null, "Task successfull");
                }else{
                    JOptionPane.showMessageDialog(null, "Type it right, please");
                }
                
                
            }
    
}
