package generictest;

import java.util.Arrays;
import java.util.Comparator;

public class StringDemo {
    public static void main(String[] args) {
        String [] strings = { "hi", "hello", "안녕하세요요", "가가마"};

        //Arrays.sort(strings); 가나다, abc순 정렬

//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        }); // 문자열 길이순으로 정렬

        Arrays.sort(strings,(o1, o2) -> o1.length() - o2.length()); //람다식으로 표현

        for (String s : strings)
            System.out.println(s);

    }
}
