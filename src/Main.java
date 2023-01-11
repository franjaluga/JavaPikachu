
public class Main {
    public static final String A_RESET = "\u001B[0m";
    public static final String A_BLACK = "\u001B[30m";
    public static final String A_RED = "\u001B[31m";
    public static final String A_GREEN = "\u001B[32m";
    public static final String A_YELLOW = "\u001B[33m";
    public static final String A_BLUE = "\u001B[34m";
    public static final String A_PURPLE = "\u001B[35m";
    public static final String A_CYAN = "\u001B[36m";
    public static final String A_WHITE = "\u001B[37m";
    public static void main(String[] args) {

        String [][] pikachu = new String[8][8];

        String blanco = A_WHITE + "██" +A_WHITE;
        String negro = A_BLACK + "██" +A_WHITE;
        String amarillo = A_YELLOW + "██" +A_WHITE;
        String rojo = A_RED + "██" +A_WHITE;


        pikachu[0][0] = blanco;
        pikachu[0][1] = negro;
        pikachu[0][2] = negro;
        pikachu[0][3] = blanco;
        pikachu[0][4] = blanco;
        pikachu[0][5] = blanco;
        pikachu[0][6] = blanco;
        pikachu[0][7] = negro;

        pikachu[1][0] = blanco;
        pikachu[1][1] = blanco;
        pikachu[1][2] = amarillo;
        pikachu[1][3] = amarillo;
        pikachu[1][4] = blanco;
        pikachu[1][5] = blanco;
        pikachu[1][6] = blanco;
        pikachu[1][7] = amarillo;

        pikachu[2][0] = blanco;
        pikachu[2][1] = blanco;
        pikachu[2][2] = blanco;
        pikachu[2][3] = amarillo;
        pikachu[2][4] = amarillo;
        pikachu[2][5] = amarillo;
        pikachu[2][6] = amarillo;
        pikachu[2][7] = amarillo;

        pikachu[3][0] = amarillo;
        pikachu[3][1] = amarillo;
        pikachu[3][2] = blanco;
        pikachu[3][3] = amarillo;
        pikachu[3][4] = negro;
        pikachu[3][5] = amarillo;
        pikachu[3][6] = amarillo;
        pikachu[3][7] = negro;

        pikachu[4][0] = amarillo;
        pikachu[4][1] = amarillo;
        pikachu[4][2] = blanco;
        pikachu[4][3] = rojo;
        pikachu[4][4] = amarillo;
        pikachu[4][5] = amarillo;
        pikachu[4][6] = amarillo;
        pikachu[4][7] = amarillo;

        pikachu[5][0] = blanco;
        pikachu[5][1] = amarillo;
        pikachu[5][2] = blanco;
        pikachu[5][3] = amarillo;
        pikachu[5][4] = amarillo;
        pikachu[5][5] = amarillo;
        pikachu[5][6] = amarillo;
        pikachu[5][7] = blanco;

        pikachu[6][0] = blanco;
        pikachu[6][1] = amarillo;
        pikachu[6][2] = amarillo;
        pikachu[6][3] = amarillo;
        pikachu[6][4] = amarillo;
        pikachu[6][5] = amarillo;
        pikachu[6][6] = amarillo;
        pikachu[6][7] = blanco;

        pikachu[7][0] = blanco;
        pikachu[7][1] = blanco;
        pikachu[7][2] = amarillo;
        pikachu[7][3] = amarillo;
        pikachu[7][4] = amarillo;
        pikachu[7][5] = amarillo;
        pikachu[7][6] = amarillo;
        pikachu[7][7] = blanco;

        for (int j=0; j<=7; j++) {
            for (int i = 0; i <= 7; i++) {
                System.out.print(pikachu[j][i]);
            }
            System.out.print("\n");
        }
    }
}