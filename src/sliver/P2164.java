package sliver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class P2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<n; i++){
            queue.add(i+1);
        }
        while(queue.size() > 1){ //하나가 남을때 까지
            queue.poll();
            queue.add(queue.poll());
        }
        int answer = queue.poll();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer + " ");
        bw.flush();
    }
}
