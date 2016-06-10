package Spiaggia;

/**
 * Spiaggia.Ombrellone, contiene una prenotazione. Una prenotazione sola per giornata.
 */
public class Ombrellone {
    private Prenotazione prenotazione;
    private String code;

    public Ombrellone(String c) { this.code = c; } //Inizializzato con un codice indentificativo, ad esempio la posizione

    public String getCode() { return code; }

    public void setCode(String c) { this.code = c; } //Codice identificativo per l'ombrellone
    public void setPrenotazione(Prenotazione pre) { this.prenotazione = pre; } //Se si vuole cambiare la prenotazione

}
