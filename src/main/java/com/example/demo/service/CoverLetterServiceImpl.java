package com.example.demo.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Map;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CoverLetterDTO;

@Service
public class CoverLetterServiceImpl {

	private final ChatClient chatClient;

	public CoverLetterServiceImpl(ChatClient chatClient) {
		this.chatClient = chatClient;
	}

	public String generateCoverLetter(CoverLetterDTO request) throws IOException {

		String template = new String(
				new ClassPathResource("prompts/cover-letter-prompt.txt").getInputStream().readAllBytes(),
				StandardCharsets.UTF_8);

		Map<String, String> placeholders = Map.ofEntries(Map.entry("candidateName", value(request.getCandidateName())),
				Map.entry("currentRole", value(request.getCurrentRole())),
				Map.entry("currentLocation", value(request.getCurrentLocation())),
				Map.entry("candidatePhoneNumber", value(request.getCandidatePhoneNumber())),
				Map.entry("candidateEmail", value(request.getCandidateEmail())),
				Map.entry("linkedInUrl", value(request.getLinkedInUrl())),
				Map.entry("githubUrl", value(request.getGithubUrl())),
				Map.entry("portfolioUrl", value(request.getPortfolioUrl())),
				Map.entry("currentDate", LocalDate.now().toString()),
				Map.entry("companyName", value(request.getCompanyName())),
				Map.entry("companyAddress", value(request.getCompanyAddress())),
				Map.entry("jobTitle", value(request.getJobTitle())),
				Map.entry("hiringManagerName", value(request.getHiringManagerName())),
				Map.entry("currentCompany", value(request.getCurrentCompany())),
				Map.entry("totalExperience", value(request.getTotalExperience())),
				Map.entry("employmentType", value(request.getEmploymentType())),
				Map.entry("primarySkills", value(request.getPrimarySkills())),
				Map.entry("secondarySkills", value(request.getSecondarySkills())),
				Map.entry("frameworks", value(request.getFrameworks())),
				Map.entry("databases", value(request.getDatabases())),
				Map.entry("cloudTechnologies", value(request.getCloudTechnologies())),
				Map.entry("tools", value(request.getTools())),
				Map.entry("projectName", value(request.getProjectName())),
				Map.entry("projectDescription", value(request.getProjectDescription())),
				Map.entry("projectTechnologies", value(request.getProjectTechnologies())),
				Map.entry("projectAchievement", value(request.getProjectAchievement())),
				Map.entry("achievements", value(request.getAchievements())),
				Map.entry("certifications", value(request.getCertifications())),
				Map.entry("degree", value(request.getDegree())),
				Map.entry("collegeName", value(request.getCollegeName())),
				Map.entry("graduationYear", value(request.getGraduationYear())),
				Map.entry("resumeSummary", value(request.getResumeSummary())),
				Map.entry("jobDescription", value(request.getJobDescription())));

		for (Map.Entry<String, String> entry : placeholders.entrySet()) {
			template = template.replace("{" + entry.getKey() + "}", entry.getValue());
		}

		return chatClient.prompt().system("""
				You are an expert HR recruiter and ATS-optimized cover letter writer.

				Generate highly professional and cleanly formatted cover letters.
				Maintain exact formatting and proper paragraph spacing.
				""").user(template).options(OpenAiChatOptions.builder().temperature(0.5).maxTokens(900).build()).call()
				.content();
	}

	private String value(String input) {
		return input == null ? "" : input;
	}
}