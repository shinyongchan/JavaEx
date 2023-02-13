package generictest;

public class GenericMethodTest {
   static class Prints{
       // generic method
       public static <T> void printArray(T[] arr){
           for (T a : arr)
               System.out.println(a);
       }
    }

    public static void main(String[] args) {
        Double[] d1 = {3.14, 2.1, 9.9};
        String[] s1 = {"asdf", "adsf"};
        Integer[] i1 = {1,6,5, 5,5};
        Prints.printArray(d1);
        //Prints.<Double>printArray(d1);
        Prints.printArray(i1);
        Prints.printArray(s1);
    }
}
