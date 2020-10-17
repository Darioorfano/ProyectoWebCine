package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface ServicioLogin {
	
	
	void registrarUsuario(Usuario usuario);
	Usuario consultarUsuario(Long id);
	Usuario consultarUsuarioPorNombreYApellido(String nombre, String apellido);
	
	void modificarDatos(Usuario usuario);
}
