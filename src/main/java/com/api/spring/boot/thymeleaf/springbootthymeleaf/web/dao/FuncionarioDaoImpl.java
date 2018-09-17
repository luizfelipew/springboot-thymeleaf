package com.api.spring.boot.thymeleaf.springbootthymeleaf.web.dao;

import com.api.spring.boot.thymeleaf.springbootthymeleaf.web.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {
}
