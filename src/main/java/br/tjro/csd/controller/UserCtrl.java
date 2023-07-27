package br.tjro.csd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.tjro.csd.adapters.dtos.UserDto;
import br.tjro.csd.service.UsuarioServiceImpl;

@RestController
@RequestMapping("/api/v1/users")
public class UserCtrl {

    @Autowired(required=true)
     UsuarioServiceImpl userService;

    
    UserCtrl(UsuarioServiceImpl userService){
        this.userService = userService;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUSerById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.userService.mapToUserDto(this.userService.getUsuarioPorId(id)));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> findUsers(){        
        return ResponseEntity.ok().body(this.userService.getUsuariosDtos());
    }


}
