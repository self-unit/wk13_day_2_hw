package com.codeclan.homework.fileFolders.projections;

import com.codeclan.homework.fileFolders.models.User;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "EmbedUser", types = User.class)
public interface EmbedUser {

    String getName();

}
