package FakeDataBase;

import java.util.HashMap;
import view.CadastroPessoaFisica;

public class PessoaFisicaDataBase {
    
	
	
	private HashMap<Integer, Usuario> usuarios;

    public PessoaFisicaDataBase() {
        usuarios = new HashMap<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public Usuario buscarUsuario(int id) {
        return usuarios.get(id);
    }
    
    PessoaFisicaDataBase db = new PessoaFisicaDataBase();

    Usuario usuario1 = new Usuario(1, "João", "joao@email.com");
    Usuario usuario2 = new Usuario(2, "Maria", "maria@email.com");

    db.adicionarUsuario(usuario1);
    db.adicionarUsuario(usuario2);

    Usuario usuarioBuscado = db.buscarUsuario(1);
    System.out.println(usuarioBuscado.getNome()); // imprime "João"

}
