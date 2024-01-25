package Ex4_6;


public class CircleArray {

   public static void main(String[] args) {
      Circle1 [] c;
      c = new Circle1[5];
      
      for(int i=0; i<c.length; i++) // 배열의 개수만큼 i번째 원소 객체 생성
         c[i] = new Circle1(i);
      for(int i=0; i<c.length; i++)
         System.out.print((int)(c[i].getArea()) + " ");

   }
}