/**
 * @ClassName InterviewService
 * @Author pengxiaohua
 * @Date 2025/4/23
 * @Description: TODO
 */

package com.xiaohua.service;

import com.xiaohua.pojo.Interviewer;
import com.xiaohua.pojo.bo.InterviewerBO;

import java.util.List;

public interface InterviewerService {
    // 新增或者修改面试官信息
    public void createOrUpdate(InterviewerBO interviewerBO);
    // 查询所有的面试官数据列表
    public List<Interviewer> queryAll();
    // 删除数字人面试官
    public void delete(String interviewerId);
}
