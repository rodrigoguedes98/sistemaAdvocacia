package Main;
import br.urfpe.advocacia.beans.Advogado;
import br.urfpe.advocacia.beans.Login;

public class Main {
	public static void Main(String args[]){
		
	
	Advogado teste = new Advogado();
	
	teste.setCpf("06502419");
	teste.setNome("Lucas");
	teste.setLogin(new Login("lucas","23142"));
	
	System.out.println(teste);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}