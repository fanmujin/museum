package com.muzi.museum.web;

import com.muzi.museum.dao.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping("/upload")
@Api(tags = "upload")
public class UploadFileController {
    @PostMapping(value = "/upload")
    public Result upload(@RequestParam("file") MultipartFile file) {
        Result result = new Result();
        result.setCode(200);
//        if (file != null) {
//            try {
//                String fileRealName = file.getOriginalFilename();// 获得原始文件名;
//                //String fileUtl = ;
//                String filePath = "F:\\image";
//                File savedFile = new File(filePath);
//                if (!savedFile.exists()) {
//                    savedFile.mkdirs();
//                }
//                savedFile = new File(filePath, fileRealName);
//                result.setMsg("上传成功！");
//                boolean isCreateSuccess = savedFile.createNewFile();
//                if (isCreateSuccess) { // 转存文件
//                    file.transferTo(savedFile); // 第一种
//                    //FileUtils.copyInputStreamToFile(file.getInputStream(),savedFile); // 第二种
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else {
//            result.setCode(500);
//            result.setMsg("文件为空！");
//        }
        // 上传文件 相关逻辑
        return result;
    }


}
