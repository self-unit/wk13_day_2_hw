package com.codeclan.homework.fileFolders.projections;

import com.codeclan.homework.fileFolders.models.Folder;
import com.codeclan.homework.fileFolders.models.User;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "EmbedFolder", types = Folder.class)
public interface EmbedFolder {

    String getName();
    User getUser();
}
