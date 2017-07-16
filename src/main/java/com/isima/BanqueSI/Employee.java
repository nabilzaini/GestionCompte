package com.isima.BanqueSI;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
@Entity
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long codeEmployee;
	private String nomEmployee;
	@ManyToOne
	@JoinColumn(name="CODE_EMPLOYEE_SUP")
	private Employee employeeSup;
	@ManyToMany
	@JoinTable(name="EMPLOYEE_GRP")
	private Collection<Groupe> groupes;
	
	public long getCodeEmployee() {
		return codeEmployee;
	}
	public void setCodeEmployee(long codeEmployee) {
		this.codeEmployee = codeEmployee;
	}
	public String getNomEmployee() {
		return nomEmployee;
	}
	public void setNomEmployee(String nomEmployee) {
		this.nomEmployee = nomEmployee;
	}
	@JsonIgnore
	public Employee getEmployeeSup() {
		return employeeSup;
	}
	@JsonSetter
	public void setEmployeeSup(Employee employeeSup) {
		this.employeeSup = employeeSup;
	}
	@JsonIgnore
	public Collection<Groupe> getGroupes() {
		return groupes;
	}
	
	@JsonSetter
	public void setGroupes(Collection<Groupe> groupes) {
		this.groupes = groupes;
	}
	public Employee(String nomEmployee) {
		super();
		this.nomEmployee = nomEmployee;
	}
	public Employee() {
		super();
	}
	
}
