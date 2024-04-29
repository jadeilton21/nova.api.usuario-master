package usuario.api.nova.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioControllers {

    @Autowired
    private UsuarioRepository repository;

}
