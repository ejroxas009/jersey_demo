package org.revalida.example.spring_jersey_demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.revalida.example.spring_jersey_demo.model.Account;
import org.revalida.example.spring_jersey_demo.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/account")
public class AccountController {

	@Autowired
	AccountRepo accountRepo;
//	@GET
//	@Produces({MediaType.APPLICATION_JSON})
//	public List<String> getAccount(){
//		List<String> accounts = new ArrayList<>();
//		accounts.add("EJ Roxas");
//		accounts.add("Emman");
//		return accounts;
//	}
	

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Account> getAccount(){
		List<Account> accounts = accountRepo.findAll(); 
		return accounts;
	}
	
	@GET
	@Path("/{accountId}")
	@Produces({MediaType.APPLICATION_JSON})
	public Optional<Account> getAccountById(@PathParam("accountId") Long id) {
		Optional<Account> account = accountRepo.findById(id);
		System.out.println(account);
		return account;
	}
	
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public Response saveAccount(Account account) {
		accountRepo.save(account);
		return Response.ok().build();
	}
}
