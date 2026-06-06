package com.example.demo.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CoverLetterDTO;
import com.example.demo.service.CoverLetterServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("ai/v2")
@Slf4j
public class CoverLetterGeneratorController {

	private CoverLetterServiceImpl CoverLetterServiceImpl;

	public CoverLetterGeneratorController(CoverLetterServiceImpl CoverLetterServiceImpl) {
		this.CoverLetterServiceImpl = CoverLetterServiceImpl;
	}

	@PostMapping("/cover-letter")
	public String GenerateCoverLetter(@RequestBody CoverLetterDTO request) throws IOException {
		log.info("Starting the generating Cover Letter");
		return CoverLetterServiceImpl.generateCoverLetter(request);
	}

}
