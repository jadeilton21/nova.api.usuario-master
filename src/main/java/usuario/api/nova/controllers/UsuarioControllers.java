package usuario.api.nova.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import usuario.api.nova.doMain.Usuario;
import usuario.api.nova.repository.UsuarioRepository;

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

}
