package br.tjro.csd;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import br.tjro.CsdApplication;
import br.tjro.csd.domain.FizzBuzz;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
@ContextConfiguration(classes = {CsdApplication.class})
public
 class FizzBuzzTests {
    
    public FizzBuzz fizzBuzz = new FizzBuzz();

   @Test
   void ehDivisivelPorTres(){
      assertEquals(fizzBuzz.ehDivisivelPorTres(3),"Fizz");   
      assertEquals(fizzBuzz.ehDivisivelPorTres(12),"Fizz");    
      
   }


   @Test
   void naoEhDivisivelPorTres(){
      assertEquals(fizzBuzz.ehDivisivelPorTres(1),"1");
      assertEquals(fizzBuzz.ehDivisivelPorTres(4),"4");
   }

   @Test
   void ehDivisivelPorCinco(){
       assertEquals(fizzBuzz.ehDivisivelPorCinco(5),"Buzz");
      assertEquals(fizzBuzz.ehDivisivelPorCinco(15),"Buzz");

   }

   @Test
   void naoEhDivisivelPorCinco(){
      assertEquals(fizzBuzz.ehDivisivelPorTres(4),"4");
   }

   @Test
   void naoEhDivisivelPorTresEhCinco(){
      assertEquals(fizzBuzz.ehDivisivelPorTres(4),"4");
   }


    @Test
    public void fizzBuzz() {
             
      assertEquals(fizzBuzz.ehDivisivelPorTresEhCinco(15),"FizzBuzz");
      assertEquals(fizzBuzz.ehDivisivelPorTresEhCinco(30),"FizzBuzz");          

}
    
  
}
