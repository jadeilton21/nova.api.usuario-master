package usuario.api.nova.repository;

import jdk.jfr.Registered;
import org.springframework.stereotype.Repository;
import usuario.api.nova.doMain.Usuario;

import java.util.List;

@Repository
public class UsuarioRepository {


    public void cadastrar(Usuario usuario) {
        System.out.println("Salvo - Usúario salvo na camada de Repository(banco de dados)");
        System.out.println(usuario);
    }

    public void atualizar(Usuario usuario) {
        System.out.println("Atualizado - Usúario é atualizado na camada de Repository(banco de dados)");
        System.out.println(usuario);
    }

    public void deletar(Integer id) {
    }

    public List<Usuario> listar() {
    }

    public Usuario testarUmUsuario() {
    }
}
