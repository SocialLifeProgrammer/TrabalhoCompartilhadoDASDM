package service;

import javax.xml.bind.annotation.XmlRootElement;


public class Pessoa {
	private String nome;
	private String end;
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nome, String end){
		this.nome=nome;
		this.end=end;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

}
