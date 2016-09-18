package Spiaggia.Elements;

import Spiaggia.Prenotazione;

/**
 * Oggetti della spiaggia, il code da senso a l'elemento posizionando in uno spazio preciso.
 */
public interface Element {
    enum Kind {Ombrellone, Empty}

    Kind getKind();
    String getCode();
    void setCode(String c);

    default void setPrenotazione(Prenotazione pre) { throw new UnsupportedOperationException("Questo spazio non è riservabile"); }
    default Prenotazione getPrenotazione() { throw new UnsupportedOperationException("Questo spazio non è riservabile"); }
}
