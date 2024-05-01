package Ex7_06;

import java.util.*;


public class HashMapScoreEx {

   public static void main(String[] args) {
      HashMap<String, Integer> scoreMap = new HashMap<>();
      
      scoreMap.put("김성동", 97);
      scoreMap.put("황기태", 88);
      scoreMap.put("김남윤", 98);
      scoreMap.put("이재문", 70);
      scoreMap.put("한원선", 99);
      
      System.out.println(scoreMap.size()); // 사이즈 크기 출력
      
      Set<String> keys = scoreMap.keySet();
      Iterator<String> it = keys.iterator();
      
      while(it.hasNext()) { // put한 형태로 출력되지는 않음 (자료구조 lifo 형식은 아님)
         String name = it.next();
         int score = scoreMap.get(name);
         System.out.println(name + ": " + score);
      }
      
   }

}