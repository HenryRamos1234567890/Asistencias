package com.ESFE.Asistencias.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String index(){
        // Retorna el nombre de la plantilla Thymeleaf que deseas renderizar
        return "home/index"; // Asegúrate de que exista un archivo "index.html" en src/main/resources/templates/
    }
}

