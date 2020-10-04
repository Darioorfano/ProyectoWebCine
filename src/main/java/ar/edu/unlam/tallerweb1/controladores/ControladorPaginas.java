package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
