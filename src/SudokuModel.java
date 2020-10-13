import java.util.*;

public class SudokuModel {

    public SudokuModel() {

    }

    private int [][] iGameSquares = new int[][]{ // eventually i will create a Sudoku algorithm to create random numbers in here
            {5,8,1,6,7,2,4,3,9}, {7,9,2,8,4,3,6,5,1}, {3,6,4,5,9,1,7,8,2},
            {4,3,8,9,5,7,2,1,6}, {2,5,6,1,8,4,9,7,3}, {1,7,9,3,2,6,8,4,5},
            {8,4,5,2,1,9,3,6,7}, {9,1,3,7,6,8,5,2,4}, {6,2,7,4,3,5,1,9,8}
    };

    public void newBoard() {
        // the algorithm to create a Sudoku puzzle is fairly complex it would seem
        // so for now since the concern is more the MVC design, i am using one simple
        // preloaded set of numbers to put into iGameSquares

        Random rand6 = new Random(); // will be used to select 6 from each column to turn to 0
        int [] i6Count = new int[6]; // will hold seven of integers 1-9 and so each i6Count[k] will represent the j index such that iGameSquare[i][i6Count[k]] == 0

        for (int i = 0; i < 9; i++) { // cycle through each column
            for (int k = 0; k < 6; k++) { // k index is for i6Count[k] (which itself will be j index) so we can hold seven non repeating numbers 1-9
                boolean bDup = true; // true initially and then only true when there is a repeating index number being held in i6Count
                while (bDup) { // loops until a non duplicate number for i6Count[k] is found
                    bDup = false; // now set to false to begin test to see if a duplicate is found
                    i6Count[k] = rand6.nextInt(9); // random number 0-8
                    for (int l = 0; l < k; l++) { // if l == k that is comparing i6Count[l] to itself so l<k
                        if (i6Count[l] == i6Count[k]) {
                            bDup = true;
                            l = k; // to break for loop
                        }
                    }
                }
                iGameSquares[i][i6Count[k]] = 0; // sets j index to i6Count[k] which is one of 7 random non repeating numbers 1-9
            }

        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (iGameSquares[i][j] != 0) {
                    if ((j == 2) || (j == 5)) {
                        System.out.print(iGameSquares[i][j] + " |"); // prints fraction of vertical border after 3rd and 6th columns
                    }
                    else {
                        System.out.print(iGameSquares[i][j] + " ");
                    }
                }
                else {
                    if ((j == 2) || (j == 5)) {
                        System.out.print("- |"); // prints fraction of vertical border after 3rd and 6th columns
                    }
                    else {
                        System.out.print("- ");
                    }

                }
            }
            System.out.println("");
            if ((i == 2) || (i == 5)) {
                System.out.println("____________________"); // prints horizontal border after 3rd and 6th rows
            }
        }
    }

    public void randNumLayout() {
        // iGameSquares would be filled here with a Sudoku algorithm
    }
}
