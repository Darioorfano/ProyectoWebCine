package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Newsletter;

public interface ServicioNewsletter {
	
	void guardarEmail(Newsletter newsletter);
}
