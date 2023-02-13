package generictest;
// Lambda Expression(람다식)
// - 익명 메서드 (일반 메서드와 달리 이름이 없다)
// - 메서드와 달리 특정 클래스에 종속되지 않지만, 매개변수, 리턴타입 , 본체를 가진다
// - 예외처리가 가능하다
// - 메서드의 인수로 전달될 수도 있고 변수에 대입될 수 있다
// - 익명 구현 객체와 달리 메서드의 핵심 부분만 포함한다
// - 실행문이 하나면 중괄호와 세미콜론 생력할 수 있다
// - 실행문이 하나의 리턴 구문이면 return 키워드도 생략가능


// (타입 매개변수 ....) -> {실행문; 실행문; ....}

interface Postive {
    int pos(int x);
}
interface Prints {
    void print();
}

public class LambdaTest {
    public static void main(String[] args) {
        Postive po;
        Prints pr;

        po = (int n) -> {return n +1;};
        po = (n) -> {return n+1;};
        po = n -> {return n+1;};
        po = (int n) -> n+1;

        pr = () -> {
            System.out.println("hi");
        };
        pr = () -> System.out.println("hi");
        pr.print();


    }
}
