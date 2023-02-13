package generictest;

public class GenericMethodTest {
   static class Prints{
       // generic method
       public static <T extends Number> void printArray(T[] arr){     // 타입제한
           for (T a : arr)
               System.out.println(a);
       }
       public static <T> T getFirst(T[] arr){
           return arr[0];
       }
    }

    public static void main(String[] args) {
        Double[] d1 = {3.14, 2.1, 9.9};
        String[] s1 = {"asdf", "adsf"};
        Integer[] i1 = {1,6,5, 5,5};
        Prints.printArray(d1);
        //Prints.<Double>printArray(d1);
        Prints.printArray(i1);
        //Prints.printArray(s1); // Number 클래스의 자식 클래스로 제한해서 문자, 문자열 배열은 사용 불가
        System.out.println(Prints.getFirst(d1));
    }
}
