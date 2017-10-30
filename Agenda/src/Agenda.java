import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> contatos;

	public Agenda() {
		this.contatos = new ArrayList<Contato>();
	}

	public void inserir(Contato c) {
		contatos.add(c);
	}

	public Contato buscarContato(String nome) {
		for (int i = 0; i < contatos.size(); i++) {
			Contato c = contatos.get(i);
			if (c.getNome().equalsIgnoreCase(nome))
				return contatos.get(i);
		}
		return null;
	}

	public Contato[] buscarGeral(String palavraChave) {
		ArrayList<Contato> todos = new ArrayList<Contato>();
		for (int i = 0; i < this.contatos.size(); i++) {
			Contato c = this.contatos.get(i);
			if (c.getDados().contains(palavraChave))
				todos.add(c);
		}
		Contato[] vet = new Contato[todos.size()];
		return (todos.toArray(vet));
	}

	public Contato[] buscarTodos() {
		Contato[] vet = new Contato[contatos.size()];
		return (contatos.toArray(vet));
	}

	public int getQuantidade() {
		return this.contatos.size();
	}
}