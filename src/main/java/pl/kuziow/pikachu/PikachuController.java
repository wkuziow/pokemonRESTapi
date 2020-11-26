package pl.kuziow.pikachu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PikachuController {


    @RequestMapping(value = "/{type1}/{type2}", method = RequestMethod.GET)
    public int home(@PathVariable String type1, String type2){

        // first we need to create the List of all types

        //than we need to search for the type1 in this List and find its url

        //we check if type2 is only one type or list of types, in the secod case we need to devide it to individual types

        //under the url of the first type we search for type 2 in the List of Damage relations and sum up the damage
        //we return the final sum of damages

        //all above methods will be written in the PikachuService.class



        return



    }
}
