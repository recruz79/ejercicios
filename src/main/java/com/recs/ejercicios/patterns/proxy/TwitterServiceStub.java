package com.recs.ejercicios.patterns.proxy;

public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeLine(String screenName) {
        return "My neato time";
    }

    @Override
    public void postToTimeLine(String screenName, String message) {

    }
}
