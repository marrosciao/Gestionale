package Spiaggia;

import Spiaggia.Elements.*;

import java.util.HashMap;
import java.util.Map;

/**
 *Spiaggia su cui vengono disposti gli ombrelloni
 */
public class Spiaggia {
    private Map<String, Element> spiaggia = new HashMap<>();

    public Spiaggia() {}

    public void adder(String k, String c) { //Inserisce un nuovo elemento alla spiaggia
        if(!spiaggia.containsKey(c)) {
            if(k.equals("Ombrellone")) { spiaggia.put(c, new Ombrellone(c)); }
            if(k.equals("Empty")) { spiaggia.put(c, new Empty(c)); }
        }
        else throw new IllegalArgumentException("Spazio già occupato sulla spiaggia");
    }

    public Boolean setter(String c, Element e) { //Imposta uno spazio della spiaggia
        if(spiaggia.containsKey(c)) { spiaggia.replace(c, e); return true; }
        return false;
    }

    public void remover(String c) { spiaggia.remove(c); } //Cancella una spazio dalla spiaggia

    public Map<String, Element> getSpiaggia() { return spiaggia; }

}
