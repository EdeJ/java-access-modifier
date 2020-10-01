package nl.novi.javaprogrammeren.four.hidden;

public class PrisonCell {

    Inhabitant inhabitant;

    public PrisonCell() {
        this.inhabitant = new Inhabitant("Emiel");
    }

    public String getInhabitantName() {
        return inhabitant.getName();
    }
}
