package Spiaggia;

import Spiaggia.Elements.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *Spiaggia su cui vengono disposti gli ombrelloni
 */
public class Spiaggia { //Assente il controllo di possibili code multipli. Da implementare.
    private List<Element> spiaggia = new ArrayList<>();

    public Spiaggia() {}

    public void adder(String k, String c) { //Inserisce un nuovo elemento alla spiaggia
        if(k.equals("Ombrellone") || k.equals("ombrellone")) { spiaggia.add(new Ombrellone(c)); }
        if(k.equals("Empty") || k.equals("empty")) { spiaggia.add(new Empty(c)); }
    }

    public void remover(String k, String c) { //Rimuove un elemento dalla spiaggia
        for(Element e : spiaggia) {
            if(e.getKind().toString().equals(k) && e.getCode().equals(c)) { spiaggia.remove(e); }
            else throw new IllegalArgumentException("Elemento non presente nella spiaggia");
        }
    }

    public List<Element> getSpiaggia() { return spiaggia; }
/*//Non funziona
    public void save() {
        try {
            FileOutputStream saveFile = new FileOutputStream("spiaggiaSave.sav");
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            save.writeObject(spiaggia); save.close();
        } catch(Exception exc){ exc.printStackTrace(); }
    }

    public void load() {
        try {
            FileInputStream loadFile = new FileInputStream("spiaggiaSave.sav");
            ObjectInputStream load = new ObjectInputStream(loadFile);
            spiaggia = (ArrayList) load.readObject(); load.close();
        } catch(Exception exc){ exc.printStackTrace(); }
    }
*/
}
