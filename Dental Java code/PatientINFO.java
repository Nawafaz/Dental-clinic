/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dental_Clinic_System;

import static Dental_Clinic_System.Patient_System.input;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author hasoo
 */
   
public class PatientINFO extends patient {
          @Override
          public String toString() {
        return "patient{" + ", ID=" + ID + ", gender=" + gender + ", status=" + status +"Medicine="+Medicine+"MedicineID="+MedicineID +'}';
          }
          

     public PatientINFO(int ID, String gender, String status,String Medicine, int MedicineID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.status = status;
        this.Medicine = Medicine;
        this.MedicineID = MedicineID;
        Calendar current = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MMM/dd HH:mm");
        
       
    }
     
     public void BloodType (){
        BloodType = " ";
    
     }
    int ID;
    String gender;
    String status;
    String BloodType;
    String Medicine;
    int MedicineID;

}