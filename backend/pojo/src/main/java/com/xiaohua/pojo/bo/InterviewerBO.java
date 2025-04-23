/**
 * @ClassName Interviewer
 * @Author pengxiaohua
 * @Date 2025/4/20
 * @Description: TODO
 */

package com.xiaohua.pojo.bo;

import jakarta.validation.constraints.NotBlank;
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

    @NotBlank(message = "数字人面试官名称不能为空")
    private String aiName;

    @NotBlank(message = "数字人头像不能为空")
    private String image;

}
