package com.example.controller;

import com.example.pojo.Result;
import com.example.utills.AliOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.channels.MulticastChannel;

@Slf4j
@RestController
public class UploadController {
//本地存储文件
//    @PostMapping("/upload")
//    public Result upload(String username, Integer age , MultipartFile image) throws IOException {
//        log.info("上传文件的用户名是：{}，年龄是：{},文件：{}",username,age,image);
//        //获取原始文件名
//        String originalFilename=image.getOriginalFilename();
//
//        //构造唯一文件名（不能重复）-uuid(通用唯一识别码）936dc298-1617-4ddd-994b-80e308235e17
//        int index=originalFilename.lastIndexOf(".");
//        String extname = originalFilename.substring(index);
//        String newFilename=java.util.UUID.randomUUID().toString()+extname;
//        log.info("新文件名是：{}",newFilename);
//
//        //将文件存储到服务器 F:\test
//        image.transferTo(new java.io.File("F:\\test\\"+newFilename));
//        //将文件
//        return Result.success();
//    }

    @Autowired
    private AliOSSUtils aliOSSUtils;

    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws IOException {
        log.info("文件上传，文件名：{}",image.getOriginalFilename());

        //调用阿里云OSS工具类进行文件上传
        String url = aliOSSUtils.upload(image);
        log.info("文件上传成功，url是：{}",url);

        return Result.success(url);
    }
}
