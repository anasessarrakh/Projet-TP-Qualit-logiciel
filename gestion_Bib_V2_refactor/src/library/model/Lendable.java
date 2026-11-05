package library.model;

/**
 * Contrat d'un objet pouvant etre emprunte.
 * Library et Customer ne dependent que de cette abstraction
 * (principe d'inversion des dependances).
 */
public interface Lendable {
    void borrow();
    void returnItem();
    boolean isBorrowed();
    String getDescription();
}
