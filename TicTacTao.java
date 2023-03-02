
public class TicTacTao {
    // ANA fares : had la methode hiya fastest one to do it , bsh fe exo aw hayb
    // y9sm jeux l classes bch tweli khir we maintanble ktr
    // tsma li hayb y3awd had exo ydir classes dakhl had class par exemple: Class
    // Player , Class Enemy ect .....
    void StartGame() {
        int[][] matrice = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrice[i][j] = 0;
            }
        }
        int player = 1;
        int x = 0;
        int y = 0;
        int count = 0;
        while (count < 9) {
            if (player == 1) {
                System.out.println("Player 1: ");
                System.out.print("x: ");
                x = new java.util.Scanner(System.in).nextInt();
                System.out.print("y: ");
                y = new java.util.Scanner(System.in).nextInt();
                if (matrice[x][y] == 0) {
                    matrice[x][y] = 1;
                    player = 2;
                    count++;
                } else {
                    System.out.println("This place is already taken");
                }
            } else {
                System.out.println("Player 2: ");
                System.out.print("x: ");
                x = new java.util.Scanner(System.in).nextInt();
                System.out.print("y: ");
                y = new java.util.Scanner(System.in).nextInt();
                if (matrice[x][y] == 0) {
                    matrice[x][y] = 2;
                    player = 1;
                    count++;
                } else {
                    System.out.println("This place is already taken");
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrice[i][j] + " ");
                }
                System.out.println();
            }
            if (matrice[0][0] == 1 && matrice[0][1] == 1 && matrice[0][2] == 1) {
                System.out.println("Player 1 won");
                break;
            }
            if (matrice[1][0] == 1 && matrice[1][1] == 1 && matrice[1][2] == 1) {
                System.out.println("Player 1 won");
                break;
            }
            if (matrice[2][0] == 1 && matrice[2][1] == 1 && matrice[2][2] == 1) {
                System.out.println("Player 1 won");
            }
        }
    }
}