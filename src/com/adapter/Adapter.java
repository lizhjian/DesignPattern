package com.adapter;

/**
 * 适配器本身
 */
public class Adapter extends  Adaptee implements Target {

    @Override
    public void handleReq() {
         super.request();
    }
}
