/*
 * Copyright 2019-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example;

import com.example.repository.UserRepository;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class FirestoreSampleApp {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(FirestoreSampleApp.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			writeDocumentFromMap();


		};
	}

	private void writeDocumentFromMap() throws InterruptedException, java.util.concurrent.ExecutionException {
		User alice = new User("Alice", 29, null);
		User bob = new User("Bob", 60, null);

		this.userRepository.save(alice).block();
		this.userRepository.save(bob).block();
		this.userRepository.findAllById()
	}
}

