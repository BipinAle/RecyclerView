package com.recyclerview.pojos;

/**
 * Created by dellxps on 2/21/2017.
 */

public class SingleRow {
    private String header, subHeader;
    private int images;

    public SingleRow( ) {

    }

    public SingleRow(String header, String subHeader, int images) {
        this.header = header;
        this.subHeader = subHeader;
        this.images = images;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSubHeader() {
        return subHeader;
    }

    public void setSubHeader(String subHeader) {
        this.subHeader = subHeader;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
