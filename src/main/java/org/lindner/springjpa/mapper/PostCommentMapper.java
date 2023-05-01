package org.lindner.springjpa.mapper;

import java.util.List;
import org.lindner.springjpa.models.PostComment;
import org.lindner.springjpa.models.PostCommentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostCommentMapper {

  @Mapping(source = "post.id", target = "postId")
  PostCommentDTO toDTO(PostComment postComment);

  PostComment toEntity(PostCommentDTO postCommentDTO);

  List<PostCommentDTO> toDTOs(List<PostComment> postComments);

  List<PostComment> toEntities(List<PostCommentDTO> postCommentDTO);
}
