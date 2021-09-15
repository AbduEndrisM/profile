package com.jeba.profile.controller;

import com.jeba.profile.service.BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;



@RestController
@RequestMapping("v1/user/")
public class BucketController {

    private BucketService bucketService;

    @Autowired
    BucketController(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @PostMapping("upload")
    public String uploadFile(@RequestPart(value = "file") MultipartFile file) {
        return bucketService.uploadFile(file);
    }

    @DeleteMapping("delete")
    public String deleteFile(@RequestPart(value = "url") String fileUrl) {
        return bucketService.deleteFileFromS3Bucket(fileUrl);
    }


}
