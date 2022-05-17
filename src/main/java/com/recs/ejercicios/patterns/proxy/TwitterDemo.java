package com.recs.ejercicios.patterns.proxy;

public class TwitterDemo {

    public static void main(String[] args) {
        TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceStub());

    }
}
