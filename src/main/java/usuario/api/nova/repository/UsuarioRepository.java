package usuario.api.nova.repository;

import jdk.jfr.Registered;
import org.springframework.stereotype.Repository;
import usuario.api.nova.doMain.Usuario;

import java.util.ArrayList;
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
        System.out.println(String.format("DELETAR/ID - Deletando o id: %d e excluido o usuario", id));
        System.out.println(id);
    }

    public List<Usuario> listar() {
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("jadeilton","password"));
        usuarios.add(new Usuario("jade","masterpass"));
        return usuarios;
    }

    public Usuario testarUmUsuario(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("jade","password");
    }
}
