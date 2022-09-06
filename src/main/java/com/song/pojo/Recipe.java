package com.song.pojo;

import java.util.Arrays;

public class Recipe {
    //菜谱类
    private int rid;
    private String recipeName;          //菜名
    private String regionalCuisines;    //菜系
    private String materials;         //原料
    private String step;              //步骤
    private String uploader;            //上传者
    private String images;              //图片地址

    public String getImages() {
        return images;
    }

    public Recipe(int rid, String recipeName, String regionalCuisines, String materials,
                  String step, String uploader, String images) {
        this.rid = rid;
        this.recipeName = recipeName;
        this.regionalCuisines = regionalCuisines;
        this.materials = materials;
        this.step = step;
        this.uploader = uploader;
        this.images = images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Recipe() {
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRegionalCuisines() {
        return regionalCuisines;
    }

    public void setRegionalCuisines(String regionalCuisines) {
        this.regionalCuisines = regionalCuisines;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "rid=" + rid +
                ", recipeName='" + recipeName + '\'' +
                ", regionalCuisines='" + regionalCuisines + '\'' +
                ", materials=" +materials +
                ", step=" + step +
                ", uploader='" + uploader + '\'' +
                ", images='" + images + '\'' +
                '}';
    }
}
