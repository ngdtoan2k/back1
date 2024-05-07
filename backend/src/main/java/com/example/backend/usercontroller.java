package com.example.backend;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class usercontroller {

private final userreponsitory ur;

    public usercontroller(userreponsitory ur) {
        this.ur = ur;
    }
    @GetMapping("/users")
    public List<user> getAll(){
        return (List<user>) ur.findAll();
    }
//    @PostMapping("/users")
//    void addUser(@RequestBody user user){
//        ur.save(user);
//    }
}
