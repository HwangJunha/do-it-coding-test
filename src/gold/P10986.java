package gold;

import java.util.Scanner;

public class P10986 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] sumBoard = new long[n];
        long[] remainBoard = new long[m];

        sumBoard[0] = sc.nextInt();
        for(int i=1; i<n; i++){
            sumBoard[i] = sumBoard[i-1] + sc.nextInt();
        }

        long answer = 0;

        for(int i=0; i<n; i++){
            int remainder = (int)(sumBoard[i]%m);
            if(remainder == 0) answer++;
            remainBoard[remainder]++;
        }
        for(int i=0; i<m; i++){
            if(remainBoard[i] > 1){
                answer = answer + (remainBoard[i]*(remainBoard[i]-1)/2);
            }
        }
        System.out.println(answer);
    }
}
