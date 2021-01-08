package com.example;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.firestore.annotation.PropertyName;
import org.springframework.cloud.gcp.data.firestore.Document;

@Document(collectionName = "usersCollection")
public class User {

	@PropertyName("drink")
	public String favoriteDrink;

	@DocumentId
	private String name;

	private Integer age;

	public User(String name, Integer age, String favoriteDrink) {
		this.favoriteDrink = favoriteDrink;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}

