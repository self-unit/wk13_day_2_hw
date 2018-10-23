package com.codeclan.homework.fileFolders.repositories;

import com.codeclan.homework.fileFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
