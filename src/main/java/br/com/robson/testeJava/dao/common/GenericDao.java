package br.com.robson.testeJava.dao.common;

import java.io.Serializable;

public interface GenericDao<T extends Serializable> extends Operations<T> {
    //
}
