package br.edu.ifal.formularioandreia;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controlador{

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("form.html");
    }

    @RequestMapping("/form")
    public ModelAndView cadastro(String nome, String email, String cpf){
        
        ModelAndView resposta = new ModelAndView("form.html");
        resposta.addObject( "nome", nome);
        resposta.addObject( "email", email);
        resposta.addObject( "cpf", cpf);

            System.out.println("CHEGOU AQUI!!!");

        return resposta;
    }
}