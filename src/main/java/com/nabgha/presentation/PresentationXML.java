package com.nabgha.presentation;

import com.nabgha.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther abdlatif-nabgha
 **/
public class PresentationXML {
    public static void main(String[] args) {
        ApplicationContext springContext =
                new ClassPathXmlApplicationContext("spring.xml");
        IMetier metier = springContext.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
