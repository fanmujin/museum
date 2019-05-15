package com.muzi.museum.web;

import com.muzi.museum.bean.Video;
import com.muzi.museum.dao.result.Result;
import com.muzi.museum.service.IVideoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/Video")
@Api(tags = "video")
public class VideoController {

    @Value("${upload.video-path}")
    private String videoPath;

    @Value("${upload.video-prefix}")
    private String videoPrefix;

    @Autowired
    IVideoService iVideoService;

    @GetMapping("findAllVideo")
    @ApiOperation(value = "查询所有的video")
    public Result findAllVideo() {
        List<Video> list = iVideoService.findAll();
        return Result.success(list);
    }

    @DeleteMapping("deleteById")
    @ApiOperation(value = "通过id删除video")
    public String deleteById(@RequestParam("id") int id) {
        int res = iVideoService.deleteById(id);
        return (res > 0) ? "SUCCESS" : "ERROR";
    }

    @PostMapping("addVideo")
    @ApiOperation(value = "添加新的video")
    public Result addVideo(@RequestParam("file") MultipartFile file) {
        Result result = new Result();
        Video video = doSave(file);
        if (video != null) {
            iVideoService.addVideo(video);
            result.setCode(200);
            result.setData(video);
            result.setMsg("上传成功！");
        } else {
            result.setCode(500);
            result.setMsg("文件为空！");
        }
        return result;
    }

    private Video doSave(MultipartFile file) {
        Video video = null;
        if (file != null) {
            try {
                String fileRealName = file.getOriginalFilename();// 获得原始文件名;
                String filePath = videoPath;
                File savedFile = new File(filePath);
                if (!savedFile.exists()) {
                    savedFile.mkdirs();
                }
                String saveName = videoPrefix + "-" + new Date().getTime() + "-" + fileRealName;
                savedFile = new File(filePath, saveName);
                Logger.getLogger(this.getClass().getName()).log(Level.INFO, "path:" + savedFile.getAbsolutePath());
                boolean isCreateSuccess = savedFile.createNewFile();
                if (isCreateSuccess) { // 转存文件
                    file.transferTo(savedFile); // 第一种
                    //FileUtils.copyInputStreamToFile(file.getInputStream(),savedFile); // 第二种
                }
                video = new Video();
                video.setVideoName(fileRealName.replaceAll("[.][^.]+$", ""));
                video.setVideoUrl("/video/" + saveName);
                video.setLoadUrl(savedFile.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return video;
    }
}