package pl.kuziow.pikachu;

import pl.kuziow.pikachu.Pikachu;

import java.util.List;

public class DamageRelations {
    private List<Pikachu> doubleDamageTo;
    private List<Pikachu> halfDamageTo;
    private List<Pikachu> noDamageTo;

    public List<Pikachu> getDoubleDamageTo() {
        return doubleDamageTo;
    }

    public void setDoubleDamageTo(List<Pikachu> doubleDamageTo) {
        this.doubleDamageTo = doubleDamageTo;
    }

    public List<Pikachu> getHalfDamageTo() {
        return halfDamageTo;
    }

    public void setHalfDamageTo(List<Pikachu> halfDamageTo) {
        this.halfDamageTo = halfDamageTo;
    }

    public List<Pikachu> getNoDamageTo() {
        return noDamageTo;
    }

    public void setNoDamageTo(List<Pikachu> noDamageTo) {
        this.noDamageTo = noDamageTo;
    }
}
