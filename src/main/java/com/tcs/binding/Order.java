package com.tcs.binding;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

	private String id;
	private Double price;
	private String email;	
}

