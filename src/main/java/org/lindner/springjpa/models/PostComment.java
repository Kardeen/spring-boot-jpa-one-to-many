package org.lindner.springjpa.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity(name = "PostComment")
@Table(name = "post_comment")
@Data
// @JsonIgnoreProperties({"hibernateLazyInitializer"})
public class PostComment {

  @Id @GeneratedValue private Long id;

  private String review;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "post_id")
  @JsonIgnoreProperties("comments")
  private Post post;
}
