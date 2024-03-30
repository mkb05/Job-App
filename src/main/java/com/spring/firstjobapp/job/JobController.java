package com.spring.firstjobapp.job;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
	private JobService jobService;
	
	
	
	public JobController(JobService jobService) {
		this.jobService = jobService;
	}

	@GetMapping("/jobs")
	public List<Job>findAll(){
		return jobService.findAll();
	}
	
	@PostMapping("/jobs")
	public String createJob(@RequestBody Job job) {
		jobService.createJob(job);
	return "Job added successfully";	
	}
	
	@GetMapping
	public Job getJobById(@PathVariable Long id) {
		Job job=jobService.getJobById(id);
		return job;
	}
}
