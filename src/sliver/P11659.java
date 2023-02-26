package sliver;

import java.util.Scanner;

public class P11659 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arrSize = sc.nextInt();
        int count = sc.nextInt();
        int [] arr = new int[arrSize];
        int [] arr2 = new int[arrSize];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr2.length; i++){
            if(i==0){
                arr2[i] = arr[i];
            }else{
                arr2[i] = arr[i] + arr2[i-1];
            }

        }
        int [] result = new int[count];
        for(int i=0; i<count; i++){
            int index1 = sc.nextInt();
            int index2 = sc.nextInt();
            result[i] = arr2[index2-1]-arr2[index1-1]+arr[index1-1];

        }
        for(int i=0; i<count; i++){
            System.out.println(result[i]);
        }
    }
}
