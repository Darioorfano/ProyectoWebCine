package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Newsletter;

public interface RepositorioNewsletter {

	void guardarEmail(Newsletter newsletter);
	Newsletter consultarNewsletter(Newsletter newsletter);
}
