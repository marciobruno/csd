package br.tjro.csd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

import br.tjro.CsdApplication;
import br.tjro.csd.adapters.dtos.UserDto;
import br.tjro.csd.controller.UserCtrl;
import br.tjro.csd.domain.Usuario;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(classes = UserCtrl.class, webEnvironment = WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = {CsdApplication.class})
public class UserTests {
    
    @Autowired
    private TestRestTemplate testRestTemplate;

    //@Autowired
   // private UsuarioServiceImpl service;

    Usuario user = new Usuario();

    List<Usuario> lista = new ArrayList<>();

    @BeforeAll
     void iniciar() {
        
        user.setId(1L);
        user.setNome("Márcio Bruno");
        user.setEmail("marcio@tjro.jus.br");

        lista.add(user);
        //service.criarUsuario(user);
        
    }

    @Test
     void buscarUsuarioPorIdTest() {
        Usuario user = new Usuario();
        user.setId(1L);
        user.setNome("Márcio Bruno");
        user.setEmail("marcio@tjro.jus.br");
        
        ResponseEntity<UserDto> response = this.testRestTemplate
            .exchange("/api/v1/users/" + 1, HttpMethod.GET, null, UserDto.class);
    
        
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        
    }

    @Test
     void buscarTodosUsuariosTest() {

        ResponseEntity<UserDto[]> response = this.testRestTemplate
            .exchange("/api/v1/users", HttpMethod.GET, null, UserDto[].class);
    
        assertEquals(response.getStatusCode(), HttpStatus.OK);
    }



}
