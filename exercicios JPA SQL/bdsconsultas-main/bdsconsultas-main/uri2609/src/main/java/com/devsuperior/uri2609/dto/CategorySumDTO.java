package com.devsuperior.uri2609.dto;

import com.devsuperior.uri2609.projections.CategorySumProjection;

public class CategorySumDTO implements CategorySumProjection {

	private String name;
	private Long sum;
	


	public CategorySumDTO(String name, Long sum) {
		this.name = name;
		this.sum = sum;
	}

	public CategorySumDTO(CategorySumProjection projection) {
		name = projection.getName();
		sum = projection.getSum();
	}

	public String getName() {
		return name;
	}
	public Long getSum() {
		return sum;
	}



	public String toString() {
		return "CategorySumDTO [name=" + name + ", sum=" + sum + "]";
	}
}
