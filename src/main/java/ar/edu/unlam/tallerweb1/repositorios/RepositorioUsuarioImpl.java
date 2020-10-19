package ar.edu.unlam.tallerweb1.repositorios;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;



import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Repository
@Transactional
public class RepositorioUsuarioImpl implements RepositorioUsuario {

	@Inject
	private SessionFactory sessionFactory;
	
	
	@Override
	public Boolean registrarUsuario(Usuario usuario) {
		try {
			sessionFactory.getCurrentSession().save(usuario);
			return true;
		}
		catch(Exception e) {
			return false;
		}
		
		
	}

/* Valida si el usuario se encuentra registrado en la base de datos*/
	@Override
	public Usuario consultarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		final Session session = sessionFactory.getCurrentSession();
		return (Usuario) session.createCriteria(Usuario.class)
		.add(Restrictions.eq("email", usuario.getEmail()))
		.add(Restrictions.eq("contraseña", usuario.getContraseña()))
		.uniqueResult();
	
	}
	
	
}
