package beans;

public class TestBean {
    public TestBean(){
        System.out.println("기본 생성자 testBean");
    }
    public void initMethod(){
        System.out.println("생성자 실행 후 자동으로 실행되는 메서드");
    }
}
