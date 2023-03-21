package gold;

import java.io.*;
import java.util.Stack;

public class P17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n]; //수열
        int[] answer = new int[n]; //정답
        String[] str = bf.readLine().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> stack = new Stack<>();

        stack.push(0); //인덱스 저장
        for(int i=1; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                answer[stack.pop()] = arr[i]; //오큰수 저장
            }
            stack.push(i); //신규 인덱스 추가
        }
        while(!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<n; i++){
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
