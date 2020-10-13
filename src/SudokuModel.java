import java.util.*;

public class SudokuModel {

    public SudokuModel() {

    }

    private int [][] iGameSquares = new int[][]{
            {5,8,1,6,7,2,4,3,9}, {7,9,2,8,4,3,6,5,1}, {3,6,4,5,9,1,7,8,2},
            {4,3,8,9,5,7,2,1,6}, {2,5,6,1,8,4,9,7,3}, {1,7,9,3,2,6,8,4,5},
            {8,4,5,2,1,9,3,6,7}, {9,1,3,7,6,8,5,2,4}, {6,2,7,4,3,5,1,9,8}
    };

    public void newBoard() {
        // the algorithm to create a Sudoku puzzle is fairly complex it would seem
        // so for now since the concern is more the MVC design, i am using one simple
        // preloaded set of numbers to put into iGameSquares

        Random rand7 = new Random(); // random variable that will choose between 1 and 10 to decide if a a number should be hidden or not
        int [] i7Count = new int[9];

        for (int i = 0; i < 9; i++) { // cycle through each column
            for (int k = 0; k < 7; k++) { // k index is for i7Count[k] (which itself will be j index) so we can hold seven non repeating numbers 1-9
                boolean bDup = true; // true initially and then only true when there is a repeating index number being held in i7Count
                while (bDup) { // loops until a non duplicate number for i7Count[k] is found
                    bDup = false; // now set to false to begin test to see if a duplicate is found
                    i7Count[k] = rand7.nextInt(9) + 1; // random number 1-9
                    for (int l = 0; l < k; l++) { // if l == k that is comparing i7Count[l] to itself so l<k
                        if (i7Count[l] == i7Count[k]) {
                            bDup = true;
                            l = k; // to break for loop
                        }
                    }
                }
                iGameSquares[i][i7Count[k]] = 0; // sets j index to i7Count[k] which is one of 7 random non repeating numbers 1-9
            }

        }

    }

    public void randNumLayout() {
        // iGameSquares would be filled here with a Sudoku algorithm
    }
}
