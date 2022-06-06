package com.demo.model;

import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	
	@Autowired
	ClienteDAO cdao;
	
	public void inserirCliente(Cliente c) {
		cdao.inserirCliente(c);
	}
	
	//Map<String, Object> = nome dos campos (string) e valor do campo
	//Representa um registro do banco de dados ({id: 2, nome: "Ana"})
	public Map<String, Object> getCliente(int id) {
		return cdao.getCliente(id);
	}
	
	//List<Map<String, Object>> = lista dos registros
	public List<Map<String, Object>> getClientes(){
		return cdao.getClientes();
	}
	
	public void deletarCliente(int id) {
		cdao.deletarCliente(id);
	}
	
	public void atualizarCliente(int id, Cliente c) {
		cdao.atualizarCliente(id, c);
	}
	
	public List<Map<String, Object>> buscarCliente(String nome) {
		return cdao.buscarCliente(nome);
	}
}
