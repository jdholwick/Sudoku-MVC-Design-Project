import java.util.*;

public class SudokuInterface {

    public SudokuInterface() {

    }

    static void mainMenu(int iMenuOpt) { // will produce the proper menu options in the moment
        int menuChoice;
        Scanner menuInpt = new Scanner(System.in);


        if (iMenuOpt == 1) {
            System.out.println("Welcome to a simple Sudoku game interface!");
            System.out.println("\n\nPlease select from the following options:\n   1) Start a game\n   2) Exit\n\n");
            menuChoice = menuInpt.nextInt();
        }
        else if (iMenuOpt == 2) {
            System.out.println("2...");
        }
        else {
            System.out.println("...");
        }

    }

}
