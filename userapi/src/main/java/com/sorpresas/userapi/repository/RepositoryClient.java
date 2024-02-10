package com.sorpresas.userapi.repository;

import com.sorpresas.userapi.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryClient extends JpaRepository <ClientModel, Long> {

}
