package az.sarkhan.blogwebsite.model;

import javax.persistence.Table;

import lombok.Data;

@Data
@Table
public class ImageBean {
    private String filename;
}
