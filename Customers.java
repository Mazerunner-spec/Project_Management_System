public class Customers extends Person {

    String customerInv;
    // Consructor with super class
    public Customers( String name,  String surname, int telephoneNumber,  String emailAddress, String physicalAddress, String customerInv){
    	   super(name, surname, telephoneNumber, emailAddress, physicalAddress);

           this.customerInv = customerInv;

        } 
        // Customer method with setter
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
