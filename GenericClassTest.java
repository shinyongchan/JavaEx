package generictest;

class Dp<K,V>{
    private K name;
    private V grade;

    public Dp(K name, V grade) {
        this.name = name;
        this.grade = grade;
    }

    public K getName() {
        return name;
    }

    public V getGrade() {
        return grade;
    }
}

public class GenericClassTest {
    public static void main(String[] args) {
        Dp<String, String> s1 = new Dp<>("한호열","상병");
        Dp<String, Integer> s2 = new Dp<>("한호열",3);

        //Dp<PostBox, String> s3 = new Dp<>() 타입에 generic class가 올 수도 있음
        System.out.println(s1.getName() + "의 계급은 " + s1.getGrade());
        System.out.println(s2.getName() + "의 계급은 " + s2.getGrade());
    }
}
