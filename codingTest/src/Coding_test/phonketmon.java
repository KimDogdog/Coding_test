package Coding_test;

import java.util.HashMap;
import java.util.Set;

public class phonketmon {
    //public String solution(String[] participant, String[] completion) {
    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        HashMap<String , Integer> map = new HashMap<>();

        for(int i =0; i<participant.length;i++){
            //if(map.containsKey(participant[i])) return participant[i];
            if(map.containsKey(participant[i])) map.replace(participant[i], 1 + map.get(participant[i]));
            else map.put(participant[i],1);
        }

        for(int i =0; i<completion.length;i++){
            if(map.containsKey(completion[i]) & map.get(completion[i]) != 1){
                //System.out.println(completion[i]);
                map.replace(completion[i], map.get(completion[i]) -1 );}
            else map.remove(completion[i]);
            //map.put(participant[i],2);
        }

        /**
         * 해싱에 넣으면 중복되는 key값은 없을 것이고,
         * 해시의 크기만큼 선택지가 생기지 않을까?
         */


        Set<String> keys = map.keySet();
        for (String key : keys) {
           // System.out.println(key);
            int value = map.get(key);
            System.out.println("Key:" + key + ", Value:" + value);
            //출처: https://kadosholy.tistory.com/120 [KADOSHoly:티스토리]
        }




        //람다를 써보자
        ///return String key = map.keySet().


    }
}
