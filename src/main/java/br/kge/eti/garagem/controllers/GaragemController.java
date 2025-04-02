/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.kge.eti.garagem.controllers;

import br.kge.eti.garagem.entities.Veiculo;
import br.kge.eti.garagem.services.GaragemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesideva
 */


@RestController
public class GaragemController {
    
    @Autowired
    private GaragemService garagemService;
    
    
    @GetMapping("/garagem")
    public List<Veiculo> findAll() {
        List<Veiculo> result = garagemService.findAll();
        return result;
    }

    @GetMapping("/marca/{marcaName}")
    
    public List<Veiculo> findByMarcaIgnoreCase(@PathVariable String marcaName) {
        List<Veiculo> result = garagemService.findByMarca(marcaName);
        return result;
    }
    
    
    
    
}
