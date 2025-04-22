/**
 * @ClassName InterviewerController
 * @Author pengxiaohua
 * @Date 2025/4/20
 * @Description: TODO
 */

package com.xiaohua.controller;

import com.xiaohua.grace.result.GraceJSONResult;
import com.xiaohua.pojo.bo.InterviewerBO;
import com.xiaohua.service.InterviewerService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("interviewer")
public class InterviewerController {
    @Resource
    private InterviewerService interviewerService;
    /**
     * 创建或更新面试官
     * @param interviewerBO
     * @return
     */
    @PostMapping("createOrUpdate")
    public GraceJSONResult createOrUpdate(@RequestBody InterviewerBO interviewerBO) {
        interviewerService.createOrUpdate(interviewerBO);
        return GraceJSONResult.ok();
    }
}
