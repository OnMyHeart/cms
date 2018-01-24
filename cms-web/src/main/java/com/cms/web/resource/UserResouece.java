package com.cms.web.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResouece {

    @RequestMapping(value = "/getUserByUserId", method = RequestMethod.GET)
    public ResponseEntity getUserByUserId(String userId){
        return ResponseEntity.ok("/login");
    }

}