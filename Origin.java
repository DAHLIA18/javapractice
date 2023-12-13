import java.util.Scanner;
public class Origin{
      public static void main(String[] args){

      Scanner input = new Scanner(System.in);

     System.out.print("Enter state?: ");
      String state = input.next();

if(state == "Niger State" || "kogi state" || "Benue state" || "Plateau state" || "Nassarawa state" || "Kwara state" || "Abuja"){
     System.out.print("North Central");
    }

if(state == "Bauchi state" || "Borno state" || "Taraba state" || "Adamawa state" || "Gombe state" || "Yobe state"){
     System.out.print("North east");
    }
  if(state == "Zamfara state" || "Sokoto state" || "Kaduna state" || "kebbi state" || "Kastina state" || "Kano state" || "Jigawa state"){
     System.out.print("North West");
    }  
  if(state == "Enugu state" || "Imo state" || "Ebonyi state" || "Abia state" || "Anambra state"){
     System.out.print("South East");
      }
   if(state == "Bayelsa state" || "Akwa ibom state" || "Edo state" || "Rivers state" || "Cross River state" || "Delta state"){
     System.out.print("South South");
     }
    if(state == "Oyo state" || "Ekiti state" || "Osun state" || "Ondo state" || "lagos state" || "Ogun state"){
      System.out.print("South West");
     }
}

}
