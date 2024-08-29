package com.zxx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 帅的被人砍
 * @create 2024-08-29 15:11
 */
@Slf4j
@RestController
public class UploadController {
    @PostMapping("/upload")
    public void upload(String username, String age, MultipartFile image){
        log.info("-----------------",username,age,image);
    }
}
