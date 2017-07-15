package com.isima.BanqueSI.metier;

import java.util.List;

import com.isima.BanqueSI.Client;

public interface ClientMetier {
	public Client saveClient(Client c);
	public List<Client> listClient();
}
