package Spiaggia.Elements;

/**
 * Spazio vuoto nella spiaggia, non riservabile.
 */
public class Empty implements Element{
    private String code;
    private Kind kind = Kind.Empty;

    public Empty(String c) { this.code = c; }

    @Override
    public Kind getKind() { return kind;}

    @Override
    public String getCode() { return code; }

    @Override
    public void setCode(String c) { this.code = c; }
}
