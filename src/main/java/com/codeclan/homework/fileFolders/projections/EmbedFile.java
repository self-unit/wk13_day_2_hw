package com.codeclan.homework.fileFolders.projections;

import com.codeclan.homework.fileFolders.models.File;
import com.codeclan.homework.fileFolders.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "EmbedFile", types = File.class)
public interface EmbedFile {

    String getName();
    String getExtension();
    double getSize();
    Folder getFolder();
}