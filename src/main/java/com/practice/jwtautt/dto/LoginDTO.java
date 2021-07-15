package com.practice.jwtautt.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginDTO {

	@NotBlank
	private String username;

	@NotBlank
	private String password;

}
