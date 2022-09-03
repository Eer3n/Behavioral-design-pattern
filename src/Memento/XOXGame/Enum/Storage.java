package Memento.XOXGame.Enum;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<GameMemento> list;

    public Storage() {
        list = new ArrayList<>();
    }

    public void add(GameMemento gameMemento) {
        list.add(gameMemento);
    }

    public GameMemento getLastMove() {
        if (!list.isEmpty()) {
            GameMemento memento = list.get(list.size() - 1);
            list.remove(memento);

            return memento;
        } else{
            throw new ArrayIndexOutOfBoundsException("");
        }
    }
}
