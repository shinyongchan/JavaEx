package generictest;

public class GenericClassTest {
    public static void main(String[] args) {

        //PostBox<String> postBox1 = new PostBox<String>(); <>안에 타입입력 안해도됨
        PostBox<String> postBox1 = new PostBox<>();
        //PostBox<int> postBox2 = new PostBox<>(); int나 double 오류
        PostBox<Integer> postBox2 = new PostBox<>();
        postBox1.setItem("편지");
        postBox2.setItem(77);
        System.out.println(postBox1.getItem());
        System.out.println(postBox2.getItem());
    }
}
