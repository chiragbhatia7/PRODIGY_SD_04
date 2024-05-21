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

530|070|000
600|195|000
098|000|060
-----------
800|060|003
400|803|001
700|020|006
-----------
060|000|280
000|419|005
000|080|079

Final Board:

534|678|912
672|195|348
198|342|567
-----------
859|761|423
426|853|791
713|924|856
-----------
961|537|284
287|419|635
345|286|179