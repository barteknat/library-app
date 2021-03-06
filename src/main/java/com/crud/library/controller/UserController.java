package com.crud.library.controller;

import com.crud.library.dto.UserDto;
import com.crud.library.exception.AlreadyExistsExeption;
import com.crud.library.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public UserDto create(@RequestBody UserDto userDto) throws AlreadyExistsExeption {
        return userService.createUser(userDto);
    }
}
