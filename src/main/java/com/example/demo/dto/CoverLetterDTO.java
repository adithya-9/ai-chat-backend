package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CoverLetterDTO {

	// Candidate Information
	private String candidateName;
	private String candidateEmail;
	private String candidatePhoneNumber;
	private String currentLocation;

	// Professional Links
	private String linkedInUrl;
	private String githubUrl;
	private String portfolioUrl;

	// Job Information
	private String jobTitle;
	private String companyName;
	private String hiringManagerName;
	private String companyAddress;
	private String employmentType;

	// Experience
	private String totalExperience;
	private String currentCompany;
	private String currentRole;

	// Technical Information
	private String primarySkills;
	private String secondarySkills;
	private String frameworks;
	private String databases;
	private String cloudTechnologies;
	private String tools;

	// Project Information
	private String projectName;
	private String projectDescription;
	private String projectTechnologies;
	private String projectAchievement;

	// Career Information
	private String achievements;
	private String certifications;

	// Education
	private String degree;
	private String collegeName;
	private String graduationYear;

	// Resume + JD
	private String resumeSummary;
	private String jobDescription;

}