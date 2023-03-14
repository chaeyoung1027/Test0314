package kr.hs.study;

import kr.hs.study.Beans.Music;
import kr.hs.study.Beans.jpop;
import kr.hs.study.Beans.kpop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        kpop obj1 = ctx.getBean("t1", kpop.class);
        jpop obj2 = ctx.getBean("t2", jpop.class);

    }
}