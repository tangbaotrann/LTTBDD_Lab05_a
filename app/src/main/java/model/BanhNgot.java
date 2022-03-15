package model;

public class BanhNgot {

    private int id;
    private int imgsBanh;
    private String titleBanh;
    private String contentBanh;
    private String priceBanh;

    public BanhNgot(int id, int imgsBanh, String titleBanh, String contentBanh, String priceBanh) {
        this.id = id;
        this.imgsBanh = imgsBanh;
        this.titleBanh = titleBanh;
        this.contentBanh = contentBanh;
        this.priceBanh = priceBanh;
    }

    public int getId() {
        return id;
    }

    public int getImgsBanh() {
        return imgsBanh;
    }

    public void setImgsBanh(int imgsBanh) {
        this.imgsBanh = imgsBanh;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleBanh() {
        return titleBanh;
    }

    public void setTitleBanh(String titleBanh) {
        this.titleBanh = titleBanh;
    }

    public String getContentBanh() {
        return contentBanh;
    }

    public void setContentBanh(String contentBanh) {
        this.contentBanh = contentBanh;
    }

    public String getPriceBanh() {
        return priceBanh;
    }

    public void setPriceBanh(String priceBanh) {
        this.priceBanh = priceBanh;
    }

}
