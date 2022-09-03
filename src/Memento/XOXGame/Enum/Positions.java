package Memento.XOXGame.Enum;

public enum Positions {
    oneA("one to A"),
    oneB("one to B"),
    oneC("one to C"),
    twoA("two to A"),
    twoB("two to B"),
    twoC("two to C"),
    threeA("three to A"),
    threeB("three to B"),
    threeC("three to C");

    private final String position;

    Positions(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Positions{" +
                "position='" + position + '\'' +
                '}';
    }
}
