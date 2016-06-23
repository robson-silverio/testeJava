package br.com.robson.testeJava.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.robson.testeJava.bean.Endereco;
import br.com.robson.testeJava.dao.EnderecoDao;
import br.com.robson.testeJava.dao.common.AbstractHibernateDao;

@Repository
public class EnderecoDaoImpl extends AbstractHibernateDao<Endereco> implements EnderecoDao {

	public EnderecoDaoImpl() {
		super();
		setClazz(Endereco.class);
	}

}
