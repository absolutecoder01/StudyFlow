package com.absolutecoder01.studyflow.repository;

import com.absolutecoder01.studyflow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Możesz dodać dodatkowe metody do wyszukiwania użytkowników
}
