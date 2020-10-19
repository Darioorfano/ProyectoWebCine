package ar.edu.unlam.tallerweb1.repositorios;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Newsletter;

@Repository
@Transactional
public class RepositorioNewsletterImpl implements RepositorioNewsletter {
	@Inject
	private SessionFactory sessionFactory;
	
	@Override
	public void guardarEmail(Newsletter newsletter) {
		sessionFactory.getCurrentSession().save(newsletter);
	}
	
	

}
