package com.codeclan.homework.fileFolders;

import com.codeclan.homework.fileFolders.models.File;
import com.codeclan.homework.fileFolders.models.Folder;
import com.codeclan.homework.fileFolders.models.User;
import com.codeclan.homework.fileFolders.repositories.FileRepository;
import com.codeclan.homework.fileFolders.repositories.FolderRepository;
import com.codeclan.homework.fileFolders.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileFoldersApplicationTests {

//	@Autowired
//	UserRepository userRepository;
//
//	@Autowired
//	FolderRepository folderRepository;
//
//	@Autowired
//	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void canSaveFile(){
//		User user = new User("Shantay");
//		userRepository.save(user);
//		Folder folder = new Folder("poooosh", user);
//		folderRepository.save(folder);
//		File file = new File("stank", ".txt", 35.03, folder);
//		fileRepository.save(file);
//	}
//
//	@Test
//	public void canSaveFolder(){
//		User user = new User("Hedron");
//		userRepository.save(user);
//		Folder folder = new Folder("Salty", user);
//		folderRepository.save(folder);
//	}
//
//	@Test
//	public void canSaveUser(){
//		User user = new User("Juce");
//		userRepository.save(user);
//	}
}
