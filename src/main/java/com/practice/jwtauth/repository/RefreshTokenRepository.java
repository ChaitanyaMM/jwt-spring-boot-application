package com.practice.jwtauth.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.jwtauth.entity.RefreshToken;
import com.practice.jwtauth.entity.User;

@Repository
public interface RefreshTokenRepository extends CrudRepository<RefreshToken, Long>{

	Optional<RefreshToken> findByToken(String token);

	int deleteByUser(User user);

}
