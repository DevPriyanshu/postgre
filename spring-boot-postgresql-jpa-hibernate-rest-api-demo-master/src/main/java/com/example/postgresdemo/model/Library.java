package com.example.postgresdemo.model;

import javax.persistence.*;

@Entity
@Table(name = "library")
public class Library {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Isbn;

    @Column(columnDefinition = "book_name")
    private String b_name;

    @Column(columnDefinition = "author_name")
    private String a_name;

    public Library() {
		super();
	}
    
	public Library(String b_name, String a_name) {
		super();
		this.b_name = b_name;
		this.a_name = a_name;
	}

	public Long getIsbn() {
		return Isbn;
	}

	public String getB_name() {
		return b_name;
	}

	public String getA_name() {
		return a_name;
	}

	public void setIsbn(Long isbn) {
		Isbn = isbn;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

}
