import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int count = sc.nextInt();
        int[][] board = new int[length][length];
        int[][] sumBoard = new int[length][length];
        for(int i=0; i<length; i++){
            int[] arr = new int[length];
            for(int j=0; j<length; j++){
                arr[j] = sc.nextInt();
            }
            board[i] = arr;
        }
        int sum = 0;
        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                sum += board[i][j];
                sumBoard[i][j] = sum;
            }
        }


        for(int i=0; i<count; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if(x1 == 1 && y1 == 1){
                System.out.println(sumBoard[x2-1][y2-1]);
                continue;
            }


        }



    }
}
