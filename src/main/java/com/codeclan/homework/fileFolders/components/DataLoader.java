package com.codeclan.homework.fileFolders.components;

import com.codeclan.homework.fileFolders.models.File;
import com.codeclan.homework.fileFolders.models.Folder;
import com.codeclan.homework.fileFolders.models.User;
import com.codeclan.homework.fileFolders.repositories.FileRepository;
import com.codeclan.homework.fileFolders.repositories.FolderRepository;
import com.codeclan.homework.fileFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User("Shantay");
        userRepository.save(user);

        Folder folder = new Folder("poooosh", user);
        folderRepository.save(folder);
        Folder folder1 = new Folder("Salty", user);
        folderRepository.save(folder1);

        File file = new File("stank", ".txt", 35.03, folder);
        fileRepository.save(file);
        File file1 = new File("onia", ".rar", 35.03, folder);
        fileRepository.save(file1);
        File file2 = new File("Juce", ".zip", 35.03, folder);
        fileRepository.save(file2);
        File file3 = new File("me", ".1up", 35.03, folder1);
        fileRepository.save(file3);

    }
}
