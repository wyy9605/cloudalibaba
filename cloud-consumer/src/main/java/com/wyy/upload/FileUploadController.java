package com.wyy.upload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(tags = "附件上传下载")
@RequestMapping("fileUploadController")
@RestController
public class FileUploadController {

	
	@GetMapping("upload")
	public void upload() {
		
	}
	
	@GetMapping("download")
	public void download() {
		
	}
}
