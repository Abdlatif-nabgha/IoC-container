package com.nabgha.presentation;

import com.nabgha.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther abdlatif-nabgha
 **/
public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.nabgha");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
