package item;

public class Item {
    private int codigo;
    private String descricao;

    public Item(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Item() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() > 0) {
            this.descricao = descricao;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Item [codigo=");
        builder.append(codigo);
        builder.append(", descri��o=");
        builder.append(descricao);
        builder.append("]");
        return builder.toString();
    }

}