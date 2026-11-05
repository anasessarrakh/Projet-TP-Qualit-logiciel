package library.service;

import java.util.LinkedHashSet;
import java.util.Set;
import library.model.Lendable;

public class Customer {
    private final String name;
    private final Set<Lendable> checkedOutItems = new LinkedHashSet<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    /** @return true si l'emprunt a eu lieu. */
    public boolean checkOutItem(Lendable item) {
        if (item.isBorrowed() || checkedOutItems.contains(item)) {
            return false;
        }
        item.borrow();
        return checkedOutItems.add(item);
    }

    /** @return true si le retour a eu lieu. */
    public boolean returnItem(Lendable item) {
        if (!checkedOutItems.remove(item)) {
            return false;
        }
        item.returnItem();
        return true;
    }
}
