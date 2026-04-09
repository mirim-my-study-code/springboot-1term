package kr.hs.study;

import beans.HelloWorld;
import beans.HelloWorldEn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplication("config.xml");
        HelloWorld obj = ctx.getBean("h1", HelloWorldEn.class);
    }
}