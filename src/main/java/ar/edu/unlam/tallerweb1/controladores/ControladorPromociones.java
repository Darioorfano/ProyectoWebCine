package ar.edu.unlam.tallerweb1.controladores;

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
	
}
