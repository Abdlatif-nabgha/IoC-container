package com.nabgha.metier;

import com.nabgha.dao.IDao;

public class MetierImpl implements IMetier {
    IDao dao; // couplage faible

    // Injection des dependences via le constructeur
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double t = dao.getData();
        return t * 43 / 3;
    }
}
