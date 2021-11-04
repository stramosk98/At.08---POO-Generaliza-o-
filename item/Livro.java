package item;

public class Livro extends Item {
	
    private String autor;

    public Livro(int codigo, String descricao) {
        super(codigo, descricao);
    }
    public Livro() {
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        if (autor.length()>0) 
        this.autor = autor;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Livro [Autor=");
        builder.append(autor);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }




}