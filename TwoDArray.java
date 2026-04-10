
import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
     int arr[]={1,2,3,4};
       

     for(int i=0;i<arr.length; i++) {
    
        for(int j=0;j<arr.length;j++){
        
        System.out.print(MultiplicationTable(arr)[i][j]+" ");
        
        }
        
        System.out.println();
        
        }

    }
    
public static int [][] MultiplicationTable(int[] arr){
    int[][] table=new int[arr.length][arr.length];
    for(int i=0;i<arr.length;i++){
    
        for(int j=0;j<arr.length;j++){
        
        table[i][j]=arr[i]*(j+1);
        
        }
        
        }


return table;
}

}

