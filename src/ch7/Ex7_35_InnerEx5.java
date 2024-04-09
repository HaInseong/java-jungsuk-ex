package ch7;

public class Ex7_35_InnerEx5 {
    int value = 10;

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("value : " + value);
            System.out.println("this.value : " + value);
            System.out.println("Ex7_35_InnerEx5.this.value : " + Ex7_35_InnerEx5.this.value);
        }
    }
}

class InnerEx5 {
    public static void main(String[] args) {
        Ex7_35_InnerEx5 outer = new Ex7_35_InnerEx5();
        Ex7_35_InnerEx5.Inner inner = outer.new Inner();
        inner.method1();
    }
}