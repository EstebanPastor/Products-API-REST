package com.chinodev.SpringbootRestApi.persistence.Impl;

import com.chinodev.SpringbootRestApi.entities.Maker;
import com.chinodev.SpringbootRestApi.persistence.IMakerDAO;
import com.chinodev.SpringbootRestApi.repositories.IMakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MakerDAOImpl implements IMakerDAO {

    @Autowired
    private IMakerRepository makerRepository;
    @Override
    public List<Maker> findAll() {
        return (List<Maker>) makerRepository.findAll();
    }

    @Override
    public Optional<Maker> findById(Long id) {
        return makerRepository.findById(id);
    }

    @Override
    public void save(Maker maker) {
    makerRepository.save(maker);
    }

    @Override
    public void deleteById(Long id) {
    makerRepository.deleteById(id);
    }
}
