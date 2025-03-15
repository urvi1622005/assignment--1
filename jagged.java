import java.util.Scanner;

public class jagged {

    public static void main(String[] args) {

        // create a 3x3 matrix
        char[][] TicTacToeBoard = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'X', 'O', 'X'}
        };

        Scanner scanner = new Scanner(System.in);

        // Initialize the board with user input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter character for position (" + i + ", " + j + "): ");
                TicTacToeBoard[i][j] = scanner.next().charAt(0);
            }
        }

        // Print the board
        System.out.println("Current Tic Tac Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(TicTacToeBoard[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
