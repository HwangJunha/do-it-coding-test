package sliver;

import java.util.Scanner;

public class P11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sumArr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<n; i++){
            int insertLocation = i;
            int insertValue = arr[i];
            for(int j=i-1; j>=0; j--){
                if(arr[j] < arr[i]){
                    insertLocation = j+1;
                    break;
                }
                if(j==0){
                    insertLocation = 0;
                }
            }
            for(int j=i; j > insertLocation; j--){
                arr[j] = arr[j-1];
            }
            arr[insertLocation] = insertValue;
        }
        sumArr[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            sumArr[i] = sumArr[i-1] + arr[i];
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + sumArr[i];
        }
        System.out.println(sum);
    }
}
