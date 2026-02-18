package com.nabgha.presentation;

import com.nabgha.dao.DaoImp;
import com.nabgha.metier.MetierImpl;

/**
 * @auther abdlatif-nabgha
 **/
public class Presentation2 {
    public static void main(String[] args) {
        DaoImp dao = new DaoImp();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
