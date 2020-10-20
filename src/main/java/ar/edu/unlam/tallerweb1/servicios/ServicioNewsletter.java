package ar.edu.unlam.tallerweb1.servicios;
import ar.edu.unlam.tallerweb1.modelo.Newsletter;

public interface ServicioNewsletter {	
	void guardarEmail(Newsletter newsletter);
	Newsletter consultarEmail(Newsletter newsletter);
}
