package br.kge.eti.garagem.services;

import br.kge.eti.garagem.entities.Veiculo;
import br.kge.eti.garagem.repositories.GaragemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author sesideva
 */
@Service
public class GaragemService {
    
    @Autowired
    private GaragemRepository garagemRepository;
    
    public List<Veiculo> findAll() {
        
        List<Veiculo> result = garagemRepository.findAll();
        return result;
    }
    
    public List<Veiculo> findByMarca(String marca) {
    
    List<Veiculo> result = garagemRepository.findByMarcaIgnoreCase(marca);
    return result;
}
    
    
 }
