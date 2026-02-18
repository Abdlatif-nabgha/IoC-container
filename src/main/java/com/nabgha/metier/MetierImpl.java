package com.nabgha.metier;

import com.nabgha.dao.IDao;

public class MetierImpl implements IMetier {
    IDao dao; // couplage faible

    public MetierImpl() {}
    // Injection des dependences via le constructeur (Recommended)
    public MetierImpl(IDao dao) {
        super();
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
