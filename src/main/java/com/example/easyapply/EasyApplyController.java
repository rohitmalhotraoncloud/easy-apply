package com.example.easyapply;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EasyApplyController {

    EasyApplyClient easyApplyClient;

    public EasyApplyController(EasyApplyClient easyApplyClient) {
        this.easyApplyClient = easyApplyClient;
    }

    @GetMapping
    public ResponseEntity<String> myTest() {

        return null;
    }

    //Second Commit Develop
}
