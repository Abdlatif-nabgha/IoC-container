package com.nabgha.presentation;

import com.nabgha.dao.DaoImp;
import com.nabgha.metier.MetierImpl;

/**
 * @auther abdlatif-nabgha
 **/
public class Presentation1 {
    public static void main(String[] args) {
        DaoImp dao = new DaoImp();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println(metier.calcul());
    }
}
