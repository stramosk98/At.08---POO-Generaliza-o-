package item;

public class VHS extends Midia {

	  private String titulo;


	    public VHS(int codigo, String descricao) {
	        super(codigo, descricao);
	    }
	    public VHS() {
	    }


	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        if (titulo.length()>0) 
	        this.titulo = titulo;
	    }
	    @Override
	    public String toString() {
	        StringBuilder builder = new StringBuilder();
	        builder.append("VHS [Titulo=");
	        builder.append(titulo);
	        builder.append(", toString()=");
	        builder.append(super.toString());
	        builder.append("]");
	        return builder.toString();
	    }

	    
	    
	    
	}