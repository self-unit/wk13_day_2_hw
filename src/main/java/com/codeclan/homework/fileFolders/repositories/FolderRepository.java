package com.codeclan.homework.fileFolders.repositories;

import com.codeclan.homework.fileFolders.models.Folder;
import com.codeclan.homework.fileFolders.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
