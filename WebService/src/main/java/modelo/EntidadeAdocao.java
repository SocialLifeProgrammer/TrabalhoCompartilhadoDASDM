package modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EntidadeAdocao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
    private String nomeAnunciante;
    private String cpfAnunciante;
    private String telefone;
    private String informacaoContato;
    private String cidade;

    private String nomeAnimal;
    private String descricaoAnimal;
    private String especieAnimal;
    private String sexoAnimal;
    private String porteAnimal;
    private Integer idadeAnimal;
    private String pelagemAnimal;
    private String racaAnimal;
    private Boolean vacinado;
    private Boolean castrado;
    private String linkVideo;
    private Date dataCadastro;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeAnunciante() {
		return nomeAnunciante;
	}
	public void setNomeAnunciante(String nomeAnunciante) {
		this.nomeAnunciante = nomeAnunciante;
	}
	public String getCpfAnunciante() {
		return cpfAnunciante;
	}
	public void setCpfAnunciante(String cpfAnunciante) {
		this.cpfAnunciante = cpfAnunciante;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getInformacaoContato() {
		return informacaoContato;
	}
	public void setInformacaoContato(String informacaoContato) {
		this.informacaoContato = informacaoContato;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	public String getDescricaoAnimal() {
		return descricaoAnimal;
	}
	public void setDescricaoAnimal(String descricaoAnimal) {
		this.descricaoAnimal = descricaoAnimal;
	}
	public String getEspecieAnimal() {
		return especieAnimal;
	}
	public void setEspecieAnimal(String especieAnimal) {
		this.especieAnimal = especieAnimal;
	}
	public String getSexoAnimal() {
		return sexoAnimal;
	}
	public void setSexoAnimal(String sexoAnimal) {
		this.sexoAnimal = sexoAnimal;
	}
	public String getPorteAnimal() {
		return porteAnimal;
	}
	public void setPorteAnimal(String porteAnimal) {
		this.porteAnimal = porteAnimal;
	}
	public Integer getIdadeAnimal() {
		return idadeAnimal;
	}
	public void setIdadeAnimal(Integer idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}
	public String getPelagemAnimal() {
		return pelagemAnimal;
	}
	public void setPelagemAnimal(String pelagemAnimal) {
		this.pelagemAnimal = pelagemAnimal;
	}
	public String getRacaAnimal() {
		return racaAnimal;
	}
	public void setRacaAnimal(String racaAnimal) {
		this.racaAnimal = racaAnimal;
	}
	public Boolean getVacinado() {
		return vacinado;
	}
	public void setVacinado(Boolean vacinado) {
		this.vacinado = vacinado;
	}
	public Boolean getCastrado() {
		return castrado;
	}
	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}
	public String getLinkVideo() {
		return linkVideo;
	}
	public void setLinkVideo(String linkVideo) {
		this.linkVideo = linkVideo;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
