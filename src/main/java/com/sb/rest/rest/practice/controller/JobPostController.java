package com.sb.rest.rest.practice.controller;

import com.sb.rest.rest.practice.model.JobPost;
import com.sb.rest.rest.practice.service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobPostController {

    @Autowired
    JobPostService jobPostService;

    @GetMapping("/jobPosts")
    public List<JobPost> getJobPosts() {
        return jobPostService.getJobPosts();
    }

}
