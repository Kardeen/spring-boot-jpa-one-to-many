package org.lindner.springjpa.models;

import lombok.Data;

@Data
public class PostCommentDTO {

  private Long id;
  private String review;
  private Long postId;

  //  //  @JsonIgnoreProperties("comment")
  //  @JsonBackReference private PostDTO post;
}
