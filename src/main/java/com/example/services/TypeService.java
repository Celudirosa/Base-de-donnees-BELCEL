package com.example.services;

import java.util.List;

import com.example.entities.Type;

public interface TypeService {

    public List<Type> donnezMoiTousLeTypes();
    public Type donnezMoiUnType(int idType);
    public void persisterUnType(Type type);

}
