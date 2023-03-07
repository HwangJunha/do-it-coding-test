package sliver;

import java.util.Arrays;
import java.util.Scanner;

public class P1940 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); //오름차순 정렬
        int count = 0;
        int i=0;
        int j= n-1;
        while(i<j){ //모든 재료를 확인 했을떄
            if(arr[i] + arr[j]<m){
                i++; //최소값을 올린다
            }else if(arr[i]+arr[j]>m){
                j--; //최대값을 내린다.
            }else{ //값이 같았을때
                count++;
                //갑옷의 재료는 소진 되었기 때문에 최소값은 올리고 최댓값은 내린다.
                i++;
                j--;
            }
        }
        System.out.println(count);

    }
}
