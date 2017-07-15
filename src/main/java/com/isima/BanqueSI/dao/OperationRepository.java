package com.isima.BanqueSI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isima.BanqueSI.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

}
