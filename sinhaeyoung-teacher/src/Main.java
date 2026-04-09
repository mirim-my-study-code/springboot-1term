import beans.HelloWorldEn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        HelloWorldEn instance = new HelloWorldEn();
//        instance.sayHello();
        new HelloWorldEn().sayHello();

        // 객체 생성하지 않고 callMethod() 만들어서 호출
        // Q. 왜 static 메서드는 꼭 public 이여야함?
        // Q. class 내부의 public 메서드는 무조건 하나여야함?
//        HelloWorldEn.callMethod();

    }
    public static void callMethod(HelloWorldKo hello1){
        hello1.sayHello();
    }
}