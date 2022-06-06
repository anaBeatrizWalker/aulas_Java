package com.fatec.demo;

import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.fatec.model.Calculadora;

@Controller
@ComponentScan("com.fatec.model")
public class FormController {
	
	@GetMapping("/calcsoma")
	public String formSoma(Model model) {
		model.addAttribute("calc", new Calculadora(0, 0));
		return "formsoma";
	}
	
	@PostMapping("/calcsoma")
	public String calcularSoma(@ModelAttribute Calculadora calc,
								Model model) {
		int n1 = calc.getN1();
		int n2 = calc.getN2();
		int soma = n1 + n2;
		model.addAttribute("resultado", soma);
		return "calcsoma";
	}
}
