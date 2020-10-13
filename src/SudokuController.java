public class SudokuController {

    public SudokuController() {

    }

    static void initNewGame() { // will initiate a new game
        SudokuInterface theInterf = new SudokuInterface();
        theInterf.mainMenu(1);
    }

    static void endGame() {
        System.out.println("So long!");
    }

}
