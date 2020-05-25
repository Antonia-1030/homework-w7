package cheese.sweeper;
import java.util.Scanner;
import cheese.sweeper.GameFields;

public class CheeseSweeper {
    public static final String PLAYER = " * ";
    public static  String UNVISITED_SPACE = " X ";
    public static final String VISITED_SPACE = " V ";
    public static final String START = " S ";
    public static final String FINISH = " F ";
    public static  String MINE_CHEESE = " Y ";
    public static  String NO_MINE = " N ";
    public static boolean isGameOn = true;
    public static String[][] gameBoard = new String[6][6];
    public static final Scanner scanner = new Scanner(System.in);

    GameFields.gameBoard();

    public static void main(String[] args){
        int userChoise = scanner.nextInt();
        while (isGameOn){
            renderActionMenu();
            if (userChoise == 1){
                isPositionMined();
            }
            if (userChoise == 2){
                disableMine();
            }
            if(userChoise == 3){
                movePlayer(gameBoard, coord);
            }
        }

    }

    public static int numberOfProbes(int userChoise){
        int countOfProbes = 0;
        if (userChoise == 1){
            countOfProbes++;
        }
        System.out.println("Broi na probite: " + countOfProbes);
    }

    public static int[] readCoordinates() {
        String stringCoordinates;
        int[] coordinates = new int[4];
        do {
            System.out.println("Vavedete koordinati: ");
            stringCoordinates = scanner.nextLine();
        } while (stringCoordinates.length() != 4);
    }
    
    public static disableMine(String[][] gameBoard, int coords){
        if (target.equals(MINE_CHEESE)){
            MINE_CHEESE = NO_MINE;
        }
    }

    public static void movePlayer(String[][] gameBoard,int[] coords){
        String PLAYER = gameBoard[coords[1]][coords[0]];
        String target = gameBoard[coords[3]][coords[2]];

        gameBoard[coords[3]][coords[2]] = PLAYER;
        gameBoard[coords[1]][coords[0]] = VISITED_SPACE;

        if (target.equals(MINE_CHEESE)){
            isGameOn = false;
            System.out.println("You were cheesed! Try again.\n")
        }
        if (FINISH(target)) {
            isGameOn = false;
            System.out.println("You win! Congratulations!\n");
        }
    }

    public static void renderActionMenu(){
        System.out.println("1. Skanirai.");
        System.out.println("2. Obezvredi sireneto.");
        System.out.println("3. Pridviji se.");
    }
}
