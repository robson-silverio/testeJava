package br.com.robson.testeJava.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.robson.testeJava.bean.Endereco;
import br.com.robson.testeJava.service.EnderecoService;

@Component
@Path("/json/endereco")
public class EnderecoRest {

	@Autowired
	private EnderecoService enderecoService;

	@POST
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Endereco getEndereco(Endereco endereco) {
		return enderecoService.findOne(endereco.getId());
	}

	@POST
	@Path("/post")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Endereco setEndereco(Endereco endereco) {
		enderecoService.salvarEndereco(endereco);
		endereco.setRestMessage("Endereco criado com sucesso");
		return endereco;
	}

	@PUT
	@Path("/put")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Endereco updateEndereco(Endereco endereco) {
		endereco = enderecoService.alterarEndereco(endereco);
		endereco.setRestMessage("Endereco atualizado com sucesso");
		return endereco;
	}

	@DELETE
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Endereco delEndereco(Endereco endereco) {
		enderecoService.delete(endereco);
		endereco.setRestMessage("Endereco deletado com sucesso");
		return endereco;
	}	

}
