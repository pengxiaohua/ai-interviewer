/**
 * @ClassName Interviewer
 * @Author pengxiaohua
 * @Date 2025/4/20
 * @Description: TODO
 */

package com.xiaohua.pojo.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InterviewerBO {
    private String id;
    private String aiName;
    private String image;

}
