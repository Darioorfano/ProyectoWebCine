package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface RepositorioUsuario {

	Boolean registrarUsuario(Usuario usuario);
	
	
	Usuario consultarUsuario(Usuario usuario);


}
