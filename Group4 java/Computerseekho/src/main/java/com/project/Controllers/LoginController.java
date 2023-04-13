package com.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entities.Authentication;
import com.project.Entities.LoginRequest;
import com.project.Entities.LoginResponse;
import com.project.Repositories.AuthenticationRepository;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class LoginController 
{
	@Autowired
    private AuthenticationRepository authentication;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        Authentication person = authentication.findAll().stream()
	            .filter(user -> user.getUserName().equals(request.getUserName()) && user.getPassword().equals(request.getPassword()))
	            .findFirst()
	            .orElse(null);
        if (person != null && person.getUserName().equals(request.getUserName()) && person.getPassword().equals(request.getPassword())) {
            return ResponseEntity.ok(new LoginResponse(true));
        }
        return ResponseEntity.ok(new LoginResponse(false));
    }

}
