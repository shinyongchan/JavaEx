package generictest;
// x -> Integer.parseInt(x)  람다 표현식
// Integer :: parseInt       method reference

// 정적 메서드 참조
// 클래스이름::정적메서드
// 인스턴스 메서드 참조
// 객체 이름::인스턴스메서드
// 생성자 참조
// 클래스이름::new
// 배열타입 이름::new

interface Calc {
    double calculate(double d);
}

interface Gets{
    char get(String s, int i);
}

public class LambdaTest {
    public static void main(String[] args) {
        Calc c;
        Gets g;

        c = d -> Math.abs(d);
        System.out.println(c.calculate(-9.9));
        c = Math::abs;
        System.out.println(c.calculate(-79));

        g = (a, b) -> a.charAt(b);
        System.out.println(g.get("hello", 2));
        g = String::charAt;
        System.out.println(g.get("hello", 2));
    }
}
