import beans.HelloWorld;
import beans.HelloWorldEn;

public class Main {
    public static void main(String[] args) {
        // 다형성을 통해 h1 객체 생성
        HelloWorld hello = new HelloWorldEn();
        callMethod(hello);
    }
    public static void  callMethod(HelloWorld h){
        h.sayHello();
    }
}