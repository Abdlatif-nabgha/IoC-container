package com.nabgha.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImp implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de donnees");
        return 23;
    }
}
