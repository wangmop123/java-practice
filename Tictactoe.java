import java.util.Scanner;

public class Tictactoe {

    static char[][] board = {
            { '_', '_', '_' }, // 0
            { '_', '_', '_' }, // 1
            { '_', '_', '_' },// 2

    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char player = ' ', opponent = ' ';
        System.out.println("choose your character(x,0): ");

        player = scanner.nextLine().charAt(0);

        if (player == 'x') {
            opponent = 'o';

        } else if (player == '0') {
            opponent = 'x';

        } else {
            System.out.println("invalid choice");
        }
        System.out.println("you are:" + player);
        System.out.println("your opponent is:" + opponent);

        while (true) {
         
        
        System.out.println("Enter x, y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        board[x][y] = player;

        System.out.println("Player moves");
        printBoard();

        System.out.println("Computer moves");

        Computermoves(opponent);

        printBoard();
        }
        // dynamic known by computer using loop
    }

    static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
        

    }

    static void Computermoves(char opponent) {
        System.out.println("computer moves");
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '_') {
                    board[i][j] = opponent;
                    return;
                }
            }

            // System.out.println();
        }

    }

}
