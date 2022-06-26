/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dental_Clinic_System;
        //Patient_System;

import static Dental_Clinic_System.Patient_System.joindate;
import static Dental_Clinic_System.Doctor.joindate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Hussain
 */
public class medicine {
    @Override
    public String toString() {
        return "medicine{" + "name=" + name + ", patient_id=" + patient_id +'}';
    }
   
    public medicine(String name,int age) {
        this.name = name;
        this.patient_id = patient_id;
      
        Calendar current = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MMM/dd HH:mm");
        
      //  joindate = formatter.format(current.getTime());
    }
    
    medicine (){
    }
    
    
    
   String name;
    int patient_id;
    
}




