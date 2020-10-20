package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Cartelera;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioCartelera;

@Service
@Transactional
public class ServicioCarteleraImpl implements ServicioCartelera {

	@Inject
	private RepositorioCartelera repositorioCartelera;
	
	@Override
	public void guardarCartelera(Cartelera cartelera) {
		repositorioCartelera.guardarCartelera(cartelera);

	}

}
