package com.api.spring.boot.thymeleaf.springbootthymeleaf.web.dao;

import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.domain.Funcionario;

import java.util.List;

public interface FuncionarioDao {

    void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}
