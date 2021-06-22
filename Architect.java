public class Architect extends Person {

   String customerInv;
    // Constructor and super class
    public Architect( String name,  String surname, int telephoneNumber,  String emailAddress, String physicalAddress){
    	   super(name, surname, telephoneNumber, emailAddress, physicalAddress);

           this.customerInv = customerInv;

        } 
        // Customer method setter
        public void setcustomerInv(){

            this.customerInv = customerInv;

   }
    @Override
    public String toString(){
        String output = "Customer Name: " + name;
        output += "\nPhone Number: " +  telephoneNumber;
        output += "\nEmail Address: " + emailAddress;
        output += "\nPhysical Address: " + physicalAddress;
        output += "\nCustomer Invoice: " + customerInv;
        return output;
    }

}
