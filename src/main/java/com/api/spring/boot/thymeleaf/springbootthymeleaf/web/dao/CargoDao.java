package com.api.spring.boot.thymeleaf.springbootthymeleaf.web.dao;

import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.domain.Cargo;
import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.domain.Departamento;

import java.util.List;

public interface CargoDao {

    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
