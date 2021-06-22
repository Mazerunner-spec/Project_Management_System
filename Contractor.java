
public class Contractor extends Person {

    

    public Contractor( String name,  String surname, int telephoneNumber,  String emailAddress, String physicalAddress){
    	   super(name, surname, telephoneNumber, emailAddress, physicalAddress);

           

        } 

        public void setcustomerInv(){

            this.customerInv = customerInv;

    }
    
    public String toString(){
        String output = "Customer Name: " + name;
        output += "\nPhone Number: " +  telephoneNumber;
        output += "\nEmail Address: " + emailAddress;
        output += "\nPhysical Address: " + physicalAddress;
     //   output += "\nCustomer Invoice: " + customerInv;
        return output;
    }

}
