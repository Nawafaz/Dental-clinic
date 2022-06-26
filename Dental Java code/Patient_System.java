package Dental_Clinic_System;

//import Dental_Clinic_System.Patient_System.joindate;
import java.text.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author hasoo
 */
public class Patient_System extends patient {

    static ArrayList<Patient_System> array = new ArrayList<Patient_System>();
    static String joindate;
    static Scanner input = new Scanner(System.in);
    String name;
    String ill;
    int age;
    String gender;
    int patientID;
    String Medicine;
    String BloodType;

   // @Override
    public void BloodType (){
        
        Scanner Input = new Scanner(System.in);
        System.out.print("Blood Type: ");
        BloodType = Input.next();
    }
    
    public static void main(String[] args) {

        Calendar current = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MMM/dd HH:mm");
        joindate = formatter.format(current.getTime());
  ArrayList<Patient_System> array = new ArrayList<Patient_System>();
        int press;

        do {

            Patient_System p = new Patient_System();
            System.out.println("  Enter 1 to add Patient :\n" + "  Enter 2 to display Patient :  \n  " + "Enter 3 to search :  \n" + "  Enter 4 to update : \n" + "  Enter 5 to delete : \n" + "  Enter 6 to  Add Medicine :\n" + "  Enter 7 to  Exit :");

            press = input.nextInt();

            switch (press) {

                case 1:
                    p.AddPatient(array);
                    break;
                case 2:
                    p.diplayPatient(array);
                    break;
                case 3:
                    p.SearchPatient(array);
                    break;
                case 4:

                    p.Updatepatient(array);
                    break;
                case 5:
                    p.deletepatient(array);
                    break;

                case 6:
                    p.AddMedicine(array);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("invalde input");
            }

        } while (press != 7);

    }


    Patient_System(String name, int patientID, String gender, String ill, int age, String joindate) {
        this.name = name;
        this.gender = gender;
        this.ill = ill;
        this.age = age;
        Patient_System.joindate = joindate;
        this.patientID = patientID;
    }

    Patient_System() {
    }

  public boolean AddMedicine(ArrayList<Patient_System> array){
 
        //    Scanner input = new Scanner(System.in);
       // p1.patientID = patientID + 1;
       // input.nextLine();
        System.out.print("Medicine name: ");
        String ss = input.next();
        System.out.print("patientID: ");
        int patientID_tmp = input.nextInt();
        //input.nextLine();
        //System.out.print(ss);

        for(int i=0;i<array.size();i++)
        	if(array.get(i).patientID==patientID_tmp)
        	{
        		
        		array.get(i).Medicine=ss ;
	
        	}
        //Patient_System.joindate = Patient_System.joindate;

        //array.add(p1);
        return true;
      
      
      
      
}
    
   public boolean AddPatient(ArrayList<Patient_System> array) {
        Patient_System p1 = new Patient_System();
        //    Scanner input = new Scanner(System.in);
       // p1.patientID = patientID + 1;
       // input.nextLine();
        System.out.print("ID: ");
        p1.patientID = input.nextInt();
        p1.patientID=p1.patientID;
        System.out.print("Name: ");
        p1.name = input.next();
       
//        input.nextLine();
        System.out.print("Age: ");
        p1.age = input.nextInt();
        input.nextLine();
        System.out.print("Gender: ");
        p1.gender = input.next();
        System.out.print("Illness: ");
        p1.ill = input.next();
        p1.BloodType();
        Patient_System.joindate = Patient_System.joindate;

        array.add(p1);
        return true;
    }

   public void diplayPatient(ArrayList<Patient_System> array) {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("patient-ID\tPatient-Name\tAge\tgender\tIllness\tBlood-Type\tJoin-date\tMedicine");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).patientID + "\t\t"
                    + array.get(i).name + "\t\t"
                    + array.get(i).age + "\t\t"
                    + array.get(i).gender + "\t\t"
                    + array.get(i).ill + "\t\t"
                    + array.get(i).BloodType + "\t\t"
                    + Patient_System.joindate+ "\t\t"
                    + array.get(i).Medicine);
        }
    }

    public void SearchPatient(ArrayList<Patient_System> array) {
//            Scanner input = new Scanner(System.in);
        System.out.println("Enter patient id");
        int idSearch = input.nextInt();
        boolean found = false;
        for (int i = 0; i < array.size(); i++) {

            if (idSearch == array.get(i).patientID && !found) {
                found = true;
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("patient-ID  Patient-Name  Age  gender  Illness  Join-date");
                System.out.println("----------------------------------------------------------------------------------");

                    System.out.println(array.get(i).patientID + "\t\t"
                    + array.get(i).name + "\t  "
                    + array.get(i).age + "\t"
                    + array.get(i).gender + "\t"
                    + array.get(i).ill + "\t"
                    + array.get(i).BloodType + "\t"
                    + Patient_System.joindate);
                

            }
        }
        if (!found) {
            System.out.println("id not found ");
        }
    }

    public void Updatepatient(ArrayList<Patient_System> array) {

//            Scanner input = new Scanner(System.in);
        System.out.println("Enter patient id");
        int idSearch = input.nextInt();

        boolean found = false;
        for (int i = 0; i < array.size(); i++) {

            if (idSearch == array.get(i).patientID && !found) {

                found = true;
                System.out.println("1- Update name : \n" + "2- Update id : \n" + "3- Update gender : \n" + "4- Update age : \n" + "5- Update ill : \n" + "6- Update Blood Type :");
                int Num = input.nextInt();
                switch (Num) {
                    case 1:
                        input.nextLine();
                        System.out.println("Enter new name :");
                        array.get(i).name = input.nextLine();

                        Patient_System.joindate = Patient_System.joindate;
                        break;
                    case 2:
                        input.nextLine();
                        System.out.println("Enter new id : ");
                        array.get(i).patientID = input.nextInt();

                        Patient_System.joindate = Patient_System.joindate;
                        break;
                    case 3:
                        input.nextLine();
                        System.out.println("Enter new gender :");
                        array.get(i).gender = input.next();
                        Patient_System.joindate = Patient_System.joindate;
                        break;
                    case 4:
                        input.nextLine();
                        System.out.println("Enter new age :");
                        array.get(i).age = input.nextInt();
                        break;
                    case 5:
                        input.nextLine();
                        System.out.println("Enter new ill :");
                        array.get(i).ill = input.nextLine();

                        Patient_System.joindate = Patient_System.joindate;
                        break;
                    case 6: 
                        input.nextLine();
                        System.out.println("Enter new Blood Type :");
                        array.get(i).BloodType();
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

    public int deletepatient(ArrayList<Patient_System> array) {

//            Scanner input = new Scanner(System.in);
        System.out.println("\t1 to Delete one Patient Record"
                + "\n\t2 to Delete all Patient Records"
                + "\nYour Choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter patient id");
                int idSearch = input.nextInt();
                boolean found = false;
                for (int i = 0; i < array.size(); i++) {

                    if (idSearch == array.get(i).patientID && !found) {
                        found = true;
                        array.remove(i);
                        return 1;
                    }

                }
                if (!found) {
                    System.out.println("Id not found ");
                    return -1;
                }
                break;
            case 2:
                array.clear();
                return 0;
            default:
                System.out.println("Invlade input");
                return -1;
        }
        return -1;
    }

   
}
