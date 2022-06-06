package com.demo.sistemaCadastro;

import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.demo.model.Cliente;
import com.demo.model.ClienteService;

@Controller
@ComponentScan("com.demo.model")
public class ClienteController {
	
	@Autowired
	private ApplicationContext context;
	
	public String index() {
		return "index";
	}
	
	/* *** Cadastrar cliente *** */
	@GetMapping("/cliente")
	public String formcliente(Model model) {
		model.addAttribute("cli", new Cliente());
		return "formcliente";
	}
	
	@PostMapping("/cliente")
	public String inserircliente(@ModelAttribute Cliente cli) {
		ClienteService cs = context.getBean(ClienteService.class);
		cs.inserirCliente(cli);
		return "sucesso";
	}
	
	/* *** Visualiar um cliente *** */
	@GetMapping("/perfil/{id}")
	//PathVariable recebe o parametro da rota
	public String getPerfil(@PathVariable("id") int id,
							Model model) {
		ClienteService cs = context.getBean(ClienteService.class);
		Map<String, Object> mapa = cs.getCliente(id);
		model.addAttribute("nome", mapa.get("nome"));
		model.addAttribute("cpf", mapa.get("cpf"));
		model.addAttribute("id", id);
		return "perfil";
	}
	
	/* *** Listar todos os clientes *** */
	@GetMapping("/clientes")
	public String listarClientes(Model model) {
		ClienteService cdao = context.getBean(ClienteService.class);
		List<Map<String, Object>> clientes = cdao.getClientes();
		model.addAttribute("clientes", clientes);
		return "listaClientes";
	}
	
	/* *** Apagar cliente *** */
	@PostMapping("/apagar/cliente/{id}")
	public String apagarCliente(@PathVariable("id") int id) {
		ClienteService cdao = context.getBean(ClienteService.class);
		cdao.deletarCliente(id);
		return "redirect:/clientes"; //redireciona e da um refresh na pagina
	}
	
	/* *** Editar cliente *** */
	@GetMapping("/editar/{id}")
	public String editarPerfil(@PathVariable("id") int id, Model model) {
		ClienteService cs = context.getBean(ClienteService.class);
		Map<String, Object> registro = cs.getCliente(id);
		Cliente cli = new Cliente(id, registro.get("nome").toString(), registro.get("cpf").toString());
		model.addAttribute("cliente", cli);
		model.addAttribute("id", id);
		return "editarCliente";
	}
	
	@PostMapping("/editar/{id}")
	public String atualizarCliente(@PathVariable("id") int id, 
								Model model,
								@ModelAttribute Cliente cli) {
		ClienteService cdao = context.getBean(ClienteService.class);
		cdao.atualizarCliente(id, cli);
		return "redirect:/clientes";
	}
	
	/* *** Busca pelo nome do cliente *** */
	
	@GetMapping("/buscar/nome")
	public String buscarCliente(@ModelAttribute Cliente cli, Model model) {
		ClienteService cdao = context.getBean(ClienteService.class);
		Map<String, Object> registro = cdao.buscarCliente(cli.getNome()).get(0);
		return "redirect:/perfil/" + registro.get("id");
	}
	
	@GetMapping("/buscar")
	public String buscarNome(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "busca";
	}
}
