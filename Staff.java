
package staffmember;
public abstract class Staff {

    protected int id;
    protected String name;
    protected String address;
    
    public Staff(int id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;     
    }
    public int getId(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String id){ 
        
        this.name=name;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAdress(String address){
        this.address=address;
    }

    @Override
    public String toString(){
        return "ID= " +getId()+ "\nName= "+ getName()+ "\naddress = "+getAddress()+"\n";   
    }
}
   

    

    
    

    
    
    
    



  
