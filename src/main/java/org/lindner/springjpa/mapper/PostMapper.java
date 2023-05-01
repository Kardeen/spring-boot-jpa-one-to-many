package org.lindner.springjpa.mapper;

import java.util.List;
import org.lindner.springjpa.models.Post;
import org.lindner.springjpa.models.PostDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostMapper {
  PostDTO toDTO(Post post);

  List<PostDTO> toDTOs(List<Post> posts);

  Post toEntity(PostDTO postDTO);

  List<Post> toEntities(List<PostDTO> postDTO);
}
