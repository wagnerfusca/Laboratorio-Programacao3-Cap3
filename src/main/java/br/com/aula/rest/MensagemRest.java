package br.com.aula.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.aula.model.Calculadora;
import br.com.aula.model.Produto;

@Path("/mensagem")
public class MensagemRest {
	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {
		String result = "Exemplo de RESTFul: " + msg;
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response somar(Calculadora calculadora) {
		String result = "Resultado Da Soma : " + calculadora.somar();
		return Response.status(200).entity(result).build();

	}

	@PUT
	@Path("/put")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Produto produto) {
		String result = "Produto Inserido : " + produto.toString();
		return Response.status(200).entity(result).build();

	}
	
	@DELETE
	@Path("/delete/{param}")
	public Response remover(@PathParam("param") String id) {
		String result = "Identificador a remover: " + id;
		return Response.status(200).entity(result).build();

	}

}