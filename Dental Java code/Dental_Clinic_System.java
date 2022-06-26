/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dental_Clinic_System;

import static Dental_Clinic_System.Doctor.joindate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


/**
 *
 * @author Hussain
 */
public class Dental_Clinic_System extends doctorINFO{
    static int numDoc;
    static int numPat;
    static int numMed;
    
    public static void main(String[] args) {
        Calendar current = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MMM/dd HH:mm");
        joindate = formatter.format(current.getTime());
        
        System.out.println("..");
        int index = 0;
        boolean flag = false;
        char Choice, miniChoice, superminiChoice;
        Doctor Admin = new Doctor();
        doctorWORKINGINFO INFO = new doctorWORKINGINFO();
        Patient_System p = new Patient_System();
        p.joindate=joindate;
        ArrayList<Patient_System> array = new ArrayList<>();
        ArrayList<Doctor> Doctors = new ArrayList<>();
        
        Scanner Input = new Scanner(System.in);
        do {
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n|                    Welcome to our `Dental Clinic System                   |\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\t1 to enter Doctor System"
                + "\n\t2 to enter Patient System"
                + "\n\t3 to Exit"
                + "\nYour Choice: ");
            Choice = Input.next().charAt(0);
            switch(Choice){//Patient or Medicine or Doctor
                case '1':{
                    do {
                        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n|       Welcome to our ` Dental Clinic's Doctor System Administration       |\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                            + "\n\t1 to Add new Doctors Record"
                            + "\n\t2 to Update Doctor Records"
                            + "\n\t3 to Delete a Doctor Record"
                            + "\n\t4 to Print all Doctor Records"
                            + "\n\t5 to Exit the Doctor System"
                            + "\nYour Choice: ");
                    miniChoice = Input.next().charAt(0);
                    switch(miniChoice){
                        case '1':{
                            if (Admin.AddDoc(Doctors))
                                numDoc++;
                            break;
                        }
                        case '2':{
                            int Index = Admin.DocFind(Doctors);
                            if (Index >= 0)
                                Admin.UpdateDoc(Doctors,Index-1);
                            else
                                System.out.println("\tWrong Input\nExiting Update Mode");
                            break;
                        }
                        case '3':{
                            System.out.print("Do You Want to Delete one Doctor Record or All Doctor Records:"
                                    + "\n\t 1 to Delete one Record"
                                    + "\n\t 2 to Delete All Records"
                                    + "\nYour Choice: ");
                            superminiChoice = Input.next().charAt(0);
                            switch(superminiChoice){
                                case '1': 
                                    int Index = Admin.DocFind(Doctors);
                                    if (Index >= 0) 
                                        if (Admin.DeleteDoc(Doctors, Index-1))
                                            numDoc--;
                                    break;
                                case '2':
                                    if (Admin.DeleteDoc(Doctors));
                                        numDoc*= 0;
                                    break;
                                default:
                                    System.out.println("\tWrong Input\nExiting Delete Mode");
                            }
                            break;
                        }
                        case '4':{
                            Admin.ListofDoc(Doctors);
                            break;
                        }
                        case '5':{
                            break;
                        }
                        default:
                            System.out.println("\tInvalid Input\nPress 5 to quit the Doctors' System");
                        }
                    } while(miniChoice != '5');
                    break;
                }
                case '2':{ // Patients
                    do{
                        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n|       Welcome to our Dental Clinc's Patients System Administration       |\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                                + "\n\t1 to add a new Patient Record"
                                + "\n\t2 to display all Patient Records"
                                + "\n\t3 to search for a Patient Record"
                                + "\n\t4 to update Patient Record"
                                + "\n\t5 to delete Patient Record"
                                + "\n\t6 to Add a Medicine"
                                + "\n\t7 to Exit Patient System"
                                + "\nYour Choice: ");
                        miniChoice = Input.next().charAt(0);
                        switch (miniChoice) {
                            case '1':
                                if(p.AddPatient(array))
                                    numPat++;
                                break;
                            case '2':
                                p.diplayPatient(array);
                                System.out.println("There is "+ numPat + " Patients in the Clinic");
                                break;
                            case '3':
                                p.SearchPatient(array);
                                break;
                            case '4':  
                                p.Updatepatient(array);
                                break;
                            case '5':
                                if(p.deletepatient(array) == 1)
                                    numPat--;
                                else if (p.deletepatient(array) == 0)
                                    numPat*= 0;
                                break;
                            case '6':
                                p.AddMedicine(array);
                                break;
                            case '7':
                                break;
                            default:
                                System.out.println("\tInvalde Input\nPress 6 to quit the Patients' System");
                        }
                    } while (miniChoice != '7');
                    break;
                }
                case '3' :{
                    return ;
                }
                default:{
                    System.out.println("\tInvalid Input\nPress 3 to quit the Clinic System");
                }
            }
        } while (Choice != '3');
    }

    private static class doctorWORKINGINFO {

        public doctorWORKINGINFO() {
        }
    }
}
