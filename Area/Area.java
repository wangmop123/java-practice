package Area;
public class Area {
   
    public static void main(String[] args) {
     int[] length ={20,30,40,50};
     int[] breadth ={10,10,80,90};
     int[] radius ={7,7,49,47};

     Rectangle rectangle = new Rectangle();
     Circle circle = new Circle();
     Square square = new Square();

     //loop for rectangle

     for(int i = 0; i<length.length;i++){
       rectangle.printArea(length[i], breadth[i]);

     }
     //loop for circle

     for (int i = 0; i < radius.length; i++) {
        circle.printArea(radius[i]);
    }
  
//for square
int a=20;
square.printArea(a);
        
    
 }
    
}