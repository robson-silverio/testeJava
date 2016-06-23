package br.com.robson.testeJava.dao.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.robson.testeJava.bean.EnderecoCEP;
import br.com.robson.testeJava.dao.EnderecoCEPDao;
import br.com.robson.testeJava.dao.common.AbstractHibernateDao;

@Repository
public class EnderecoCEPDaoImpl extends AbstractHibernateDao<EnderecoCEP> implements EnderecoCEPDao {

    public EnderecoCEPDaoImpl() {
        super();
        setClazz(EnderecoCEP.class);
    }

    
  
	@SuppressWarnings("deprecation")
	public EnderecoCEP getEnderecoCEPByCEP (String cep){
    	return (EnderecoCEP)getCurrentSession().createCriteria(EnderecoCEP.class).add(Restrictions.eq("cep", cep)).uniqueResult();
    }

}
