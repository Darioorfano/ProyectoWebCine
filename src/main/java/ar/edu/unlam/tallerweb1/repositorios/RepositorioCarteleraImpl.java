package ar.edu.unlam.tallerweb1.repositorios;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Cartelera;

@Repository
public class RepositorioCarteleraImpl implements RepositorioCartelera {

	@Inject
	private SessionFactory sessionFactory;
	
	@Override
	public void guardarCartelera(Cartelera cartelera) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(cartelera);

	}

}
