package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface RepositorioUsuario {

	void registrarUsuario(Usuario usuario);
	Usuario consultarDisponibilidadDeUsuario(Usuario usuario);

}
