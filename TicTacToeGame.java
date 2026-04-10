import java.util.Scanner;

public class TicTacToeGame {

    static char[][] board = {
            { '_', '_', '_' }, // 0
            { '_', '_', '_' }, // 1
            { '_', '_', '_' },// 2

    };

    public static void main(String[] args) {

        while (true) {

            System.out.println("This is the menu!!Please select your choice");
            System.out.println("1 PrintBoard");
            System.out.println("2 Manipulate Board");
            System.out.println("3 Exit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printBoard();
                    break;

                case 2: {
                    System.out.println("Enter  position [x,y] ");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter a character of your choice");
                    char value = scanner.nextLine().charAt(0);
                    manipulateBoard(x, y, value);
                    System.out.println("The manipulated board is");
                    printBoard();
                    break;
                }

                case 3: {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

    }

    static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.print(" ]");
            System.out.println();
        }
    }

    static void manipulateBoard(int x, int y, char value) {

        board[x][y] = value;
    }

}
