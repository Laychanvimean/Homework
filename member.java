
package staffmember;
public class member {
    protected int id;
    protected String name;
    protected String address;
    protected int hoursworked;
    protected double rate;
    protected double salary;
    protected double bonus;
     public int getId(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){ 
        
        this.name=name;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAdress(String address){
        this.address=address;
    }
    public int getHoursworked(){
        return hoursworked;
    }
    public void setHoursworked(int hoursworked){
        this.hoursworked=hoursworked;
    }
    public double getRate(){
        return rate;
    }
    public void setRate(double rate){
        this.rate=rate;
    }
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    public double getBonus(){
        return bonus;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
        
    }
    private double payment;
    private double pay;
    
    public void setPayment(double payment){
        this.payment=payment;
    }
    public double getPayment(){
      return getHoursworked() + getRate();
     
    }
     public void setPay(double payment){
        this.payment=payment;
    }
    public double getPay(){
      return getSalary() + getBonus();
     
    }
   
}


