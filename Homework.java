
package staffmember;

import java.util.ArrayList;
import java.util.Scanner;
 
public class Homework {
    static int index = 1; 
    static Staff arrStaff[];
    public static void inti(){
        ArrayList<Staff> Staffs = new ArrayList<Staff>();     
        Staff stf1 = new Volunteer(1 ,"vimean", "chbar om pov");
        Staff stf2 = new SalariedEmployee(2 ,"junnie", "toul kok",1,45);
        Staff stf3 = new HourlyEmplyee(3 ,"panha", "Battombong",1,3);
        Staffs.add(stf2);
        Staffs.add(stf3);
        Staffs.add(stf1);
         for(Staff stf:Staffs){
            System.out.println(stf);
            System.out.println("-------------------------------------");
        }
}
    public static void Display(){
        System.out.println("1. Insert Empolyee");
        System.out.println("2. Edit");
        System.out.println("3. Remove");
        System.out.println("5. Exit");
        System.out.println("----------------------------------");
        System.out.print("Enter Option(1-4): ");  
        Scanner input = new Scanner(System.in);
        switch(input.nextInt()){
            case 1:    
                caseInsert();   
                break;               
            case 2:  
                caseEdit();
                break;
            case 3: 
                caseRemove();
                break;
            case 4:
                System.out.print("GoodBye \n");
                System.exit(0);
                break;
            default:
                break;
                
        }
    }
    private static void caseInsert(){
        System.out.println("1. Volunteer");
        System.out.println("2. Hourly Empolyee");
        System.out.println("3. Salaried Employee");      
        System.out.println("4. Back");
        System.out.println("----------------------------------");
        System.out.print("Enter Option(1-4): ");  
        Scanner input = new Scanner(System.in);
        switch(input.nextInt()){
            case 1: 
                casevolunter();
                break;  
            case 2:
                caseHourly();
                break;
            case 3:  
                casesalaried();
                break;
            case 4:
                Display();
                break;
            default:
                break;
                
        }
        
    }
    private static void casevolunter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("===========INSERT INFO===========");
        System.out.println("=>Enter  Member's ID: "+index);
        System.out.print("=>Enter Member's Name: ");
        String name = scan.next();
        System.out.print("=>Enter Member's Address: ");
        String address = scan.next();
        System.out.println("---------------------------------");
        for(int i=0;i<index;i++){
        member objVol = new member();
        objVol.setID(index);
        objVol.setName(name);
        objVol.setAdress(address);
        System.out.println("ID:"+objVol.getId());
        System.out.println("Name:"+objVol.getName());
        System.out.println("Addres:"+objVol.getAddress());
        System.out.println("----------------------------------");
    }
       caseInsert();
     
    }
    
    private static void caseHourly(){
        Scanner scan = new Scanner(System.in);
        System.out.println("===========INSERT INFO===========");
        System.out.println("=>Enter Empolyee's ID: "+index);
        System.out.print("=>Enter Empolyee's Name: ");
        String name = scan.next();
        System.out.print("=>Enter Employee's Address: ");
        String address = scan.next();
        System.out.print("=>Enter Hoursworked: ");
        int hourworked = scan.nextInt();
        System.out.print("=> Enter Rate: ");
        double rate = scan.nextInt();
        System.out.println("---------------------------------");
        for(int i=0;i<index;i++){
        member objmem = new member();
        objmem.setID(index);
        objmem.setName(name);
        objmem.setAdress(address);
        objmem.setHoursworked(hourworked);
        objmem.setRate(rate);
        System.out.println("ID:"+objmem.getId());
        System.out.println("Name:"+objmem.getName());
        System.out.println("Addres:"+objmem.getAddress());
        System.out.println("HourlyWord:"+objmem.getHoursworked());
        System.out.println("Rate:"+objmem.getRate());
        System.out.println("payment:"+objmem.getPayment());
        System.out.println("----------------------------------");
    }
        
        
    } 
    private static void casesalaried(){
        Scanner scan = new Scanner(System.in);
        System.out.println("===========INSERT INFO===========");
        System.out.println("=>Enter Empolyee's ID: "+index);
        System.out.print("=>Enter Empolyee's Name: ");
        String name = scan.next();
        System.out.print("=>Enter Employee's Address: ");
        String address = scan.next();
        System.out.print("=>Enter Salary:");
        double salary = scan.nextDouble();
        System.out.print("=>Enter Bounus:");
        double bonus = scan.nextDouble();
        for(int i=0;i<index;i++){
        member objmem = new member();
        objmem.setID(index);
        objmem.setName(name);
        objmem.setAdress(address);
        objmem.setSalary(salary);
        objmem.setBonus(bonus);
        System.out.println("----------------------------------");
        System.out.println("ID:"+objmem.getId());
        System.out.println("Name:"+objmem.getName());
        System.out.println("Addres:"+objmem.getAddress());
        System.out.println("Salary:"+objmem.getSalary());
        System.out.println("Bonus:"+objmem.getBonus());
        System.out.println("payment:"+objmem.getPay());
        System.out.println("----------------------------------");
    }
        
        
    }

    private static void caseEdit(){
        
    }
    private static void caseRemove(){
        
    }
    public static void main(String[] args) {
        inti();
        Display();
       

}


}
