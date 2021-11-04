package item;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Livro livro1 = new Livro(2,"Harry Potter");
        livro1.setAutor("J.K.H.");
        System.out.println(livro1);

        VHS vhs1 = new VHS(7,"Rei Leão");
        vhs1.setGravadora("Disney");
        vhs1.setDuracao(120.05f);
        vhs1.setTitulo("Lion King");
        System.out.println(vhs1);
        
        CD cd1 = new CD(2,"pagode");
        cd1.setGravadora("gravadora só talentos");
        cd1.setDuracao(5.56f);                
        cd1.setFaixas(3);                    
        cd1.setArtista("Zeca Pagodinho");       
        cd1.setAlbum("Desce mais uma");    
        System.out.println(cd1);

    }
}