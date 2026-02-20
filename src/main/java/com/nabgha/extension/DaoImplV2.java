package com.nabgha.extension;

import com.nabgha.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteur");
        return 12;
    }
}
