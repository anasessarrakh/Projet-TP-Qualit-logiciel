package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;

public class Library {
    private final List<Lendable> items = new ArrayList<>();

    public void addItem(Lendable item) {
        items.add(item);
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    /** Corrige le bug initial : ne retourne que les items non empruntes. */
    public List<Lendable> getAvailableItems() {
        List<Lendable> available = new ArrayList<>();
        for (Lendable item : items) {
            if (!item.isBorrowed()) {
                available.add(item);
            }
        }
        return available;
    }

    /** Polymorphisme a la place du instanceof / cast vers Book. */
    public void listAllItems() {
        for (Lendable item : items) {
            System.out.println(item.getDescription());
        }
    }
}
