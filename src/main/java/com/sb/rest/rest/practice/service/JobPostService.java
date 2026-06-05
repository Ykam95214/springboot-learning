package com.sb.rest.rest.practice.service;

import com.sb.rest.rest.practice.model.JobPost;
import com.sb.rest.rest.practice.repo.JobPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostService {

    @Autowired
    JobPostRepo jobPostRepo;

    public List<JobPost> getJobPosts(){
        return jobPostRepo.getAllJobs();
    }
}
