package com.api_test.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api_test.Model.ModelClass;

@Repository
public interface RepositoryInterface extends JpaRepository<ModelClass, Integer>
{

}
