package pl.kuziow.pikachu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PikachuService {

    @Autowired
    private RestTemplate restTemplate;


    public List<Pikachu> allTypes(){
        List<Pikachu> allTypes = new ArrayList<>();

        for (int i = 1; i <=20; i++) {
            allTypes.add(restTemplate.getForObject("https://pokeapi.co/api/v2/type/"+i, Pikachu.class));
        }
        return allTypes;
    }


}
