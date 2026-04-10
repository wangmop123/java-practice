import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        //input marks for 3 subject 
       System.out.println(" Enter marks for math: "); 
       Scanner s = new Scanner (System.in);
       int math = s.nextInt();
      
       System.out.println(" Enter marks for java: "); 
       int java = s.nextInt();

       System.out.println(" Enter marks for science: "); 
       int science = s.nextInt();

       // Calculate total score and percentage
       int totalMarks = math + java + science;
       double percentage = (totalMarks / 300.0) * 100;  
       
       // Display total score and percentage
       System.out.println("Total Marks: " + totalMarks);
       System.out.println("Percentage: " + percentage );

   //determine division
   if(percentage >=60 ) {
    System.out.println("result: 1st division");
     }
     else if (percentage >=50 ) {
        System.out.println("result: 2nd division");
        
         }
         else if (percentage >=40 ) {
            System.out.println("result: 3rd division");
            
            
         }
         else{
            System.out.println("result: fail");
         }
        
    }
    
}
