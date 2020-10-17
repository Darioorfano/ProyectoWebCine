package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface RepositorioUsuario {

	void registrarUsuario(Usuario usuario);
	
	
	Usuario consultarUsuario(Long id);
	

	Usuario consultarUsuarioPorNombreYApellido(String nombre, String apellido);


	void modificarDatos(Usuario usuario);
 
	
}
