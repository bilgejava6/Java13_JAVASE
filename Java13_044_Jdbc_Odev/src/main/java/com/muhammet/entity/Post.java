package com.muhammet.entity;

public class Post {
    Long id;
    Long userid;
    String title;
    String postComment;
    Long sharedDate;
    String imageUrl;
    int likeCount;
    int commentCount;

    public Post(Long userid, String title, String postComment, String imageUrl) {
        this.userid = userid;
        this.title = title;
        this.postComment = postComment;
        this.imageUrl = imageUrl;
        this.sharedDate = System.currentTimeMillis();
    }

    public Post() {
    }

    public Post(Long id, Long userid, String title, String postComment, Long sharedDate, String imageUrl, int likeCount, int commentCount) {
        this.id = id;
        this.userid = userid;
        this.title = title;
        this.postComment = postComment;
        this.sharedDate = sharedDate;
        this.imageUrl = imageUrl;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostComment() {
        return postComment;
    }

    public void setPostComment(String postComment) {
        this.postComment = postComment;
    }

    public Long getSharedDate() {
        return sharedDate;
    }

    public void setSharedDate(Long sharedDate) {
        this.sharedDate = sharedDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
