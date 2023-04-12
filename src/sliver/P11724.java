package sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724 {
    static ArrayList<Integer>[] arrayLists;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arrayLists = new ArrayList[n];
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            arrayLists[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arrayLists[start-1].add(end-1);
            arrayLists[end-1].add(start-1);
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int i) {
        if(visited[i]){
            return;
        }
        visited[i] = true;
        for(int v : arrayLists[i]){
            if(visited[v]==false){
                DFS(v);
            }
        }

    }
}
