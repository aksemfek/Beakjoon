import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] chess = new int[6];

        for(int i = 0; i< chess.length; i++){
            chess[i] = scanner.nextInt();
        }
        for(int i =0; i< chess.length; i++){
            switch (i){
                case 0:
                    chess[i] = 1 - chess[i] ;
                    break;
                case 1:
                    chess[i] = 1 - chess[i] ;
                    break;
                case 2:
                    chess[i] = 2 - chess[i] ;
                    break;
                case 3:
                    chess[i] = 2 - chess[i] ;
                    break;
                case 4:
                    chess[i] = 2 - chess[i] ;
                    break;
                case 5:
                    chess[i] = 8 - chess[i] ;
                    break;
            }
        }
        for(int chess1 : chess){
            System.out.print(chess1 + " ");
        }
    }
}