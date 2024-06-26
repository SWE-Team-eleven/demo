package com.commitfarm.farm.dto.comment.request;


import com.commitfarm.farm.domain.Users;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Data
@AllArgsConstructor
public class CreateCommentDTO {


    @Schema(description = "댓글 내용")
    private String content;

}
