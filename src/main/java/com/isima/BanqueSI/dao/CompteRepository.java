package com.isima.BanqueSI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isima.BanqueSI.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {

}
