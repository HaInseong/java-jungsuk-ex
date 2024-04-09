package ch7;

public class Ex7_32_InnerEx2 {
    class InstanceInner {

    }
    static class StaticInner {

    }

    InstanceInner iv = new InstanceInner();
    StaticInner sv = new StaticInner();

    static void staticMethod() {
//        InstanceInner obj1 = new InstanceInner(); // static멤버는 인스턴스 멤버에 직접 접근할 수 없다.
        Ex7_32_InnerEx2 outer = new Ex7_32_InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();

        StaticInner obj2 = new StaticInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
//        LocalInner lv = new LocalInner();
    }

    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}
