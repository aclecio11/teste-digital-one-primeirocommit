package entities;

import java.util.Objects;

public class Carro {

	public String nome;
	public String marca;
	public String cor;
	public int ano;

	public Carro(String nome, String marca, String cor, int ano) {
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;

	}

	public Carro() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ano, cor, marca, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return ano == other.ano && Objects.equals(cor, other.cor) && Objects.equals(marca, other.marca)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Carro [nome = " + nome + ", marca = " + marca + ", cor = " + cor + ", ano = " + ano + "]";
	}

}
