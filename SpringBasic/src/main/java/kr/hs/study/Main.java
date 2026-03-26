package kr.hs.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("congfig.xml");
        TestBean obj1 = cxt.getBean("t1", TestBean.class);
    }
}