package com.sp.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sp.test.vo.TestVO;

@Controller
public class TestController {
	@GetMapping("/views/upload")
	public String goUpload(){
		return "upload";
	}
	@PostMapping("/test")
	public String doUpload(@ModelAttribute TestVO testvo, Model model) {
		testvo.setFile(testvo.getFile1().getOriginalFilename());
		model.addAttribute("test", testvo);
		return "complete";
	}

}
