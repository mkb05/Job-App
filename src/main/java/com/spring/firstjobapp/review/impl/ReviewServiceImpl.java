package com.spring.firstjobapp.review.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.firstjobapp.review.Review;
import com.spring.firstjobapp.review.ReviewRepository;
import com.spring.firstjobapp.review.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {
	private ReviewRepository reviewRepository;
	
	

	public ReviewServiceImpl(ReviewRepository reviewRepository) {
		super();
		this.reviewRepository = reviewRepository;
	}



	@Override
	public List<Review> getAllReviews(Long companyId) {
		List<Review> reviews =reviewRepository.findByCompanyId(companyId);
		return reviews;
	}

}
