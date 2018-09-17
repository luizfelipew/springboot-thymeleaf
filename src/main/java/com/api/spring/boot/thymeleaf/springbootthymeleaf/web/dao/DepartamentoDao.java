package com.api.spring.boot.thymeleaf.springbootthymeleaf.web.dao;

import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.domain.Departamento;

import java.util.List;

public interface DepartamentoDao {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();

}
