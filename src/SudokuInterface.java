import java.util.*;

public class SudokuInterface {

    public SudokuInterface() {

    }

    static void mainMenu(int iMenuOpt) { // will produce the proper menu options in the moment
        SudokuController theContr = new SudokuController();

        Scanner menuInput = new Scanner(System.in);
        int menuChoice = 0; // will hold input regarding menu choice for any of the menus

        if (iMenuOpt == 1) {
            System.out.println("Welcome to a simple Sudoku game interface!");
            System.out.println("\n\nPlease select from the following options:\n   1) Start a game\n   2) Exit\n\n");
            menuChoice = menuInput.nextInt();
        }
        else if (iMenuOpt == 2) {
            System.out.println("2...");
        }
        else {
            System.out.println("...");
        }

        if (menuChoice == 1) {
            System.out.println("The game would begin here...");
        }
        else if (menuChoice == 2) {
            theContr.endGame();
        }

    }

}
