package ar.edu.unlam.tallerweb1.controladores;

import java.util.Calendar;
import java.util.Set;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Cartelera;
import ar.edu.unlam.tallerweb1.servicios.ServicioCartelera;

@Controller
public class ControladorCartelera {

	@Inject private ServicioCartelera servicioCartelera;
	
	@RequestMapping(path="/cartelera", method = RequestMethod.GET)
		public ModelAndView cartelera(){
		
		Cartelera cartelera = new Cartelera();
		cartelera.setFecha("25/08/1998");
		cartelera.setHorario(14.00);
		ModelMap modelo = new ModelMap();
		
		servicioCartelera.guardarCartelera(cartelera);
		
		return new ModelAndView("cartelera", modelo);
		
		
		
		
	}
	
	
	
	
	
}

