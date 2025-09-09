package relacionamentos;

public class TesteTime {

	public static void main(String[] args) {
		Atleta atleta1 = new Atleta("Arrascaeta", "Meia");
		Atleta atleta2 = new Atleta("Philipe Coutinho", "Meia");
		Atleta atleta3 = new Atleta("Yuri Alberto", "Atacante");
		
		Time time = new Time("Brasil", "Anceloti", new Atleta[11]);
		
		time.adicionarAtletas(atleta1);
		time.adicionarAtletas(atleta2);
		time.adicionarAtletas(atleta3);
		
		time.imprimirTime();
		
	}

}
