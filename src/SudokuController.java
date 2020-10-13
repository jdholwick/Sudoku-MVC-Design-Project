public class SudokuController {

    public SudokuController() {

    }

    public static void initNewGame() { // will initiate a new game
        SudokuInterface theInterf = new SudokuInterface();
        SudokuModel theModel = new SudokuModel();

        if (theInterf.mainMenu(1) == 1) {
            System.out.println("will call Game Board class...");
            theModel.newBoard();
        }
    }

    public static void endGame() {
        System.out.println("So long!");
    }

}
