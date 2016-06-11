package Elements;


import Spiaggia.Prenotazione;

/**
 * Elements.Ombrellone, contiene una prenotazione. Una prenotazione sola per giornata.
 */
public class Ombrellone implements Element {
    private Kind kind = Kind.Ombrellone;
    private String code;
    private Prenotazione prenotazione;

    public Ombrellone(String c) { this(c, null); } //Ombrellone senza prenotazione

    public Ombrellone(String c, Prenotazione pre) {
        this.code = c;
        this.prenotazione = pre;
    }

    @Override
    public Kind getKind() { return kind; }

    @Override
    public String getCode() { return code; }

    @Override
    public void setCode(String c) { this.code = c; }

    @Override
    public void setPrenotazione(Prenotazione pre) { this.prenotazione = pre; }

    @Override
    public Prenotazione getPrenotazione() { return prenotazione; }

}
