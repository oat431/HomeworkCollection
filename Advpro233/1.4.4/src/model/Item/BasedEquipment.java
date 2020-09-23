package model.Item;

import javafx.scene.input.DataFormat;

import java.io.Serializable;

public class BasedEquipment {
    protected String name;
    protected String imgpath;

    public String getName() {
        return name;
    }

    public String getImagepath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    /*1.4.5*/
   /*public static class BaseEquipment implements Serializable{
        public static final DataFormat DATA_FORMAT = new DataFormat("src.model.Item. BasedEquipment");
        protected String name;
        protected String imgpath;
        public String getName(){
            return name;
        }
        public String getImgpath(){
            return imgpath;
        }
        public void setImagepath(String imgpath){
            this.imgpath = imgpath;
        }
    }*/
}
