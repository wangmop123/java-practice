public class ArrayOperation {
    public static void main(String[] args) {
        int[] numbers = {1,2,3}; 

        


       int[] nums =  returnSmallestAndLargest(numbers);


     int sum=  nums[0]+nums[1];

      
    System.out.println("sum: "+sum);

    }

    static int[] returnSmallestAndLargest(int[] a) {
      
        int smallest = a[0];
        int largest = a[0];
        int medium = a[0];
        int sum = a[0];
       
        for (int num : a) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
            else{
                
                
            }
        }


        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println("Medium: " + medium);
     

        int[] result= {smallest,largest,medium};
        return result;

    }
}
