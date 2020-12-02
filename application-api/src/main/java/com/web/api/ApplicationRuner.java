package com.web.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.web.api.entity.ERole;
import com.web.api.entity.Role;
import com.web.api.repository.RoleRepository;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class ApplicationRuner implements CommandLineRunner {
	
	@Autowired
	private RoleRepository roleRepo;

	@Override
	public void run(String... args) throws Exception {
		log.info("LOgger information.");
		List<Role> l1 = new ArrayList<>();
		Role r1 = new Role(null,ERole.ROLE_ADMIN);
		l1.add(r1);
		Role r2 = new Role(null,ERole.ROLE_MODERATOR);
		l1.add(r2);
		Role r3 = new Role(null,ERole.ROLE_USER);
		l1.add(r3);
		roleRepo.saveAll(l1);
		
	}

}
