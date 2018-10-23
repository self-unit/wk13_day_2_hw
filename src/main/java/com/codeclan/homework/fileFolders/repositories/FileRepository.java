package com.codeclan.homework.fileFolders.repositories;

import com.codeclan.homework.fileFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
