package org.gs.Blog.Service.Comments;
import org.gs.Blog.Entity.Comment.Comment;
import org.gs.Blog.Repository.Comment.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CommentsService {
    @Autowired
    private CommentsRepository commentsRepository;
    public List<Comment> getCommentsById(int id) {
        return commentsRepository.findBypostId(id);
    }

    public void addComment(Comment comment) {
        commentsRepository.save(comment);
    }

    public void updateComment(Comment comment, int id) {
        commentsRepository.save(comment);
    }

    public void deleteComment(int id) {
        Comment comment=commentsRepository.findById(id).get();
        if(comment!=null)
            commentsRepository.delete(comment);
    }
}
