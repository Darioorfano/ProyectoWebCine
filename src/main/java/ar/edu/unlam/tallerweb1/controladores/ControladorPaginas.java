package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

	ModelMap modelo=new ModelMap();
	return new ModelAndView("login",modelo);

}




@RequestMapping("/registro")
public ModelAndView registro() {
	ModelMap modelo=new ModelMap();
	return new ModelAndView("registro",modelo);
	
}


@RequestMapping ("/recuperaTuCuenta")
public ModelAndView recuperarCuenta() {
	ModelMap modelo=new ModelMap();
	return new ModelAndView("contraseñaOlvidada",modelo);
}



}
