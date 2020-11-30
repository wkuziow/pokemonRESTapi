package pl.kuziow.PokemonAttackType;

import java.util.List;

public class PokemonResult {

    private int count;
    private String next;
    private String previous;
    private List<PokemonAttackType> results;

    @Override
    public String toString() {
        return "PokemonResult{" +
                "count=" + count +
                ", next='" + next + '\'' + '\n'+
                ", previous='" + previous + '\'' +
                ", results=" + results +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<PokemonAttackType> getResults() {
        return results;
    }

    public void setResults(List<PokemonAttackType> results) {
        this.results = results;
    }
}
