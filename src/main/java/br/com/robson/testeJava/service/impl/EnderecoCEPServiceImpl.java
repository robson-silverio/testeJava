package br.com.robson.testeJava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.robson.testeJava.bean.EnderecoCEP;
import br.com.robson.testeJava.dao.EnderecoCEPDao;
import br.com.robson.testeJava.dao.common.Operations;
import br.com.robson.testeJava.service.EnderecoCEPService;
import br.com.robson.testeJava.service.common.AbstractService;

@Service
public class EnderecoCEPServiceImpl extends AbstractService<EnderecoCEP> implements EnderecoCEPService {

	@Autowired
	private EnderecoCEPDao dao;

	public EnderecoCEPServiceImpl() {
		super();
	}

	@Override
	protected Operations<EnderecoCEP> getDao() {
		return dao;
	}

	public EnderecoCEP getEnderecoCEPByCEP(EnderecoCEP enderecoCEP) {
		String cep = enderecoCEP.getCep();
		if (cep != null && !cep.isEmpty()) {
			for (int i = cep.length() - 1; i > -1; i--) {
				enderecoCEP = dao.getEnderecoCEPByCEP(cep);
				if (enderecoCEP != null) {
					break;
				} else {
					StringBuilder sb = new StringBuilder(cep);
					sb.setCharAt(i, '0');
					cep =sb.toString();
				}
			}
			if (enderecoCEP.getId() != null) {
				enderecoCEP.setRestMessage("Pesquisa realizada com sucesso");
			} else {
				enderecoCEP.setRestMessage("Não foi encontrado endereco com o cep solicitado ou similar");
			}
		} else {
			enderecoCEP.setRestMessage("Cep não pode ser nulo");
		}
		return enderecoCEP;
	}
}
