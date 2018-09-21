package com.api.spring.boot.thymeleaf.springbootthymeleaf.web.service;

import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.dao.FuncionarioDao;
import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioDao funcionarioDao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Funcionario funcionario) {
        funcionarioDao.save(funcionario);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Funcionario funcionario) {
        funcionarioDao.update(funcionario);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        funcionarioDao.delete(id);
    }

    @Override
    public Funcionario buscaPorId(Long id) {
        return funcionarioDao.findById(id);
    }

    @Override
    public List<Funcionario> buscarTodos() {
        return funcionarioDao.findAll();
    }
}
