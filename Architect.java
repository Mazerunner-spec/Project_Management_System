//public class Architect {
    
   // String archName;
  //  String phoneNum;
  //  String archEmail;
  //  String archAddress;

  //  public Architect(String archName,String phoneNum,String archEmail,String archAddress){

   //     this.archName = archName;
    //    this.phoneNum = phoneNum;
   //     this.archEmail = archEmail;
   //     this.archAddress = archAddress;
 //   }

  //  public String getArchName(){
   //     return archName;
  //  }
    
  //  public String getPhoneNum(){
    //    return phoneNum;
   // }

  //  public String getArchEmail(){
   //     return archEmail;
  //  }

 //   public String getArchAddress(){
   //     return archAddress;
 //   }

//    public String toString() {
   //     String output = "Architects: " + archName;
   //     output += "\nPhone Number: " + phoneNum;
   //     output += "\nEmail Address: " + archEmail;
   //     output += "\nPhysical Address: " + archAddress;

    //    return output;
 //   }
    
//}

/**
 //* Represents an Architect - an extension of the Person class

 */

public class Architect extends Person {

   String customerInv;

    public Architect( String name,  String surname, int telephoneNumber,  String emailAddress, String physicalAddress){
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

//public class Architect {
	
	 // Attributes
   // static String name;
   // static String phoneNumber;
  //  static String email;
 //   static String physicalAddress;

    // Architect Method.
  //  public Architect (String name, String phoneNumber, String email, String physicalAddress) {
     //   Architect.name = name;
    //    Architect.phoneNumber = phoneNumber;
    //    Architect.email = email;
    //    Architect.physicalAddress = physicalAddress;
  //  }
    
    // Output
   // @Override
//	public String toString() {
   //     String output = "Architect Name: " + name;
    //    output += "\nArchitect Phone Number: " + phoneNumber;
     //   output += "\nArchitect Email Address: " + email;
     //   output += "\nArchitect Physical Address: " + physicalAddress;
     //   return output;
 //   }
//}
