package com.codeclan.homework.fileFolders.repositories;

import com.codeclan.homework.fileFolders.models.User;
import com.codeclan.homework.fileFolders.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
