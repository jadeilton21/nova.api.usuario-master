package usuario.api.nova.controllers;


import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import usuario.api.nova.doMain.Usuario;
import usuario.api.nova.repository.UsuarioRepository;

import java.util.List;

@RestController
public class UsuarioControllers {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public void cadastrarUsuario(@RequestBody Usuario usuario){
        repository.cadastrar(usuario);
    }
    @PutMapping
    public void atualizarUsuario(@RequestBody Usuario usuario){
        repository.atualizar(usuario);
    }
    @DeleteMapping("/usuario/{id}")
    public void detelarUsuario(@PathVariable ("id") Integer id){
        repository.deletar(id);
    }
    @GetMapping
    public List<Usuario> listarUsuarios(){
        return repository.listar();
    }
    @GetMapping
    public Usuario listarUmUsuario(@PathVariable("id") Integer id){
        return repository.testarUmUsuario(id);
    }

}
