package org.lindner.springjpa.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.lindner.springjpa.mapper.PostCommentMapper;
import org.lindner.springjpa.mapper.PostMapper;
import org.lindner.springjpa.models.PostComment;
import org.lindner.springjpa.models.PostCommentDTO;
import org.lindner.springjpa.models.PostDTO;
import org.lindner.springjpa.repository.PostCommentRepository;
import org.lindner.springjpa.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
@RequiredArgsConstructor
public class PostController {

  private final PostRepository postRepository;

  private final PostCommentRepository postCommentRepository;

  private final PostMapper postMapper;

  private final PostCommentMapper postCommentMapper;

  @GetMapping("/posts")
  public List<PostDTO> getAllPosts() {
    //    return postRepository.findAll().stream().map(postMapper::toDTO).toList();
    return postMapper.toDTOs(postRepository.findAll());
  }

  @GetMapping("/postcomment/{id}")
  public PostCommentDTO getPostComment(@PathVariable Long id) {
    return postCommentMapper.toDTO(postCommentRepository.findById(id).orElse(new PostComment()));
  }

  @GetMapping("/postcomments")
  public List<PostCommentDTO> getAllPostComments() {
    //    return postCommentRepository.findAll().stream().map(postCommentMapper::toDTO).toList();
    return postCommentMapper.toDTOs(postCommentRepository.findAll());
  }
}
