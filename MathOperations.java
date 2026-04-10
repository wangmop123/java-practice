public class MathOperations {
    public static void main(String[] args) {
           MathOperations mathOps = new MathOperations();
   
          
           System.out.println("Sum: " + mathOps.addFourNumbers(1, 2, 3, 4));
           System.out.println("Greatest: " + mathOps.findGreatest(10, 20));
           System.out.println("Smallest: " + mathOps.findSmallest(10, 20));System.out.println("Area of Rectangle: " + mathOps.findAreaOfRectangle(5, 10));
           System.out.println("Concatenated String: " + mathOps.concatenateStrings("Hello, ", "World!"));
           System.out.println("Odd or Even: " + mathOps.oddEven(5));
       }
   
       // 1) Add four numbers
       public int addFourNumbers(int a, int b, int c, int d) {
           return a + b + c + d;
       }
   
       // 2) Find greatest of two numbers
       public int findGreatest(int a, int b) {
           return (a > b) ? a : b;
       }
   
       // 3) Find smallest of two numbers
       public int findSmallest(int a, int b) {
           return (a < b) ? a : b;
       }
   
       // 4) Find area of rectangle
       public int findAreaOfRectangle(int length, int width) {
           return length * width;
       }
   
       // 5) Concatenate two strings
       public String concatenateStrings(String str1, String str2) {
           return str1 + str2;
       }
   
       // 6) Check if a number is odd or even
       public String oddEven(int number) {
           return (number % 2 == 0) ? "Even" : "Odd";
       }
       
   }