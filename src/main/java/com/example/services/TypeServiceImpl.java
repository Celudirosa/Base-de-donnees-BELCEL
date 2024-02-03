package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.TypeDao;
import com.example.entities.Mot;
import com.example.entities.Type;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TypeServiceImpl implements TypeService {

    private final TypeDao typeDao;

    @Override
    public List<Type> donnezMoiTousLeTypes() {
        return typeDao.findAll();
    }

    @Override
    public Type donnezMoiUnType(int idType) {
        return typeDao.findById(idType).get();
    }

    @Override
    public void persisterUnType(Type type) {
        typeDao.save(type);
    }

}
