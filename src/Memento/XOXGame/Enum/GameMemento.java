package Memento.XOXGame.Enum;

public class GameMemento {

    private String move;

    public GameMemento() {
        move = "";
    }

    public GameMemento(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }
}
