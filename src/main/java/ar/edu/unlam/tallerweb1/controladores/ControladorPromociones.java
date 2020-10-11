package ar.edu.unlam.tallerweb1.controladores;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorPromociones {
	
	@RequestMapping("/promociones")
	public ModelAndView promociones(){
		ModelMap modelo = new ModelMap();
		modelo.put("titulo","Promociones");
		return new ModelAndView("promociones",modelo);
	}
	
	@RequestMapping("/promocionUno")
	public ModelAndView promocionUno(){
		ModelMap modelo = new ModelMap();
		modelo.put("titulo", "Promocion 1");
		return new ModelAndView("promocionUno",modelo);
	}
	
	@RequestMapping("/promocionDos")
	public ModelAndView promocionDos() {
		ModelMap modelo = new ModelMap();
		modelo.put("titulo", "Promocion 2");
		return new ModelAndView("promocionDos",modelo);
	}
	
	@RequestMapping("/promocionTres")
	public ModelAndView promocionTres(){
		ModelMap modelo = new ModelMap();
		modelo.put("titulo", "Promocion 3");
		return new ModelAndView("promocionTres",modelo );
	}
	
	@RequestMapping("/promocionCuatro")
	public ModelAndView promocionCuatro(){
		ModelMap modelo = new ModelMap();
		modelo.put("titulo", "Promocion 4");
		return new ModelAndView("promocionCuatro",modelo);
	}
	
	@RequestMapping("/promocionCinco")
	public ModelAndView promocionCinco(){
		ModelMap modelo = new ModelMap();
		modelo.put("titulo", "Promocion 5");
		return new ModelAndView("promocionCinco",modelo );
	}
	
	@RequestMapping("/promocionSeis")
	public ModelAndView promocionSeis(){
		ModelMap modelo = new ModelMap();
		modelo.put("titulo", "Promocion 6");
		return new ModelAndView("promocionSeis",modelo );
	}
	
}
