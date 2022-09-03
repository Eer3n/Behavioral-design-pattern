package Memento.XOXGame.Enum;

public class Test {
    public static void main(String[] args) {

        Storage storage = new Storage();

        Game game = new Game();
        game.doMove("Ege:" + Positions.oneA);
        game.doMove("Elif:" + Positions.twoB);
        game.doMove("Ege:" + Positions.twoC);

        saveVersion(storage, game);

        game.doMove("Elif:" + Positions.threeB);

        saveVersion(storage, game);
        game.printMove();

        //mistake!
        game.doMove("Elif:" + Positions.threeB);
        game.printMove();

        undoMove(storage, game);
    }

    public static void saveVersion(Storage storage, Game game){
        GameMemento memento = game.save();
        storage.add(memento);

        game.printMove();
    }

    private static void undoMove(Storage storage, Game game) {
        game.redoMove(storage.getLastMove());
        game.printMove();

    }

}