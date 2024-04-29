package usuario.api.nova.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import usuario.api.nova.repository.UsuarioRepository;

@RestController
public class UsuarioControllers {

    @Autowired
    private UsuarioRepository repository;

}
