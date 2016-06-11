package Spiaggia;

import java.text.SimpleDateFormat;

/**
 * Spiaggia.Prenotazione viene applicato a Spiaggia.Elements.Ombrellone
 */
public class Prenotazione {
    private SimpleDateFormat inizio;
    private SimpleDateFormat termine;
    private int sdraio;
    private int lettini;
    private Cliente cliente;
    private String note;

    public Prenotazione(String init, String term, int s, int l, Cliente c) {
        if(s < 0 || l < 0) { throw new IllegalArgumentException("Il numero di lettini o sdraio deve essere maggiore o uguale a 0"); }
        try { this.inizio = new SimpleDateFormat(init); } catch (ClassCastException e) {} //Se init è errata fare qualcosa
        try { this.termine = new SimpleDateFormat(term); } catch (ClassCastException e) {}
        this.sdraio = s;
        this.lettini = l;
        this.cliente = c;
    }

    public void setNote(String s) { note = s; }
    public void setInizio(String init) { inizio = new SimpleDateFormat(init); }
    public void setTermine(String term) { termine = new SimpleDateFormat(term); }
    public void setSdraio(int s) { sdraio = s; }
    public void setLettini(int l) { lettini = l; }
    public void setCliente(Cliente c) { cliente = c; }

    public SimpleDateFormat getInizio() { return inizio; }
    public SimpleDateFormat getTermine() { return termine; }
    public int getSdraio() { return sdraio; }
    public int getLettini() { return lettini; }
    public String nomeCliente() { return cliente.name(); } //Solo il nome
    public String getNote() { return note; }
}
