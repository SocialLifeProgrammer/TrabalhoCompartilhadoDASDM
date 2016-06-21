package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dao.DAOGenerico;
import modelo.EntidadeAdocao;
import modelo.EntidadeMausTratos;
import utilitarios.ValidaCPF;

@Path("/WebService")
@ApplicationPath("/resource")
public class HelloWebService extends Application {

	//Passa os parametros para o banco
	@POST
	@Path("/addMausTratos")
	public Response addMausTratos(
			@FormParam("cidade") String cidade,
			@FormParam("descricaoAnimal") String descricaoAnimal, @FormParam("endereco") String endereco,
			@FormParam("informacaoContato") String informacaoContato, @FormParam("latitude") Integer latitude,
			@FormParam("longitude") Integer longitude) {

		EntidadeMausTratos mausTratos = new EntidadeMausTratos();

		mausTratos.setCidade(cidade);
		mausTratos.setDescricaoAnimal(descricaoAnimal);
		mausTratos.setEndereco(endereco);
		mausTratos.setInformacaoContato(informacaoContato);
		mausTratos.setLatitude(latitude);
		mausTratos.setLongitude(longitude);

		//Chamar o DAOGenerico e inserir as informacoes no banco (persistir)
		DAOGenerico dao = new DAOGenerico();
		dao.inserir(mausTratos);

		return Response.status(200).entity("As informações foram inseradas com sucesso, verifiqueo banco de dados para consultar").build();
	}

	@POST
	@Path("/addAdocao")
	public Response addAdocao(
		@FormParam ("nomeAnunciante") String nomeAnunciante,
		@FormParam ("cpfAnunciante") String cpfAnunciante,
		@FormParam ("telefone") String telefone,
		@FormParam ("informacaoContato") String informacaoContato,
		@FormParam ("cidade") String cidade,

		@FormParam ("nomeAnimal") String nomeAnimal,
		@FormParam ("descricaoAnimal") String descricaoAnimal,
		@FormParam ("especieAnimal") String especieAnimal,
		@FormParam ("sexoAnimal") String sexoAnimal,
		@FormParam ("porteAnimal") String porteAnimal,
		@FormParam ("idadeAnimal") Integer idadeAnimal,
		@FormParam ("pelagemAnimal") String pelagemAnimal,
	    @FormParam ("racaAnimal") String racaAnimal,
	    @FormParam ("vacinado") Boolean vacinado,
	    @FormParam ("castrado") Boolean castrado,
	    @FormParam ("linkVideo") String linkVideo,
	    @FormParam ("dataCadastro") Date dataCadastro) {
		
		EntidadeAdocao adocao = new EntidadeAdocao();
		
		adocao.setNomeAnunciante(nomeAnunciante);
		adocao.setCpfAnunciante(cpfAnunciante);
		adocao.setTelefone(telefone);
		adocao.setInformacaoContato(informacaoContato);
		adocao.setCidade(cidade);

		adocao.setNomeAnimal(nomeAnimal);
		adocao.setDescricaoAnimal(descricaoAnimal);
		adocao.setEspecieAnimal(especieAnimal);
		adocao.setSexoAnimal(sexoAnimal);
		adocao.setIdadeAnimal(idadeAnimal);
		adocao.setPelagemAnimal(pelagemAnimal);
		adocao.setRacaAnimal(racaAnimal);
		adocao.setVacinado(vacinado);
		adocao.setCastrado(castrado);
		adocao.setLinkVideo(linkVideo);
		adocao.setDataCadastro(dataCadastro);
		
		//chamar dao
		DAOGenerico dao = new DAOGenerico();
		dao.inserir(adocao);
		
		return Response.status(200)
				.entity("As informações foram inseradas com sucesso, verifiqueo banco de dados para consultar")
				.build();
	}

	@POST
	@Path("/addForm")
	public String addUsuario(@FormParam("name") String name, @FormParam("age") int age) {

		return "addUser is called, name : " + name + ", age : " + age;

	}

	@GET
	@Path("/listaString")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pessoa> listaString() {
		// Pode buscar do banco
		List<Pessoa> le = new ArrayList<Pessoa>();
		le.add(new Pessoa("Frank", "ra"));
		le.add(new Pessoa("José", "rb"));

		return le;
	}

	@GET
	@Path("/adds")
	public Response addU(@QueryParam("name") String name, @QueryParam("age") int age) {

		return Response.status(200).entity("addUser is called, name is : " + name + ", age : " + age).build();

	}

	@GET
	@Path("/validaCpf")
	public boolean validarCPF(@QueryParam("cpf") String cpf) {

		if (ValidaCPF.isCPF(cpf)) {
			// return Response.status(200).entity("CPF Válido").build();
			return true;
		}

		// return Response.status(200).entity("CPF Inválido").build();
		return false;

	}

	// http://localhost:8080/ServicoWeb/resource/WebService/hello
	@GET
	@Path("/hello")
	public String getHello() {
		return "Web Service funcionando com sucesso!";
	}

	// http://localhost:8080/ServicoWeb/resource/WebService/msg?nome=Maria
	@GET
	@Path("/msg")
	public Response getMensagem(@QueryParam("nome") String txt) {
		return Response.ok("Ola: " + txt).build();
		// return "Mensagem "+txt;
	}

	// http://localhost:8080/ServicoWeb/resource/WebService/soma?valor1=2&valor2=3
	@GET
	@Path("/soma")
	public int soma(@QueryParam("valor1") int v1, @QueryParam("valor2") int v2) {
		return v1 + v2;

	}

	@GET
	@Path("/somaDouble")
	public Double soma(@QueryParam("valor1") Double v1, @QueryParam("valor2") Double v2) {
		return v1 + v2;

	}
}
