# SudokuSolver

A Java program that solves Sudoku puzzles using a backtracking algorithm. The user inputs the puzzle values cell by cell.

## Features

- Solves 9x9 Sudoku puzzles
- Uses backtracking to find the solution
- Handles puzzles with empty cells (represented by `0`)

## Requirements

- Java Development Kit (JDK) 8 or later

## How to Use

1. Clone the repository or download the `SudokuSolver.java` file.
2. Open a terminal and navigate to the directory containing `SudokuSolver.java`.
3. Compile the program using the following command:

```sh
javac SudokuSolver.java
```

4. Run the program using the following command:

```sh
java SudokuSolver
```

5. Enter the Sudoku puzzle values when prompted. Enter each value on a separate line. Use 0 for empty cells.

## Example I/O

Initial Board:

5 3 0 | 0 7 0 | 0 0 0
6 0 0 | 1 9 5 | 0 0 0
0 9 8 | 0 0 0 | 0 6 0
------+-------+------
8 0 0 | 0 6 0 | 0 0 3
4 0 0 | 8 0 3 | 0 0 1
7 0 0 | 0 2 0 | 0 0 6
------+-------+------
0 6 0 | 0 0 0 | 2 8 0
0 0 0 | 4 1 9 | 0 0 5
0 0 0 | 0 8 0 | 0 7 9

Final Board:

5 3 4 | 6 7 8 | 9 1 2
6 7 2 | 1 9 5 | 3 4 8
1 9 8 | 3 4 2 | 5 6 7
------+-------+------
8 5 9 | 7 6 1 | 4 2 3
4 2 6 | 8 5 3 | 7 9 1
7 1 3 | 9 2 4 | 8 5 6
------+-------+------
9 6 1 | 5 3 7 | 2 8 4
2 8 7 | 4 1 9 | 6 3 5
3 4 5 | 2 8 6 | 1 7 9
