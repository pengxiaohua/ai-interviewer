/**
 * @ClassName InterviewerServiceImpl
 * @Author pengxiaohua
 * @Date 2025/4/23
 * @Description: TODO
 */

package com.xiaohua.service.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import org.apache.commons.lang3.StringUtils;
import com.xiaohua.mapper.InterviewerMapper;
import com.xiaohua.pojo.Interviewer;
import com.xiaohua.pojo.bo.InterviewerBO;
import com.xiaohua.service.InterviewerService;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InterviewerServiceImpl implements InterviewerService {
    @Resource
    private InterviewerMapper interviewerMapper;

    @Override
    public void createOrUpdate(InterviewerBO interviewerBO) {
        Interviewer interviewer = new Interviewer();
        BeanUtils.copyProperties(interviewerBO, interviewer);
        interviewer.setUpdatedTime(LocalDateTime.now());

        if (StringUtils.isBlank(interviewer.getId())) {
            interviewer.setCreateTime(LocalDateTime.now());
            interviewerMapper.insert(interviewer);
        } else {
            interviewerMapper.updateById(interviewer);
        }
    }

    @Override
    public List<Interviewer> queryAll() {
        // 调用Mapper层的查询方法，返回所有记录
        return interviewerMapper.selectList(null);
    }

    @Override
    public void delete(String id) {
        if (StringUtils.isBlank(id)) {
            throw new IllegalArgumentException("ID不能为空");
        }
        interviewerMapper.deleteById(id);
    }
}
