package pl.kuziow.PokemonAttackType;

import pl.kuziow.PokemonAttackType.Result;

import java.util.ArrayList;
import java.util.List;

public class PostList {

    private List<Result> resultList;

    public PostList() {
        resultList = new ArrayList<>();
    }

    public List<Result> getResultList() {
        return resultList;
    }

    public void setResultList(List<Result> resultList) {
        this.resultList = resultList;
    }
}
