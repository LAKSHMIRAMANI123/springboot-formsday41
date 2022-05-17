package com.jobiak.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.mvc.model.*;

@Repository      //CURD :)operations
public interface UserRepository extends JpaRepository<User,Long>{

	//Entity class andEntity primary key column type
}
