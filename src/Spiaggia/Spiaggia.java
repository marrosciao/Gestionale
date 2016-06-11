package Spiaggia;

import Elements.Ombrellone;

import java.util.Set;

/**
 *Spiaggia su cui vengono disposti gli ombrelloni
 */
public class Spiaggia { //La spiaggia dovrebbe contenere anche spazi vuoti, probabilmente un set di ombrelloni è poco inclusivo
    private Set<Ombrellone> spiaggia;

    public Spiaggia() {}

    public void adder(String c) { spiaggia.add(new Ombrellone(c)); } //Inserisce un nuovo ombrellone alla spiaggia
    public void remover(String c) { //Rimuove un ombrellone dalla spiaggia
        if(c == null) { throw new NullPointerException("Inserire il codice di un ombrellone"); }
        for(Ombrellone o : spiaggia) { if(o.getCode().equals(c)) { spiaggia.remove(o); } }
    }

}
