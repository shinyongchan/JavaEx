package generictest;

class Soldier implements Comparable{
    String name;
    String grade;

    public Soldier(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Object o) {
        Soldier s = (Soldier) o;
        return grade.equals(s.grade) ? 1:0;
    }
}

public class GenericMethodTest {
    public static <T extends Comparable> int countSoldier(T[] arr,T a){
        int count = 0;
        for (T ar : arr)
            if(ar.compareTo(a) == 1)
                count = count + 1;
    return count;

    }

    public static void main(String[] args) {
        Soldier [] s = {new Soldier("박민석", "일병"), new Soldier("성윤모", "이병"),
                new Soldier("차병호", "이병"), new Soldier("김상훈", "상병"),
                new Soldier("최일구", "병장"),};

        System.out.println("분대에 이병 인원은 " + countSoldier(s, new Soldier("daf", "이병")));
    }

}
