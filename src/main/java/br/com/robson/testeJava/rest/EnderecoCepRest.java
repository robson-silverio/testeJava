package br.com.robson.testeJava.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.robson.testeJava.bean.EnderecoCEP;
import br.com.robson.testeJava.service.EnderecoCEPService;

@Component
@Path("/json/cep")
public class EnderecoCepRest {

	@Autowired
	private EnderecoCEPService enderecoCEPService;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/get")
	public EnderecoCEP getCep(EnderecoCEP cep) {
		return enderecoCEPService.getEnderecoCEPByCEP(cep);
	}

}
