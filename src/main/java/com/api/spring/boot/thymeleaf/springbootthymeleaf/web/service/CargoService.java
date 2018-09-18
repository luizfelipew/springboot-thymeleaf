package com.api.spring.boot.thymeleaf.springbootthymeleaf.web.service;

import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.domain.Cargo;

import java.util.List;

public interface CargoService {

    void salvar(Cargo cargo);

    void editar(Cargo cargo);

    void excluir(Long id);

    Cargo buscaPorId(Long id);

    List<Cargo> buscarTodos();


}
