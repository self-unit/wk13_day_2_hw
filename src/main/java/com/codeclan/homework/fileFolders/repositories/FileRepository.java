package com.codeclan.homework.fileFolders.repositories;

import com.codeclan.homework.fileFolders.models.File;
import com.codeclan.homework.fileFolders.projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
