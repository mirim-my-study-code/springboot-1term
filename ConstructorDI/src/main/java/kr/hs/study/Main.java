package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
//        TestBean1 testBean1 = ctx.getBean("t1", TestBean1.class);
//        testBean1.prData();
//
//
//        TestBean1 testBean2 = ctx.getBean("t2", TestBean1.class);
//        testBean2.prData();


        TestBean2 testBean = ctx.getBean("testBean2", TestBean2.class);
        testBean.prData();
        ctx.close();
    }
}