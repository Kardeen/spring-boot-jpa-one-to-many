package org.lindner.springjpa.models;

import java.util.List;
import lombok.Data;

@Data
public class PostDTO {

  private Long id;
  private String title;
  private List<PostCommentDTO> comments;
}
