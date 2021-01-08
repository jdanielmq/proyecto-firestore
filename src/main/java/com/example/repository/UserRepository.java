package com.example.repository;

import com.example.User;
import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;

public interface UserRepository extends FirestoreReactiveRepository<User> {
}
