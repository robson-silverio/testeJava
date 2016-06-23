package br.com.robson.testeJava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.robson.testeJava.bean.Endereco;
import br.com.robson.testeJava.bean.EnderecoCEP;
import br.com.robson.testeJava.dao.EnderecoDao;
import br.com.robson.testeJava.dao.common.Operations;
import br.com.robson.testeJava.service.EnderecoService;
import br.com.robson.testeJava.service.common.AbstractService;

@Service
public class EnderecoServiceImpl extends AbstractService<Endereco> implements EnderecoService {

	@Autowired
	private EnderecoDao dao;

	public EnderecoServiceImpl() {
		super();
	}

	@Override
	protected Operations<Endereco> getDao() {
		return dao;
	}

	@Override
	public Endereco salvarEndereco(Endereco endereco) {
		setEnderecoCep(endereco);
		this.create(endereco);
		return endereco;
	}

	@Override
	public Endereco alterarEndereco(Endereco endereco) {
		setEnderecoCep(endereco);
		this.update(endereco);
		return endereco;
	}

	private void setEnderecoCep(Endereco endereco) {
		Client client = Client.create();

		WebResource webResource = client.resource("http://localhost:8080/RESTfulExample/rest/json/metallica/get");

		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

		if (response.getStatus() != 200) {
			endereco.setRestMessage(
					"Falha ao salvar o endereco : Não foi possível recuperar o endereço pele cep : HTTP error code : "
							+ response.getStatus());
		}
		EnderecoCEP enderecoCEP = response.getEntity(EnderecoCEP.class);
		endereco.setEnderecoCEP(enderecoCEP);
	}
}
