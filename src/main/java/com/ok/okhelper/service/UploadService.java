package com.ok.okhelper.service;

import com.ok.okhelper.pojo.vo.UploadVo;
import org.springframework.web.multipart.MultipartFile;

/**
 * Author: zc
 * Date: 2018/4/25
 * Description:
 */
public interface UploadService {
    String upload(MultipartFile file, String tmp_path, String cosPathPrefix);

    /**
     * 本地文件上传
     * @param file
     * @return
     */
    UploadVo localUpload(MultipartFile file);

    /**
     * 本地文件删除
     * @param url
     */
    void localDeleteFile(String url);

}
