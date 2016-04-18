package com.crazysnoopy.chapter01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wonhwa on 2016. 4. 18..
 */
public class KnightAOPMain {

    public static void main(String[] args) throws Knight.QuestException {
        ClassPathXmlApplicationContext context =    // Spring Context Load
                new ClassPathXmlApplicationContext(
                        "/knights-aop.xml"
                );
        Knight knight = context.getBean(Knight.class);  // Knight Bean Get!!
        knight.embarkOnQuest(); // use Knight !!
        context.close();  // Basically Close !!
    }
}
