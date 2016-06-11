package Spiaggia;

/**
 *
 */
public class Cliente {
    private String nome; //Nome del cliente
    private String status; //Se è un cliente ricorrente (forse non necessario)

    public Cliente(String n) { this(n, null); }

    public Cliente(String n, String s) {
        if(n == null) { throw new NullPointerException("Inserire nome del cliente"); }
        this.nome = n;
        this.status = s;
    }

    public String name() { return nome; }
    public String status() { return status; }
}
