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
public class patient {
    @Override
    public String toString() {
        return "patient{" + "name=" + name + ", age=" + age +'}';
    }
   
    public patient(String name,int age) {
        this.name = name;
        this.age = age;
      
        Calendar current = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MMM/dd HH:mm");
        
      //  joindate = formatter.format(current.getTime());
    }
    
    patient (){
    }
    
    
    
   String name;
    int age;
    
}




