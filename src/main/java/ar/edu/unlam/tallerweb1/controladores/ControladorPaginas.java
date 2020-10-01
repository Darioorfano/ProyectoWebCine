package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorPaginas {
	
	
@RequestMapping ("/inicio")
public ModelAndView home() {

return new ModelAndView("index");
}
@RequestMapping("/login")
public ModelAndView login() {
	
	return new ModelAndView("login");
	
}

@RequestMapping("/registro")
public ModelAndView registro() {
	
	return new ModelAndView("registro");
	
}


@RequestMapping ("/recuperaTuCuenta")
public ModelAndView recuperarCuenta() {
	
	return new ModelAndView("contraseñaOlvidada");
}



}
