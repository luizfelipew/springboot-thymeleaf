package com.api.spring.boot.thymeleaf.springbootthymeleaf.web.service;

import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.domain.Departamento;
import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscaPorId(Long id);

    List<Funcionario> buscarTodos();
}
