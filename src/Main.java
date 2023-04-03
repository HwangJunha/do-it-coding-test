import java.io.*;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }

        for(int i=0; i<str.length(); i++){
            int max = i;
            for(int j=i+1; j<str.length(); j++){
                if(arr[j]>arr[max]){// 내림차순으로 최댓값 찾음
                    max = j;
                }

            }
            if(arr[i] < arr[max]){
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
        for(int i=0; i<str.length(); i++){
            System.out.print(arr[i]);
        }

    }
}
