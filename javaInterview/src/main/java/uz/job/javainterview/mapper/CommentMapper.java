package uz.job.javainterview.mapper;


import uz.job.javainterview.dto.BlogDTO;
import uz.job.javainterview.dto.CommentDTO;
import uz.job.javainterview.model.Blog;
import uz.job.javainterview.model.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentMapper {

    public static CommentDTO toDTO(Comment comment) {
        CommentDTO dto = new CommentDTO();
        dto.setId(comment.getId());
        dto.setComment(comment.getComment());
        dto.setCreatedCommentDate(comment.getCreatedCommentDate());
        dto.setNumberOfUtility(comment.getNumberOfUtility());
        dto.setNumberOfFutility(comment.getNumberOfFutility());
        dto.setCheckedComment(comment.getCheckedComment());
//        Blog blog=new Blog();
//        Blog blog1=comment.getBlog();
//        blog.setId(blog1.getId());
//        blog.setTitle(blog1.getTitle());
//        blog.setTheme(blog1.getTheme());
//        blog.setText(blog1.getText());
//        blog.setCreatedDate(blog1.getCreatedDate());
//        blog.setNumberOfReadings(blog1.getNumberOfReadings());
//        blog.setChecked(blog1.isChecked());
        dto.setBlog(comment.getBlog());
        return dto;
    }
    public static Comment toModel(CommentDTO commentDTO) {
        Comment comment = new Comment();
        comment.setId(commentDTO.getId());
        comment.setComment(commentDTO.getComment());
        comment.setCreatedCommentDate(commentDTO.getCreatedCommentDate());
        comment.setNumberOfUtility(commentDTO.getNumberOfUtility());
        comment.setNumberOfFutility(commentDTO.getNumberOfFutility());
        comment.setCheckedComment(commentDTO.getCheckedComment());
//        Blog blog=new Blog();
//        Blog blog1=commentDTO.getBlog();
//        blog.setId(blog1.getId());
//        blog.setTitle(blog1.getTitle());
//        blog.setTheme(blog1.getTheme());
//        blog.setText(blog1.getText());
//        blog.setCreatedDate(blog1.getCreatedDate());
//        blog.setNumberOfReadings(blog1.getNumberOfReadings());
//        blog.setChecked(blog1.isChecked());
        comment.setBlog(commentDTO.getBlog());
        return comment;
    }
}
