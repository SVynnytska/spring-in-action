package com.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext();
//        context.register(KnightConfig.class);
//        context.refresh();
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
