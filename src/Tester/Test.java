package Tester;

import Spiaggia.Elements.*;
import Spiaggia.*;

import java.util.Date;

/**
 * Sistema di test manuali.
 */
public class Test {

    public static void main(String[] args) {
        Spiaggia beach = new Spiaggia();

        beach.adder("Ombrellone", "1");
        beach.adder("empty", "2");

        for(Element e : beach.getSpiaggia()) {
            if(e.getKind().toString().equals("Ombrellone") && e.getCode().equals("1")) {
                e.setPrenotazione(new Prenotazione("12/2/2016", "23/3/2016", 1, 3, new Cliente("Carlo")));
            }
        }

        System.out.println("Test Cliente: "+beach.getSpiaggia().get(0).getPrenotazione().nomeCliente());
        System.out.println("Test Prenotazione: \n" +
                "\tInizio: "+beach.getSpiaggia().get(0).getPrenotazione().getInizio().format(new Date())+"\n" +
                "\tFine: "+beach.getSpiaggia().get(0).getPrenotazione().getTermine().format(new Date())+"\n" +
                "\tSdraio: "+beach.getSpiaggia().get(0).getPrenotazione().getSdraio()+"\n" +
                "\tLettini: "+beach.getSpiaggia().get(0).getPrenotazione().getLettini() );
        System.out.println("Test Ombrellone: \n" +
                "\tKind: "+beach.getSpiaggia().get(0).getKind().toString()+"\n" +
                "\tCode: "+beach.getSpiaggia().get(0).getCode());
    }

}
