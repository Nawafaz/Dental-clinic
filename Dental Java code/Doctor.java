/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dental_Clinic_System;

import static Dental_Clinic_System.Patient_System.input;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.text.*;
/**
 *
 * @author Hussain
 */
public class Doctor extends doctorINFO{
    static String joindate;
    String Join;
    static int numDoc=0;
    String Spiecality;
    private int exp;
    boolean found;

    public void setExp(int exp) {
        this.exp = exp;
    }

    
    public int getExp() {
        return exp;
    }

    public Doctor(String Join, String Spiecality, int exp, boolean found, String name, int age, int ID, String gender, String status) {
        super(name, age, ID, gender, status);
        this.Join = Join;
        this.Spiecality = Spiecality;
        this.exp = exp;
        this.found = found;
    }

    public Doctor() {
        
    }

    @Override
    public void BloodType (){
        Scanner Input = new Scanner(System.in);
        System.out.print("Blood Type: ");
        BloodType = Input.next();
    }
    
    public Boolean AddDoc(ArrayList<Doctor> Doctors){
        Doctor Test = new Doctor();
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the new Doctor's Data:\nName: ");
        Test.name= Input.next();
        System.out.print("Age: ");
        Test.age= Input.nextInt();
        System.out.print("ID: ");
        Test.ID= Input.nextInt();
        System.out.print("Gender: ");
        Test.gender= Input.next();
        System.out.print("Status: ");
        Test.status= Input.next();
        System.out.print("Spiecality: ");
        Test.Spiecality= Input.next();
        System.out.print("Exp(years): ");
        Test.exp= Input.nextInt();
        Test.Join = Doctor.joindate;
        Test.BloodType();
        
        Doctors.add(Test);
        return true;
    } 

    public void ListofDoc(ArrayList<Doctor> Doctors){
        for(int k = 0; k<Doctors.size() && !found;k++){
            System.out.print(Doctors.get(k).name+" ");
            System.out.print(Doctors.get(k).age+" ");
            System.out.print(Doctors.get(k).gender+" ");
            System.out.print(Doctors.get(k).ID+" ");
            System.out.print(Doctors.get(k).Spiecality+" ");
            System.out.print(Doctors.get(k).getExp()+" ");
            System.out.print(Doctors.get(age).BloodType+" ");
            System.out.println(Doctors.get(k).Join+" ");
            
        }
        System.out.println("Overall, there is "+ numDoc + " Doctors In our System");
    }
    
    public int DocFind(ArrayList<Doctor> Doctors){
        Scanner input= new Scanner(System.in);
        found = false;
        System.out.print("Enter the wanted Doctor's ID: ");
        int x = input.nextInt(), k;
        for(k = 0; k<Doctors.size() && !found;k++){
            if(x == Doctors.get(k).ID){
                found = true;
                System.out.println("Name"+Doctors.get(k).name);
                System.out.println(Doctors.get(k).age);
                System.out.println(Doctors.get(k).gender);
                System.out.println(Doctors.get(k).ID);
                System.out.println(Doctors.get(k).status);
                System.out.println(Doctors.get(k).Spiecality);
                System.out.println(Doctors.get(k).getExp());
                System.out.println(Doctors.get(age).BloodType+" ");
            }
        }
        if (!found){
            System.out.println("There's no such Doctor with that ID\n    Look up the List of Doctors");
            return -1;
        }
            return k;
    } 
    
    public boolean DeleteDoc(ArrayList<Doctor> Doctors, int Index){
        char Choice;
        Scanner Input= new Scanner(System.in);
        System.out.println("Are You Sure: [Y/N]");
        Choice = Input.next().charAt(0);
        if (Choice == 'Y' || Choice == 'y'){
            Doctors.remove(Index);
            return true;
        }
        return false;       
    } 
    
    public boolean DeleteDoc(ArrayList<Doctor> Doctors){
        char Choice;
        Scanner Input= new Scanner(System.in);
        System.out.println("Are You Sure: [Y/N]");
        Choice = Input.next().charAt(0);
        if (Choice == 'Y'){
            Doctors.clear();
            return true;
        }
        return false;
    } 

