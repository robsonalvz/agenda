public class ContatoMembro extends Contato {
	private int idade;
	
	public ContatoMembro(String nome,int idade) {
		super(nome);
		this.idade = idade;
	}

	@Override
	public String getDados() {
		return super.getDados();

	}

	public int getIdade() {
		return idade;
	}

}