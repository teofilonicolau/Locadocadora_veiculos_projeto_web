package tech.ada.locadoraveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tech.ada.locadoraveiculos.service.VeiculoService;

@Controller     //para MVC
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;


}
