package com.spring.firstjobapp.company.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.firstjobapp.company.Company;
import com.spring.firstjobapp.company.CompanyRepository;
import com.spring.firstjobapp.company.CompanyService;
import com.spring.firstjobapp.job.Job;

@Service
public class CompanyServiceImpl implements CompanyService {
	private CompanyRepository companyRepository;
	
	
	
	
	public CompanyServiceImpl(CompanyRepository companyRepository) {
		super();
		this.companyRepository = companyRepository;
	}
	@Override
	public List<Company> getAllCompanies(){
		return companyRepository.findAll();
	}
	@Override
	public boolean updateCompany(Company company, Long id) {
		
		Optional<Company>companyOptional=companyRepository.findById(id);
		if(companyOptional.isPresent()) {
			Company companyToUpdate=companyOptional.get();

			companyToUpdate.setDescription(company.getDescription());
			companyToUpdate.setName(company.getName());
			companyToUpdate.setJobs(company.getJobs());
			companyRepository.save(companyToUpdate);
			return true;
		}else {
	return false;
		}
	}
	@Override
	public void createCompany(Company company) {
		companyRepository.save(company);		
	}
}
