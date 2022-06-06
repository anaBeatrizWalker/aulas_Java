package com.fatec.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //annotation
public class PrincipalController {
	
	@GetMapping("/") //mapeia rota principal
	public String index() {
		return "index"; //chama o template index.html
	}
	
	@GetMapping("/pagina2")
	public String pagina2() {
		return "pagina2";
	}
	
	@GetMapping("/pagina3")
	public String pagina3() {
		return "pagina3";
	}
}
