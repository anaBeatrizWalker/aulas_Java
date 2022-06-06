package com.fatec.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

//PARAMENTROS EM ROTAS

@Controller
public class ParamentroController {
	
	@GetMapping("/soma")
	public String somar(@RequestParam(name = "n1", required = true)String n1, 
						@RequestParam(name = "n2", required = true)String n2,
						Model model) {
		int x = Integer.parseInt(n1);
		int y = Integer.parseInt(n2);
		int soma = x + y;
		model.addAttribute("resultado", soma); //template usa variável resultado
		return "soma";
	}
	
	@GetMapping("/multiplica/n1/{n1}/n2/{n2}")
	public String multiplica(@PathVariable("n1") int n1, 
							@PathVariable("n2") int n2,
							Model model) { //model conecta com frontend
		int multiplicar = n1*n2;
		model.addAttribute("resultado", multiplicar); //template usa variável resultado
		return "multiplica";
	}	
}
