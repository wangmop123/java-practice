// public class StudentMark {
//     public static void main(String[] args) {
//         int math1 = 45, science1 =69, english1 = 78, history1 = 67, computer1= 95;
//         int math2 = 46, science2 =50, english2 = 90, history2 = 60, computer2= 90;
//         int math3 = 45, science3 =69, english3 = 78, history3 = 67, computer3= 95;

//         System.out.println("Student 1 Total: " + total1);
//         System.out.println("Student 2 Total: " + total2);
//         System.out.println("Student 3 Total: " + total3);

//         int avg1 = total1 / 5 ;
//         int avg2 = total2 / 5 ;
//         int avg3 = total3 / 5 ;

//         System.out.println("Student 1 Average: " + avg1);
//         System.out.println("Student 2 Average: " + avg2);
//         System.out.println("Student 3 Average: " + avg3);

//         if (avg1 > 80) {
//             System.out.println("Student 1 passed");
            
//         }
//         else {

//             System.out.println("Student 1 failed");
//         }
   
     
//         if (avg2 > 80) {
//             System.out.println("Student 2 passed");
            
//         }
//         else {

//             System.out.println("Student 2 failed");
//         }
   
//         if (avg3 > 80) {
//             System.out.println("Student 3 passed");
            
//         }
//         else {

//             System.out.println("Student 3 failed");
//         }


//     }
    
// }





public class StudentMark {
    public static void main(String[] args) {
        int numberOfStudents = 5;
        int numberOfSubjects = 5;
        
        int[][] marks = {
            {85, 89, 97, 89, 95},
            {46, 50, 90, 60, 90}, 
            {45, 69, 78, 67, 95},
            {90, 80, 87, 98, 87} ,
            {90, 98, 87, 93, 97} 

        };

        for (int i = 0; i < numberOfStudents; i++) {
            int total = 0;
            
            for (int j = 0; j < numberOfSubjects; j++) {
                total += marks[i][j];
            }

            int average = total / numberOfSubjects;

            System.out.println("Student " + (i + 1) + " Total: " + total);
            System.out.println("Student " + (i + 1) + " Average: " + average);

            if (average > 80) {
                System.out.println("Student " + (i + 1) + " passed");
            } else {
                System.out.println("Student " + (i + 1) + " failed");
            }
        }
    }
}
