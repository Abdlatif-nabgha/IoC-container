package com.nabgha.presentation;

import com.nabgha.dao.IDao;
import com.nabgha.extension.DaoImplV2;
import com.nabgha.metier.MetierImpl;

/**
 * @auther abdlatif-nabgha
 **/
public class Presentation1 {
    public static void main(String[] args) {
        IDao dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl();
        System.out.println(metier.calcul());
    }
}
