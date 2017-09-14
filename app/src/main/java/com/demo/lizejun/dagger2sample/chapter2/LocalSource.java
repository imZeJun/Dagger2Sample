package com.demo.lizejun.dagger2sample.chapter2;


public class LocalSource implements Source{

    @Override
    public String getData() {
        return "读取本地数据成功";
    }
}
