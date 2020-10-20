package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioUsuario;

@Service
@Transactional

public class ServicioLoginImpl implements ServicioLogin {

	@Inject
	private RepositorioUsuario repositorioLogin;
	
	@Override
	public void registrarUsuario(Usuario usuario) {
	repositorioLogin.registrarUsuario(usuario);

	}

	@Override
	public Usuario consultarUsuario(Long id) {
		// TODO Auto-generated method stub
		return repositorioLogin.consultarUsuario(id);
	}
	
	@Override
	public Usuario consultarUsuarioPorNombreYApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return repositorioLogin.consultarUsuarioPorNombreYApellido(nombre, apellido);
	}

	@Override
	public void modificarDatos(Usuario usuario) {
		repositorioLogin.modificarDatos(usuario);
	}

	



}
