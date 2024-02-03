package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MotDao;
import com.example.entities.Mot;

@Service
public class MotServiceImpl implements MotService{

    @Autowired
    private MotDao motDao;

    @Override
    public List<Mot> donnezMoiTousLesMots() {
        return motDao.findAll();
    }

    @Override
    public Mot donnezMoiUnMot(int idMot) {
        return motDao.findById(idMot).get();
    }

    @Override
    public void supprimerUnMot(int idMot) {
        motDao.deleteById(idMot);
    }

    @Override
    public void persisterUnMot(Mot mot) {
        motDao.save(mot);
    }

    @Override
    public void mettreAJourUnMot(Mot mot) {
        motDao.save(mot);
    }

    

}
