//public class Contractor {

//    String contName;
//   String contNum;
 //   String contEmail;
 //   String contAddress;

//    public Contractor(String contName,String contNum, String contEmail,String contAddress){
        
 //       this.contName = contName;
 //       this.contNum = contNum;
  //      this.contEmail = contEmail;
  //      this.contAddress = contAddress;
   // }

 //   public String getContName(){
 //       return contName;
 //   }

//    public String getContNum(){
  //      return contNum;
 //   }

//    public String getContEmail(){
  //      return contEmail;
 //   }

//    public String getContAddress(){
 //       return contAddress;
  //  }

 //   public String toString(){
 //       String output = "Contractors: " + contName;
 //       output += "\nPhone Number: " + contNum;
 //       output += "\nEmail Address: " + contEmail;
 //       output += "\nPhysical Address: " + contAddress;
//
//        return output;
//    }

//}
public class Contractor extends Person {

    

    public Contractor( String name,  String surname, int telephoneNumber,  String emailAddress, String physicalAddress){
    	   super(name, surname, telephoneNumber, emailAddress, physicalAddress);

           

        } 

        //public void setcustomerInv(){

          //  this.customerInv = customerInv;

 //   }
    
    public String toString(){
        String output = "Customer Name: " + name;
        output += "\nPhone Number: " +  telephoneNumber;
        output += "\nEmail Address: " + emailAddress;
        output += "\nPhysical Address: " + physicalAddress;
     //   output += "\nCustomer Invoice: " + customerInv;
        return output;
    }

}
///package PoisedTaskManager;

//public class Contractor {
	
    //Attributes.
   /// static String name;
    //static String phoneNumber;
    //static String email;
    //static String physicalAddress;

    // Contractor Method.
   // public Contractor (String name, String phoneNumber, String email, String physicalAddress) {
      //  Contractor.name = name;
      //  Contractor.phoneNumber = phoneNumber;
       // Contractor.email = email;
       // Contractor.physicalAddress = physicalAddress;
  //  }
    // Output
   // @Override
//	public String toString() {
      //  String output = "Contractor Name: " + name;
      //  output += "\nContractor Phone Number: " + phoneNumber;
      //  output += "\nContractor Email Address: " + email;
      //  output += "\nContractor Physical Address: " + physicalAddress;

     //   return output;
  //  }

//
