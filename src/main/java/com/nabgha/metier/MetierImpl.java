package com.nabgha.metier;

import com.nabgha.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    IDao dao; // couplage faible

    public MetierImpl() {}
    // Injection des dependences via le constructeur (Recommended)
    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
    }

    // Injection de dependences via setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double t = dao.getData();
        return t * 43 / 3;
    }
}
