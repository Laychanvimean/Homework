
package staffmember;

public class Volunteer extends Staff {

    public Volunteer(int id, String name, String address) {
         super(id, name, address);
    }
    public void setId(int id)
    {
        this.id = id;
    }  
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.name= name;
    }
    public String getAddress(){
        return address;
    }
    @Override
        public String toString(){
         return "ID= " +getId()+ "\nName= "+ getName()+ "\naddress = "+getAddress()+"\n";   
    }
}

