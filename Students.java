public class Students {
   
    String name;
    int id;
    int phoneNumber;

    // Constructor 
    public Students(String name, int id, int phoneNumber) {
        this.name = "name";
        this.id = id;
        this.phoneNumber = phoneNumber;
    }


    public Students() {
        this.name = "name";
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    


   
    void printStudentDetail() {
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
        System.out.println("Phone Number: " + phoneNumber);
    }
}


