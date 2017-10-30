public class Main {
	
	public static void main(String[] args) {
		Agenda a = new Agenda();
		//Contato membro
		
		Contato cb = new ContatoMembro("Thamires",25);
		cb.setTelefone(new Telefone("3333-5555", "Telefone residencial"));
		cb.setTelefone(new Telefone("99322810", "Telefone celular"));
		a.inserir(cb);
		
		Contato cb1 = new ContatoMembro("Sergio",21);
		cb.setTelefone(new Telefone("3333-7887", "Telefone residencial"));
		cb.setTelefone(new Telefone("996153353", "Telefone celular"));
		a.inserir(cb1);
		
		Contato cb2 = new ContatoMembro("Robson",21);
		cb.setTelefone(new Telefone("3219-0987", "Telefone residencial"));
		cb.setTelefone(new Telefone("999545620", "Telefone celular"));
		a.inserir(cb);
		
		//Contato comercial
		ContatoComercial cc = new ContatoComercial("Degrau", "Design", "Presidente");
		cc.setTelefone(new Telefone("2222-0000", "Telefone residencial"));
		a.inserir(cc);
		
		ContatoComercial cc2 = new ContatoComercial("Elabora", "Comunicação", "Diretor Executivo");
		cc2.setTelefone(new Telefone("3521-0965", "Telefone residencial"));
		a.inserir(cc2);
		
		ContatoComercial cc3 = new ContatoComercial("EJA", "Administração", "Diretor de Projetos");
		cc3.setTelefone(new Telefone("3422-0986", "Telefone residencial"));
		a.inserir(cc3);
		
	
		System.out.println(cb.getDados());
		

	}
}