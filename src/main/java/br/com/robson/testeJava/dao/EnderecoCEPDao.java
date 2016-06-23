package br.com.robson.testeJava.dao;

import br.com.robson.testeJava.bean.EnderecoCEP;
import br.com.robson.testeJava.dao.common.Operations;

public interface EnderecoCEPDao extends Operations<EnderecoCEP> {
	public EnderecoCEP getEnderecoCEPByCEP (String cep);
}
