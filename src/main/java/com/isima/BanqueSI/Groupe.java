package com.isima.BanqueSI;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Groupe implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long codeGoupe;
	private String nomGroupe;
	@ManyToMany(mappedBy="groupes")
	private Collection<Employee> employes;
	public long getCodeGoupe() {
		return codeGoupe;
	}
	public void setCodeGoupe(long codeGoupe) {
		this.codeGoupe = codeGoupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	public Collection<Employee> getEmployes() {
		return employes;
	}
	public void setEmployes(Collection<Employee> employes) {
		this.employes = employes;
	}
	public Groupe() {
		super();
	}
	public Groupe(long codeGoupe, String nomGroupe) {
		super();
		this.codeGoupe = codeGoupe;
		this.nomGroupe = nomGroupe;
	}
	
}
