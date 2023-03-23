package sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            //절대값이 같은 경우 음수 우선
            int firstAbs = Math.abs(o1);
            int secondAbs = Math.abs(o2);
            if(firstAbs == secondAbs){
                return o1 > o2 ? 1 : -1;
            }
            //절대값 작은 데이터 먼저
            return firstAbs - secondAbs;
        });

        for(int i=0; i<n; i++){
            int request = Integer.parseInt(bf.readLine());
            if(request == 0){
                if(queue.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(queue.poll());
                }
            }else{
                queue.offer(request);
            }
        }

    }
}
