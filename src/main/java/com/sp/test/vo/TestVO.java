package com.sp.test.vo;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class TestVO {
	
	private String title;
	private String name;
	private String file;
	private MultipartFile file1;
}
