package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

@Controller
public class ControladorPaginas {

	@Inject 
	private ServicioLogin servicioLogin;
	
	
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
