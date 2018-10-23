package com.codeclan.homework.fileFolders.repositories;

import com.codeclan.homework.fileFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
