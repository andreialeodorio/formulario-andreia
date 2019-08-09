package br.edu.ifal.formularioandreia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controlador{
    @Autowired
    AlunoRepositorio estudante;
    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("form.html");
    }

    @RequestMapping("/form")
    public ModelAndView cadastro(Aluno aluno){
        estudante.save(aluno);
        return new ModelAndView("form.html");
    }
}