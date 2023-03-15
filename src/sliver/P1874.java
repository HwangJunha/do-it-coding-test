package sliver;
import java.util.Scanner;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int count = 1; //수열의 시작 번호
        for(int i=0; i<arr.length; i++){
            int value = arr[i];
            if(value >= count){
                while(value >= count){
                    stack.push(count++);
                    bf.append("+\n"); //값을 넣는다
                }
                stack.pop();
                bf.append("-\n");
            }else{
                int number = stack.pop();
                if(number > value){
                    System.out.println("NO");
                    return;
                }else{
                    bf.append("-\n");
                }
            }
        }
        System.out.println(bf.toString());

    }
}
