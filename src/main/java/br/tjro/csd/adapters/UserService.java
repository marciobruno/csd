package br.tjro.csd.adapters;

import java.util.List;

import br.tjro.csd.domain.Usuario;

public interface UserService {
     
    public void criarUsuario(Usuario usuario);

    public List<Usuario> getUsuarios();

    public Usuario getUsuarioPorId(Long id);

}
