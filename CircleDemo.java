package generictest;

import java.util.Arrays;

class Circle implements Comparable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String toString(){
        return String.format("원의 반지름은 %s 입니다", radius, "입니다.");
    }

    @Override
    public int compareTo(Object o) {
        Circle c = (Circle) o;
        return (int)(getArea() - c.getArea());  //크면 양수, 같으면 0, 작으면 음수/ 이를 이용하여 정렬
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        Circle[] circles = {new Circle(5.0), new Circle(2.5), new Circle(10.0)};

        Arrays.sort(circles);  ///정렬

        for(Circle c : circles)
            System.out.println(c);
    }
}
