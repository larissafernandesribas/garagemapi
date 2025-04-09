/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.kge.eti.garagem.repositories;

import br.kge.eti.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sesideva
 */
public interface GaragemRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findByMarcaIgnoreCase(String marca);  
    List<Veiculo> findByModeloIgnoreCase(String modelo);      
    List<Veiculo> findByAno(int ano);
    List<Veiculo> findByCorIgnoreCase(String cor);
}
