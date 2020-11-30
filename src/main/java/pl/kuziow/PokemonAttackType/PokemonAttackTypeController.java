package pl.kuziow.PokemonAttackType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class PokemonAttackTypeController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {

        // first we need to create the List of all types

        //than we need to search for the type1 in this List and find its url

        //we check if type2 is only one type or list of types, in the secod case we need to devide it to individual types

        //under the url of the first type we search for type 2 in the List of Damage relations and sum up the damage
        //we return the final sum of damages

        //all above methods will be written in the PokemonAttackTypeService.class


        System.out.println("hi");
        return "home";

    }
}
