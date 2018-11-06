package com.api.spring.boot.thymeleaf.springbootthymeleaf.web.service;

import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.dao.DepartamentoDao;
import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.domain.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoDao departamentoDao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Departamento departamento) {
        departamentoDao.save(departamento);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Departamento departamento) {
        departamentoDao.update(departamento);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        departamentoDao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Departamento buscaPorId(Long id) {
        return departamentoDao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Departamento> buscarTodos() {
        return departamentoDao.findAll();
    }

    @Override
    public boolean departamentoTemCargos(Long id) {
        if (buscaPorId(id).getCargos().isEmpty()){
            return false;
        }
        return true;
    }
}
