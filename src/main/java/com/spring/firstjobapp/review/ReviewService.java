package com.spring.firstjobapp.review;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ReviewService {
	List<Review> getAllReviews(Long companyId);
}
