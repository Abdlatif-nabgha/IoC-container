package com.nabgha.dao;

/**
 * @auther abdlatif-nabgha
 **/
public class DaoImp implements IDao {

    @Override
    public double getData() {
        System.out.println("Version base de donnees");
        return 23;
    }
}
