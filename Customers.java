//public class Customers {
   // String custName;
   // String custNum;
   // String custEmail;
  //  String custAddress;

   // public Customers(String custName,String custNum, String custEmail,String custAddress){
        
      //  this.custName = custName;
      //  this.custNum = custNum;
      //  this.custEmail = custEmail;
      //  this.custAddress = custAddress;
  //  }

  //  public String getCustName(){
      //  return custName;
  //  }

 //   public String getCustNum(){
   //     return custNum;
  //  }

  //  public String getCustEmail(){
   //     return custEmail;
 //   }

  //  public String getCustAddress(){
     //   return custAddress;
   // }

  //  public String toString(){
     //   String output = "Customer Name: " + custName;
    //    output += "\nPhone Number: " + custNum;
    //    output += "\nEmail Address: " + custEmail;
    //    output += "\nPhysical Address: " + custAddress;
       // invoice add
     //   return output;
 //   }

//}
public class Customers extends Person {

    String customerInv;

    public Customers( String name,  String surname, int telephoneNumber,  String emailAddress, String physicalAddress, String customerInv){
    	   super(name, surname, telephoneNumber, emailAddress, physicalAddress);

           this.customerInv = customerInv;

        } 

        public void setcustomerInv(){

            this.customerInv = customerInv;

    }

    public String toString(){
        String output = "Customer Name: " + name;
        output += "\nPhone Number: " +  telephoneNumber;
        output += "\nEmail Address: " + emailAddress;
        output += "\nPhysical Address: " + physicalAddress;
        output += "\nCustomer Invoice: " + customerInv;
        return output;
    }

}
//package PoisedTaskManager;

//public class Customer {
	
	// Attributes.
  ////  static String name;
  ////  static String surname;
  ///  static String phoneNumber;
  ////  static String email;
 ////   static String physicalAddress;

    // Customer Method
 //   public Customer (String name, String surname, String phoneNumber, String email, String physicalAddress) {
    //    Customer.name = name;
    //    Customer.surname = surname;
     //   Customer.phoneNumber = phoneNumber;
      //  Customer.email = email;
     //   Customer.physicalAddress = physicalAddress;
 //   }
    
    // Output
  //  @Override
//	public String toString() {
  //      String output = "Customer Name: " + name;
  //      output += "\nCustomer Surname: " + surname;
   //     output += "\nCustomer Phone Number: " + phoneNumber;
   //     output += "\nCustomer Email Address: " + email;
   //     output += "\nCustomer Physical Address: " + physicalAddress;

   //    return output;
  //  }

//}