package com.isima.BanqueSI.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.isima.BanqueSI.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
