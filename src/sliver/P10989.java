package sliver;

import java.io.*;

public class P10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int size = Integer.parseInt(br.readLine());
        int [] arr = new int[10001];
        for(int i=0; i<size; i++){
            int number = Integer.parseInt(br.readLine());
            arr[number]++;
        }
        br.close();
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
