package pl.kuziow.PokemonAttackType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonAttackTypeService {

    @Autowired
    RestTemplate restTemplate;


    public List<PokemonAttackType> allTypes(){
        List<PokemonAttackType> allTypes = new ArrayList<>();

        PokemonResult pokemonResult = restTemplate.getForObject(
                Statics.URLTYPELIST,
                PokemonResult.class);

        allTypes = pokemonResult.getResults();

        return allTypes;
    }


}
