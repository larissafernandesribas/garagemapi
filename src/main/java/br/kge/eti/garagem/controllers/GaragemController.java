/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.kge.eti.garagem.controllers;

import br.kge.eti.garagem.DTO.VeiculoMinDTO;
import br.kge.eti.garagem.entities.Veiculo;
import br.kge.eti.garagem.services.GaragemService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    
    
    @GetMapping("/forsale")
    public List<Veiculo> findAll() {
        List<Veiculo> result = garagemService.findAll();
        return result;
    }
    
    @GetMapping("/forsale/{id}")
    public ResponseEntity<VeiculoMinDTO> findById(@PathVariable Long id) {
    Optional<Veiculo> result = garagemService.findById(id);
    
    return result.map(veiculo -> ResponseEntity.ok(new VeiculoMinDTO(veiculo)))
                 .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/marca/{marcaName}")
    
    public ResponseEntity<List<Veiculo>> findByMarcaIgnoreCase(@PathVariable String marcaName) {
        List<Veiculo> result = garagemService.findByMarca(marcaName);
      
    if (result.isEmpty()) {
        //lista vazia.
        //notFound devolve 404
        return ResponseEntity.notFound().build();
        
    }    else {
        //tem dados.
        //devolve 200
        return ResponseEntity.ok(result);
        
    }
    }
    
    @GetMapping("/modelo/{modeloName}")
    public ResponseEntity<List<VeiculoMinDTO>> findByModeloIgnoreCase(@PathVariable String modeloName) {
        
        List<VeiculoMinDTO> result = garagemService.findByModelo(modeloName);
        if (result.isEmpty()){
            //lista vazia
            //devolve 404 not found
            return ResponseEntity.notFound().build();
        } else {
            //eba tem dados
            //devolve 200
          return ResponseEntity.ok(result);
        }
    }
    
   @GetMapping("/color/{corName}")
    public ResponseEntity<List<VeiculoMinDTO>> findByCorIgnoreCase(@PathVariable String corName) {
        
        List<VeiculoMinDTO> result = garagemService.findByCor(corName);
        if (result.isEmpty()){
            //lista vazia
            //devolve 404 not found
            return ResponseEntity.notFound().build();
        } else {
            //eba tem dados
            //devolve 200
          return ResponseEntity.ok(result);
        }
    }
    
    
    @GetMapping("/year/{ano}")
    public ResponseEntity<List<Veiculo>> findByAno(@PathVariable int ano) {
    List<Veiculo> result = garagemService.findByAno(ano);
    if (result.isEmpty()) {
        return ResponseEntity.notFound().build();
    } else {
        return ResponseEntity.ok(result);
    }

    
    }
    
    
    
}


