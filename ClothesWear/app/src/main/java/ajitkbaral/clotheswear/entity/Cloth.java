package ajitkbaral.clotheswear.entity;

import java.io.Serializable;

/**
 * Created by bbaral on 1/26/2018.
 */

public class Cloth implements Serializable {
    private int id;
    private String title;
    private String description;
    private String imageName;

    public Cloth() {
    }

    public Cloth(int id, String title, String description, String imageName) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageName = imageName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
