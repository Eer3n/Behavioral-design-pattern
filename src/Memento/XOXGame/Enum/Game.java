package Memento.XOXGame.Enum;

public class Game {

    private String move;

    public Game() {
        move = "";
    }

    public Game(String move) {
        this.move = move;
    }

    public void doMove(String newMove) {
        move = move + newMove;
    }

    public void redoMove(GameMemento gameMemento) {
        move = gameMemento.getMove();
    }

    public GameMemento save() {
        return new GameMemento(move);
    }

    public void printMove(){
        System.out.println(move);
    }
}
