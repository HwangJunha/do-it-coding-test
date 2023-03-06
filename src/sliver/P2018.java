package sliver;

import java.util.Scanner;

public class P2018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();


        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while(end_index != size){
            if(sum==size){
                count++;
                end_index++;
                sum  = sum+ end_index;
            }else if(sum>size){
                sum = sum - start_index;
                start_index++;
            }else{
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
