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
private RepositorioUsuario servicioLogin;
	
	@Override
	public Boolean registrarUsuario(Usuario usuario) {
		if(servicioLogin.consultarUsuario(usuario)==null) {
			
			return servicioLogin.registrarUsuario(usuario);
		}else {
			return false;
		}
		
	

	}

	@Override
	public Usuario consultarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return servicioLogin.consultarUsuario(usuario);
	}



}
