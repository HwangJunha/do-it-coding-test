package sliver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P12891 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> slidingWindowMap = new HashMap<>(){
            {
                put('A', 0);
                put('C', 0);
                put('G', 0);
                put('T', 0);
            }
        };
        Map<Character, Integer> passwordConditionMap = new HashMap<>();
        char[] charArr = new char[sc.nextInt()]; //초기화
        int length = sc.nextInt(); //슬라이딩 윈도우 길이

        charArr = sc.next().toCharArray(); //배열 값 저장
        passwordConditionMap.put('A', sc.nextInt());
        passwordConditionMap.put('C', sc.nextInt());
        passwordConditionMap.put('G', sc.nextInt());
        passwordConditionMap.put('T', sc.nextInt());
        int result = 0;
        int start = 0;
        int count = 0;
        for(int i=0; i<charArr.length; i++){
            count++;
            if(count > length){
                slidingWindowMap.put(charArr[start], slidingWindowMap.get(charArr[start])-1); //값 감소
                start++;
                count--;
            }
            slidingWindowMap.put(charArr[i], slidingWindowMap.get(charArr[i])+1); //값 증가
            if(count == length){
                if(passwordSucceed(slidingWindowMap, passwordConditionMap)){
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    public static boolean passwordSucceed(Map<Character, Integer> slidingWindowMap, Map<Character, Integer> passwordConditionMap){
        if(slidingWindowMap.get('A') >= passwordConditionMap.get('A') && slidingWindowMap.get('C') >= passwordConditionMap.get('C') && slidingWindowMap.get('G') >= passwordConditionMap.get('G') && slidingWindowMap.get('T') >= passwordConditionMap.get('T')){
            return true;
        }
        return false;
    }
}
