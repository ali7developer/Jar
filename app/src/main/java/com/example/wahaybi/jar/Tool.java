package com.example.wahaybi.jar;


public class Tool {

    private String mTool;
    private String mPrice;
    private int mImageResourceId;

    public Tool(String tool, String price, int imageResourceId){

        this.mTool = tool;
        this.mPrice = price;
        this.mImageResourceId = imageResourceId;
    }

    public String getTool() {
        return mTool;
    }

    public String getPrice() {
        return mPrice;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}