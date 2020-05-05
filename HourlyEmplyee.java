
package staffmember;
public class HourlyEmplyee extends Staff {
    private int hoursworked;
    private double rate;

    public HourlyEmplyee(int id, String name, String address,int hoursworked ,double rate) {
        super(id, name, address);
        this.hoursworked=hoursworked;
        this.rate=rate;             
        }
    public void sethoursworked(int hoursworked){
         this.hoursworked = hoursworked;
     }
    public int getHoursworked(){
         return hoursworked;
     }
    public void setRate(double rate){
         this.rate = rate;
     }
    public double getRate(){
         return rate;
     }
     @Override
    public String toString(){ 
        return "ID= " +getId()+ "\nName= "+ getName()+ "\naddress = "+getAddress()+ "\nhoursworked="+getHoursworked()+"\nRate= "+getRate()+"\npayment="+getPayment();
        }
    public double payment;
    
    public void setPayment(double payment){
        this.payment=payment;
    }
    public double getPayment(){
      return getHoursworked() + getRate();
    }
  

}

