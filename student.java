
   
class Student {
    static int total = 100;  

    public static void main(String[] args) {
        student1();
    }

    static void student1() {
        int math = 70;
        int nepali = 60;
        int social = 50;
        int java = 60;

       
        System.out.println("Math: " + math);
        System.out.println("Nepali: " + nepali);
        System.out.println("Social: " + social);
        System.out.println("Java: " + java);

        // Calculate total obtained marks
        float obtained = math + nepali + social + java;
        System.out.println("Total score: " + obtained);

        // Calculate percentage (corrected to divide by 400)
        float percentage = (obtained / 400) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}





	

