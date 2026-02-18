package com.nabgha.extension;

import com.nabgha.dao.IDao;

/**
 * @auther abdlatif-nabgha
 **/
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteur");
        return 12;
    }
}
