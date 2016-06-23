package br.com.robson.testeJava.service;

import br.com.robson.testeJava.bean.EnderecoCEP;
import br.com.robson.testeJava.dao.common.Operations;

public interface EnderecoCEPService extends Operations<EnderecoCEP> {

	public EnderecoCEP getEnderecoCEPByCEP(EnderecoCEP cep);
}
