package ar.edu.unlam.tallerweb1.repositorios;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Repository
@Transactional
public class RepositorioUsuarioImpl implements RepositorioUsuario {

	@Inject
	private SessionFactory sessionFactory;
	
	
	@Override
	public void registrarUsuario(Usuario usuario) {
		sessionFactory.getCurrentSession().save(usuario);
		
	}


	@Override
	public Usuario consultarUsuario(Long id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Usuario.class, id);
	}

	
	
}
