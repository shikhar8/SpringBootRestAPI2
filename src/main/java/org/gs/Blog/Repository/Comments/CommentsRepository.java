package org.gs.Blog.Repository.Comments;

import org.gs.Blog.Entity.Comment.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends CrudRepository<Comment,Integer> {
}
