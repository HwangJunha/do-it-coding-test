package bronze;
import java.util.Scanner;
public class P1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] subject = new int[count];
        for(int i=0; i<count; i++){
            subject[i] = sc.nextInt();
        }

        int max = 0;
        //최대값 계산
        for(int i=0; i<count; i++){
            if(max < subject[i]){
                max = subject[i];
            }
        }
        int sum = 0;
        for(int i=0; i<count; i++){
            sum += subject[i];
        }
        System.out.println(sum*100.0/max/count);
    }
}
