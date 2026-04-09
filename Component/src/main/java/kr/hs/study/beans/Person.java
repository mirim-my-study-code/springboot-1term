package kr.hs.study.beans;

public class Person {
    private String name;
    private int age;
}

class TestBean_1{
    private String name;
    private int age;
    TestBean_1(){}
    TestBean_1(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class TestBean_2{
    private Person p1;
    private Person p2;
    TestBean_2(){}
    TestBean_2(Person p1, Person p2){
        this.p1 = p1;
        this.p2 = p2;
        System.out.println("testBean 2 : 생성자 2");
    }
}