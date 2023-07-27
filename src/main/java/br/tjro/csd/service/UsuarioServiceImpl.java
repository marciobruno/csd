package br.tjro.csd.service;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.tjro.csd.adapters.UserService;
import br.tjro.csd.adapters.dtos.UserDto;
import br.tjro.csd.domain.Usuario;


@Service
public class UsuarioServiceImpl implements UserService{

    private HashMap<Long, Usuario> usuarios = new HashMap<Long,Usuario>();
    // @Autowired(required=true)
    //private UserRepository userRepository;
    

    
    // UsuarioServiceImpl(UserRepository userRepository){
    //     this.userRepository = userRepository;
    // }

    @Override
    public void criarUsuario(Usuario usuario) {
        //userRepository.save(usuario);
        this.usuarios.put(usuario.getId(), usuario);
    }

    @Override
    public List<Usuario> getUsuarios() {
        //return userRepository.findAll();
        return new ArrayList<Usuario>(usuarios.values());
    }

    @Override
    public Usuario getUsuarioPorId(Long id) {
        //return userRepository.findById(id).get();
        return this.usuarios.get(id);
    }


    //User mapper
    public Usuario mapToUser(UserDto dto) {
        Usuario user = new Usuario();
        user.setId(dto.id());
        user.setNome(dto.nome());
        user.setEmail(dto.email());
       

        return user;
    }


    //User mapper
    public UserDto mapToUserDto(Usuario user) {
        if(user != null){
            UserDto dto = new UserDto(user.getId(),user.getNome(),user.getEmail());
            return dto;
        }
        return null;
    }

    public List<UserDto> getUsuariosDtos(){
        //return usuarios.values().stream().map(this::mapToUserDto).collect(Collectors.toList());         
        return getUsuarios().stream().map(this::mapToUserDto).collect(Collectors.toList());         
    }
     
     
    
}
