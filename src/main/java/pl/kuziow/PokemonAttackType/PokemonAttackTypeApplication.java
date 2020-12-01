package pl.kuziow.PokemonAttackType;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class PokemonAttackTypeApplication {

    private static final Logger log = LoggerFactory.getLogger(PokemonAttackTypeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PokemonAttackTypeApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }


    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        Result quoteOne = restTemplate.getForObject(
                "http://jsonplaceholder.typicode.com/posts/1",
                Result.class);

        Result[] quoteList = restTemplate.getForObject(
                "http://jsonplaceholder.typicode.com/posts",
                Result[].class
        );

        List<Result> results = Arrays.asList(quoteList.clone());

        ResponseEntity<Result[]> responseEntity = restTemplate.getForEntity(
                "http://jsonplaceholder.typicode.com/posts",
                Result[].class);

        List<Result> results2 = Arrays.asList(responseEntity.getBody());

        PokemonResult pokemonResult = restTemplate.getForObject(
                "https://pokeapi.co/api/v2/type/",
                PokemonResult.class);


//        ResponseEntity<PokemonAttackType[]> pokemonAttackTypes = restTemplate.getForEntity(
//                "https://pokeapi.co/api/v2/type/",
//                PokemonAttackType[].class
//        );
//
//        List<PokemonAttackType> pokemonAttackTypeList = Arrays.asList(pokemonAttackTypes.getBody());


        log.info("==== RESTful API Response using Spring RESTTemplate START =======");
        //log.info(result.toString());
        //log.info(results2.toString());
        //log.info(pokemonAttackTypeList.toString());
        log.info(pokemonResult.toString());
        log.info("==== RESTful API Response using Spring RESTTemplate END =======");
    }
}
