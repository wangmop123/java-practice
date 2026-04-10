import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        //intput 1st num and second num
        System.out.println("please enter a first number");
        Scanner s = new Scanner (System.in);
        int input1 = s.nextInt();

        System.out.println("please enter a second number");
        int input2 = s.nextInt();

//display addition, subtraction,mutiply and division
        // System.out.println("sum: " + (input1 + input2 ));
        // System.out.println("sub: " + (input1 - input2 ));
        // System.out.println("multiply: " + (input1 * input2 ));
        // System.out.println("division: " + (input1 / input2 ));

//input choice num
        System.out.println("please enter a choice");
        int input3 = s.nextInt();

        //determine 1,2,3,4 means add,sub,multiply and division respectively
        if (input3 == 1) {
            System.out.println("result: " + (input1 + input2 ));

        }
        else if (input3 == 2) {
            System.out.println("result: " + (input1 - input2 ));
            
        }
        else if (input3 == 3) {
            System.out.println("result: " + (input1 * input2 ));
            
        }
        else if (input3 == 4) {
            System.out.println("result: " + (input1 / input2 ));
            
        }

        else{
            System.out.println("result: invalid value");
        }

    }
    
}
