package com.mohit.springmongod.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	private String name;
	private int quantity;
	private int price;
}
