package br.com.criandoapi.projeto.Controller;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.criandoapi.projeto.DAO.IUsuario;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController<Usuario> {

	@Autowired
	private IUsuario dao;
	
	@GetMapping
	public List<Usuario> listaUsuario() {
		return (List<Usuario>) dao.findAll();
	}
	
	@PostMapping
	public Usuario criarUsuario (@RequestBody Usuario usuario) {
		Usuario usuarioNovo = dao.save(usuario);
		return usuarioNovo;
	}
}
