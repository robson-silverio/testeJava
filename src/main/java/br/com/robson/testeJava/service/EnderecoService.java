package br.com.robson.testeJava.service;

import br.com.robson.testeJava.bean.Endereco;
import br.com.robson.testeJava.dao.common.Operations;

public interface EnderecoService extends Operations<Endereco> {
    public Endereco salvarEndereco(Endereco endereco);
    public Endereco alterarEndereco(Endereco endereco);
}
