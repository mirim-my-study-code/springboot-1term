package kr.hs.study.beans;

public class TestBean1 {
    private int data1;
    private double data2;
    private String data3;

    public TestBean1(int data1, double data2, String data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public TestBean1(){
        System.out.println("TestBean1의 기본 생성자");
        this.data1 = 1;
        this.data2 = 7.1234;
        this.data3 = "hello world";
    }
    public TestBean1(int data1){
        System.out.println("int 매개변수 1개의 생성자");
        this.data1 = data1;
        this.data2 = 7.1234;
        this.data3 = "hello world";
    }
    public TestBean1(double data2){
        System.out.println("double 매개변수 1개의 생성자");
        this.data1 = 3;
        this.data2 = data2;
        this.data3 = "hello world";
    }
    // 마지막 선언된 생성자를 인식해서 값이 잘못나옴
    // 즉, java에서 생성자의 상세 타입을 인지하지는 못함

    public void prData(){
        System.out.println("data1: "+data1);
        System.out.println("data2: "+data2);
        System.out.println("data3: "+data3+"\n");
    }
}
