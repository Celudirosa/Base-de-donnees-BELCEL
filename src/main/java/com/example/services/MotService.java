package com.example.services;

import java.util.List;

import com.example.entities.Mot;

public interface MotService {
    
    public List<Mot> donnezMoiTousLesMots();
    public Mot donnezMoiUnMot(int idMot);

    public void supprimerUnMot(int idMot);
    public void persisterUnMot(Mot mot);
    public void mettreAJourUnMot(Mot mot);

}
