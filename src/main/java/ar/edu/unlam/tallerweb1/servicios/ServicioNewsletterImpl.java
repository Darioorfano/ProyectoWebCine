package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Newsletter;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioNewsletter;

@Service
@Transactional
public class ServicioNewsletterImpl implements ServicioNewsletter {

	@Inject
	RepositorioNewsletter repositorioNewsletter;
	
	
	@Override
	public void guardarEmail(Newsletter newsletter) {
		repositorioNewsletter.guardarEmail(newsletter);
	}

}
