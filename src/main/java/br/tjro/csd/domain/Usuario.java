package br.tjro.csd.domain;

import java.io.Serializable;

public class Usuario implements Serializable{
 

    private Long id;

    private String nome;

    private String email;

    private String password;

   /**
    * @return the id
    */
   public Long getId() {
       return id;
   }

   /**
    * @return the email
    */
   public String getEmail() {
       return email;
   }

   /**
    * @return the nome
    */
   public String getNome() {
       return nome;
   }

   /**
    * @return the password
    */
   public String getPassword() {
       return password;
   }

   /**
    * @param id the id to set
    */
   public void setId(Long id) {
       this.id = id;
   }

   /**
    * @param nome the nome to set
    */
   public void setNome(String nome) {
       this.nome = nome;
   }

   /**
    * @param email the email to set
    */
   public void setEmail(String email) {
       this.email = email;
   }

   /**
    * @param password the password to set
    */
   public void setPassword(String password) {
       this.password = password;
   }

}
