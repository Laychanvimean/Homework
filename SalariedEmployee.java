
package staffmember;
public class SalariedEmployee extends Staff {
    private double salary;
    private double bounus;
    public SalariedEmployee(int id, String name, String address,double salary,double bounus) {
        super(id, name, address);
        this.salary=salary;
        this.bounus=bounus;    
        }
    public void setSalary(double salary){
        this.salary=salary; 
        }
    public double getSalary(){
        return salary;
        }
    public void setBouns(double bonus){
        this.bounus=bounus;
        }
    public double getBouns(){
        return bounus;
        }
  
    @Override
    public String toString(){
        return "ID= " +getId()+ "\nName= "+ getName()+ "\naddress = "+getAddress()+ "\nSalary="+getSalary()+"\nBounus= "+getBouns()+"\npayment="+getPayment();
        }
    public double payment;
    
    public void setPayment(double payment){
        this.payment=payment;
    }
    public double getPayment(){
        return getSalary() + getBouns(); 
    }
}
