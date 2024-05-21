import java.util.Scanner;

public class SudokuSolver {

    // Constant for the size of the Sudoku grid
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Initialize a 9x9 Sudoku board
        int[][] board = new int[GRID_SIZE][GRID_SIZE];

        // Prompt the user to enter the Sudoku puzzle cell by cell
        System.out.println("Please enter the Sudoku puzzle (use 0 for empty cells). Enter each cell value on a separate line:");

        // Parse the input values to fill the board
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                System.out.print("Enter value for cell (" + row + ", " + col + "): ");
                board[row][col] = scanner.nextInt();
            }
        }

        // Print the initial board
        System.out.println("Initial Board:");
        printBoard(board);

        // Try to solve the board
        if (solveBoard(board)) {
            System.out.println("Solved successfully!");
        } else {
            System.out.println("Unsolvable board :(");
        }

        // Print the solved board
        System.out.println("Final Board:");
        printBoard(board);
    }

    // Method to print the Sudoku board
    private static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

    // Method to check if a number is present in a row
    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is present in a column
    private static boolean isNumberInColumn(int[][] board, int number, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is present in a 3x3 box
    private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to check if a number can be placed at a specific position
    private static boolean isValidPlacement(int[][] board, int number, int row, int column) {
        return !isNumberInRow(board, number, row) && !isNumberInColumn(board, number, column) && !isNumberInBox(board, number, row, column);
    }

    // Recursive method to solve the Sudoku board using backtracking
    private static boolean solveBoard(int[][] board) {
        // Loop through each cell in the board
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                // Check if the current cell is empty
                if (board[row][column] == 0) {
                    // Try placing numbers 1 through 9 in the empty cell
                    for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
                        // Check if the number can be placed in the current cell
                        if (isValidPlacement(board, numberToTry, row, column)) {
                            // Place the number in the cell
                            board[row][column] = numberToTry;

                            // Recursively attempt to solve the rest of the board
                            if (solveBoard(board)) {
                                return true;
                            } else {
                                // If the placement doesn't lead to a solution, reset the cell
                                board[row][column] = 0;
                            }
                        }
                    }
                    // If no number can be placed in the current cell, the board is unsolvable
                    return false;
                }
            }
        }
        // If all cells are filled correctly, the board is solved
        return true;
    }
}