package com.practice.jwtauth.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.jwtauth.entity.Role;
import com.practice.jwtauth.entity.RolesEnum;

@Repository
public interface RolesRepository extends CrudRepository<Role, Long>{

	Optional<Role> findByRoleName(RolesEnum roleUser);

}
