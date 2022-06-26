/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dental_Clinic_System;

import static Dental_Clinic_System.Patient_System.joindate;
import static Dental_Clinic_System.Doctor.joindate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Hussain
 */
public class doctorINFO  {
    @Override
    public String toString() {
        return "doctorINFO{" + "name=" + name + ", age=" + age + ", ID=" + ID + ", gender=" + gender + ", status=" + status + '}';
    }
    public doctorINFO(String name, int age, int ID, String gender, String status) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.status = status;
        Calendar current = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MMM/dd HH:mm");
      //  joindate = formatter.format(current.getTime());
    }
    
    doctorINFO (){
    }
    
    public void BloodType (){
        BloodType = " ";
    }
    
    String name;
    int age;
    int ID;
    String gender;
    String status;
    String BloodType;
}




