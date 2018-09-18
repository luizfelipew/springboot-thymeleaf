package com.api.spring.boot.thymeleaf.springbootthymeleaf.web.service;

import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.dao.CargoDao;
import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.domain.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService{


    @Autowired
    private CargoDao cargoDao;

    @Override
    public void salvar(Cargo cargo) {
        cargoDao.save(cargo);
    }

    @Override
    public void editar(Cargo cargo) {
        cargoDao.update(cargo);
    }

    @Override
    public void excluir(Long id) {
        cargoDao.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Cargo buscaPorId(Long id) {
        return cargoDao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cargo> buscarTodos() {
        return cargoDao.findAll();
    }
}
