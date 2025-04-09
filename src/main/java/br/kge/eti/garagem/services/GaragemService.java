package br.kge.eti.garagem.services;

import br.kge.eti.garagem.DTO.VeiculoMinDTO;
import br.kge.eti.garagem.entities.Veiculo;
import br.kge.eti.garagem.repositories.GaragemRepository;
import java.util.List;
import java.util.Optional;
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
    
    
    /**
     * 
     * 
     * @param modelo
     * @return
     */
    
    public List<VeiculoMinDTO> findByModelo(String modelo) {
        List<Veiculo> resultGaragem = garagemRepository.findByModeloIgnoreCase(modelo);
        
        List<VeiculoMinDTO> resultDTO = resultGaragem.stream().map(x -> new VeiculoMinDTO(x)).toList();
        
        return resultDTO;
  
    
    }
 
          public Optional<Veiculo> findById(Long id) {
          return garagemRepository.findById(id);
         }

    public List<VeiculoMinDTO> findByCor(String cor) {
    List<Veiculo> result = garagemRepository.findByCorIgnoreCase(cor);
    return result.stream().map(VeiculoMinDTO::new).toList();
    }

         public List<Veiculo> findByAno(int ano) {
    
        List<Veiculo> result = garagemRepository.findByAno(ano);
          return result;
}


}
