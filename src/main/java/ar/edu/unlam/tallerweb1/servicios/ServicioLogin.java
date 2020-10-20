package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface ServicioLogin {
	
	Usuario consultarUsuarioPorNombreYApellido(String nombre, String apellido);
	
	void modificarDatos(Usuario usuario);

	Boolean registrarUsuario(Usuario usuario);
	
	Usuario consultarUsuario(Usuario usuario);

}
