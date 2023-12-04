import java.util.Scanner;
public class NumericCount{
      public static void main(String[] args){
         Scanner input = new Scanner(System.in);

int zero = 1;
int positives = 1;
int negatives = 1;
int counter = 0;

while(counter !=){
System.out.print("Enter number");
int number = input.nextInt();
}

if(number > 0){
  postives+= 1;
}else if(number < 0){
   negative+=1;
}else if(number == 0){
    zero+=1;
}

System.out.printf("Postives number: %d%n ", postives);
System.out.printf("Negatives number: %d%n", negatives);
System.out.printf("Zero number: %d%n", zero);

   }
}