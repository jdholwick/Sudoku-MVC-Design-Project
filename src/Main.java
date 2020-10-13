public class Main {

    public static void main(String[] args) {

        SudokuController theContr = new SudokuController();
        SudokuInterface theInterf = new SudokuInterface();

        theContr.initNewGame();
        theInterf.mainMenu();

    }
}
