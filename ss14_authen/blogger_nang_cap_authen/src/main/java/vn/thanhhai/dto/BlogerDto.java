package vn.thanhhai.dto;

public class BlogerDto {
    private int idBlog;
    private String name;
    private String content;
    private String image;
    private int categoryId;

    public BlogerDto() {
    }

    public BlogerDto(int idBlog, String name, String content, String image, int categoryId) {
        this.idBlog = idBlog;
        this.name = name;
        this.content = content;
        this.image = image;
//        this.categoryId = categoryId;
    }

    public int getIdBlog() {
        return idBlog;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setIdBlog(int idBlog) {
        this.idBlog = idBlog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
