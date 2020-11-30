package pl.kuziow.PokemonAttackType;

import java.util.List;

public class DamageRelations {
    private List<PokemonAttackType> doubleDamageTo;
    private List<PokemonAttackType> halfDamageTo;
    private List<PokemonAttackType> noDamageTo;

    public List<PokemonAttackType> getDoubleDamageTo() {
        return doubleDamageTo;
    }

    public void setDoubleDamageTo(List<PokemonAttackType> doubleDamageTo) {
        this.doubleDamageTo = doubleDamageTo;
    }

    public List<PokemonAttackType> getHalfDamageTo() {
        return halfDamageTo;
    }

    public void setHalfDamageTo(List<PokemonAttackType> halfDamageTo) {
        this.halfDamageTo = halfDamageTo;
    }

    public List<PokemonAttackType> getNoDamageTo() {
        return noDamageTo;
    }

    public void setNoDamageTo(List<PokemonAttackType> noDamageTo) {
        this.noDamageTo = noDamageTo;
    }
}
