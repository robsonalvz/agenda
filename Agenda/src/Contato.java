import java.util.ArrayList;

public abstract class Contato {
	private String nome;
	private ArrayList<Telefone> telefones;

	public Contato(String nome) {
		this.nome = nome;
		this.telefones = new ArrayList<Telefone>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(Telefone tf) {
		this.telefones.add(tf);
	}

	public String getDados() {
		String s = this.nome + "\n";
		for (Telefone t : this.telefones) {
			s += t.getTelefone() + "\n";
		}
		return s;
	}
}