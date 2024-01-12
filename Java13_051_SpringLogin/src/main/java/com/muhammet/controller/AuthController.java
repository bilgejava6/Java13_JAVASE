package com.muhammet.controller;

import com.muhammet.dto.LoginDto;
import com.muhammet.entity.Auth;
import com.muhammet.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthRepository authRepository;

    @PostMapping("/login")
    @CrossOrigin("*")
    public ResponseEntity<Boolean> doLogin(@RequestBody LoginDto dto){
        Optional<Auth>  auth = authRepository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());
        if(auth.isPresent())
            return ResponseEntity.ok(true);
        else
            return ResponseEntity.ok(false);
    }

    @PostMapping("/register")
    @CrossOrigin("*")
    public ResponseEntity<Auth> doRegister(String username, String password){
        Auth auth = Auth.builder().username(username).password(password).build();
        authRepository.save(auth);
        return ResponseEntity.ok(auth);
    }

    @GetMapping("/findAll")
    @CrossOrigin("*")
    public ResponseEntity<List<Auth>> findAllAuth(){
        return ResponseEntity.ok(authRepository.findAll());
    }
}
