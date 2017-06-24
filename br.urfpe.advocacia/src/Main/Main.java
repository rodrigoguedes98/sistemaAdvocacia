package Main;
import br.ufrpe.advocacia.DAO.AdvogadoDAO;
import br.urfpe.advocacia.beans.Advogado;
import br.urfpe.advocacia.beans.Login;

public class Main {
	public static void main(String args[]){
		
	
	Advogado teste = new Advogado();
	
	teste.setCpf("06502419");
	teste.setNome("Lucas");
	teste.setLogin(new Login("lucas","23142"));
	
	AdvogadoDAO teste1 = new AdvogadoDAO();
	
	teste1.cadastrarAdvogado(teste);
	
	
	System.out.println(teste);
	
	}
}