package com.practice.jwtauth.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDetails {
	private int statusCode;
	private Date timestamp;
	private String message;
	private String description;

}