    public void UpdateDoc(ArrayList<Doctor> Doctors, int Index){
        System.out.println("Enter patient id");
        int idSearch = input.nextInt();

        boolean found = false;
        for (int i = 0; i < Doctors.size(); i++) {

            if (idSearch == Doctors.get(i).ID && !found) {

                found = true;
                System.out.println("1- Update name : \n" + "2- Update id : \n" + "3- Update gender : \n" + "4- Update age : \n" + "5- Update Spiecality : \n" + "6- Update Blood Type :");
                int Num = input.nextInt();
                switch (Num) {
                    case 1:
                        input.nextLine();
                        System.out.println("Enter new name :");
                        Doctors.get(i).name = input.nextLine();
                        Doctors.get(i).Join = Patient_System.joindate;
                        break;
                    case 2:
                        input.nextLine();
                        System.out.println("Enter new id : ");
                        Doctors.get(i).ID = input.nextInt();
                        Doctors.get(i).Join = Patient_System.joindate;
                        break;
                    case 3:
                        input.nextLine();
                        System.out.println("Enter new gender :");
                        Doctors.get(i).gender = input.next();
                        Doctors.get(i).Join = Patient_System.joindate;
                        break;
                    case 4:
                        input.nextLine();
                        System.out.println("Enter new age :");
                        Doctors.get(i).age = input.nextInt();
                        break;
                    case 5:
                        input.nextLine();
                        System.out.println("Enter new Spiecality :");
                        Doctors.get(i).Spiecality = input.nextLine();

                        Doctors.get(i).Join = Patient_System.joindate;
                        break;
                    case 6: 
                        input.nextLine();
                        System.out.println("Enter new Blood Type :");
                        Doctors.get(i).BloodType();
                        break;
                    default:
                        System.out.println("Invalde input");

                }

            }

        }
        if (!found) {
            System.out.println("Id not found ");
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "Doc{" + "Spiecality=" + Spiecality + " exp=" + exp + '}';
        }
    
    public static void main(String[] args) {
        Calendar current = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MMM/dd HH:mm");
        joindate = formatter.format(current.getTime());
        
        char Choice, miniChoice;
        Doctor Admin = new Doctor();
        ArrayList<Doctor> Doctors = new ArrayList<>();
//        Doctors.add(Admin);
        Scanner Input = new Scanner(System.in);
//        Choice = Input.next().charAt(0);
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n|                    Welcome to our Dental Clinic System                   |\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\t1 to enter Doctor System"
                + "\n\t2 to enter Patient System"
                + "\n\t3 to enter Medicine System"
                + "\n\t4 to Exit");
            Choice = Input.next().charAt(0);
            
            switch(Choice){//Patient or Medicine or Doctor
                case '1':{
                    do {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n|       Welcome to our Dental Clinic Doctors Administration System      |\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                            + "\n\t1 to Add new Doctors Record"
                            + "\n\t2 to Update Doctor Records"
                            + "\n\t3 to Delete a Doctor Record"
                            + "\n\t4 to Print all Doctor Records"
                            + "\n\t5 to Exit the Doctor System");
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
                            System.out.println("Update Done");
                            break;
                        }
                        case '3':{
                            System.out.println("Do You Want to Delete one Doctor Record or All Doctor Records:"
                                    + "\n\t 1 to Delete one Record"
                                    + "\n\t 2 to Delete All Records");
                            Choice = Input.next().charAt(0);
                            switch(Choice){
                                case '1': 
                                    int Index = Admin.DocFind(Doctors);
                                    if (Index >= 0) 
                                        if (Admin.DeleteDoc(Doctors, Index-1))
                                            numDoc--;
                                    continue;
                                case '2':
                                    if (Admin.DeleteDoc(Doctors));
                                        numDoc--;
                                    continue;
                                default:
                                    System.out.println("    Wrong Input\nExiting Delete Mode");
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
                }
                break;
                
                case '2':{ // Patients
                    break;
                }
                case '3':{ // Medicine
                    break;
                }
                case '4':{
                    return ;
                }
                default:{
                    System.out.println("\tInvalid Input\nPress 4 to quit the Clinic System");
                }
            }
        } while (Choice != '4');
    }
}










