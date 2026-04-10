import java.util.Scanner;
public class tictacoe {

   static Scanner s= new Scanner(System.in);
    static char ComputerChoice=' ';
    static  char board[][]={ 
        {'_','_','_'},
        {'_', '_','_'},
        {'_','_','_'},
    };
 
    public static void main(String[] args){
        System.out.println("Enter the choice(X OR 0)");

        char choice= s.next().charAt(0);
       
        if(choice=='X'|| choice=='x'){
            ComputerChoice = 'O'; 
        }
        else if(choice == 'O' || choice=='o'){
            ComputerChoice='X';
        }
        else{
            System.out.println("Invalid choice");
        }
        System.out.println("You have entered :" + choice + "the computer will enter :" + ComputerChoice);
        printBoard();

        
        while (true) {
            coordinate(choice);
            printBoard();
            if (checkWinner(choice)) {
                printBoard();
                System.out.println("Congratulations! You win!");
                break;
            }
            if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
            

            calculateComputerMove();
            if (checkWinner(ComputerChoice)) {
                printBoard();
                System.out.println("Computer wins! Better luck next time.");
                break;
            }
            if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
            printBoard();
        }
    }
    
    static void printBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print( board[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }

    static void coordinate( char choice){
       while(true){
        System.out.println("Enter the coordinate");
        int x= s.nextInt();
        int y= s.nextInt();
        //board [x][y]=choice;
        if (x < 0 || x > 2 || y < 0 || y > 2 || board[x][y] != '_') {
            System.out.println("Invalid choice position! Try again.");
        } else {
            board[x][y] = choice;
            break;
        }
       }
    }

    
    static void calculateComputerMove(){
        System.out.println("Computer move");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]== '_' ){
                    board[i][j]= ComputerChoice;
                    return;
                }
            }
        }
    }
    static boolean checkWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true; 
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true; 
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true; 
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true; 
        return false;
    }

    static boolean isBoardFull(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if( board[i][j]== '_'){
                return false;
            }
        }
        }
    return true;
    }
}