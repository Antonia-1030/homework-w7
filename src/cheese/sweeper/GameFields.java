package cheese.sweeper;
import java.util.Scanner;

public class GameFields {
    public static final String PLAYER = " * ";
    public static final String UNVISITED_SPACE = " X ";
    public static final String VISITED_SPACE = " V ";
    public static final String START = " S ";
    public static final String FINISH = " F ";
    public static final String MINE_CHEESE = " Y ";
    public static final String NO_MINE = " N ";

    public static final Scanner scanner = new Scanner(System.in);

    private static gameBoard(){
        int gameField = (int)(Math.random() * 4 + 1);
        if (gameField == 1) {
            renderGameField1();
        }
        if (gameField == 2) {
            renderGameField2();
        }
        if (gameField == 3) {
            renderGameField3();
        }
        if (gameField == 4) {
            renderGameField4();
        }

    }

    private static void renderGameField1(String[][] gameBoard){
        String[][] gameBoardoard = {
                {START, NO_MINE, NO_MINE, MINE_CHEESE, NO_MINE, NO_MINE},
                {MINE_CHEESE, MINE_CHEESE, MINE_CHEESE, NO_MINE, NO_MINE, MINE_CHEESE},
                {NO_MINE, MINE_CHEESE, MINE_CHEESE, NO_MINE, NO_MINE, NO_MINE},
                {MINE_CHEESE, MINE_CHEESE, MINE_CHEESE, NO_MINE, NO_MINE, MINE_CHEESE},
                {NO_MINE, NO_MINE, NO_MINE, NO_MINE, NO_MINE, MINE_CHEESE},
                {MINE_CHEESE, NO_MINE, NO_MINE, NO_MINE, NO_MINE,FINISH}
        };
    }

    private static void renderGameField2(String[][] gameBoard){
        String[][] gameBoardoard = {
                {MINE_CHEESE, MINE_CHEESE, MINE_CHEESE, MINE_CHEESE, MINE_CHEESE, START},
                {MINE_CHEESE, MINE_CHEESE, MINE_CHEESE, NO_MINE, NO_MINE, MINE_CHEESE},
                {NO_MINE, MINE_CHEESE, MINE_CHEESE, NO_MINE, NO_MINE, NO_MINE},
                {NO_MINE, NO_MINE, NO_MINE, NO_MINE, NO_MINE, MINE_CHEESE},,
                {MINE_CHEESE, MINE_CHEESE, MINE_CHEESE, NO_MINE, NO_MINE, MINE_CHEESE},
                {FINISH, MINE_CHEESE, NO_MINE, NO_MINE, NO_MINE, NO_MINE}
        };
    }

    private static void renderGameField3(String[][] gameBoard){
        String[][] gameBoardoard = {
                {FINISH, NO_MINE, NO_MINE, NO_MINE, MINE_CHEESE, MINE_CHEESE},
                {MINE_CHEESE, MINE_CHEESE, MINE_CHEESE, NO_MINE, NO_MINE, MINE_CHEESE},
                {NO_MINE, MINE_CHEESE, MINE_CHEESE, NO_MINE, NO_MINE, NO_MINE},
                {NO_MINE, NO_MINE, NO_MINE, NO_MINE, NO_MINE, MINE_CHEESE},
                {MINE_CHEESE, MINE_CHEESE, MINE_CHEESE, NO_MINE, NO_MINE, MINE_CHEESE},
                {NO_MINE, MINE_CHEESE, NO_MINE, MINE_CHEESE, MINE_CHEESE, START}
        };
    }

    private static void renderGameField4(String[][] gameBoard){
        String[][] gameBoardoard = {
                {MINE_CHEESE, MINE_CHEESE, NO_MINE, NO_MINE, MINE_CHEESE, FINISH},
                {NO_MINE, NO_MINE, NO_MINE, NO_MINE, NO_MINE, MINE_CHEESE},
                {MINE_CHEESE, MINE_CHEESE, MINE_CHEESE, NO_MINE, NO_MINE, MINE_CHEESE},
                {NO_MINE, MINE_CHEESE, MINE_CHEESE, NO_MINE, NO_MINE, NO_MINE},
                {MINE_CHEESE, MINE_CHEESE, NO_MINE, MINE_CHEESE, NO_MINE, NO_MINE},
                {START, NO_MINE, NO_MINE, MINE_CHEESE, NO_MINE, MINE_CHEESE}
        };
    }
}
