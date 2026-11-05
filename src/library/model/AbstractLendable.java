package library.model;

/**
 * Responsabilite unique : gerer l'etat d'emprunt.
 * Reutilisable pour tout futur support (DVD, magazine...).
 */
public abstract class AbstractLendable implements Lendable {
    private boolean borrowed;

    @Override
    public void borrow() {
        if (borrowed) {
            throw new IllegalStateException("Already borrowed: " + getDescription());
        }
        borrowed = true;
    }

    @Override
    public void returnItem() {
        if (!borrowed) {
            throw new IllegalStateException("Not borrowed: " + getDescription());
        }
        borrowed = false;
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }
}
