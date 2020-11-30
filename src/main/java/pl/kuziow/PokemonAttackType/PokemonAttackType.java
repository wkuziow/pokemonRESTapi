package pl.kuziow.PokemonAttackType;

public class PokemonAttackType {

    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "PokemonAttackType{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
