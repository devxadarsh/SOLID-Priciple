package com.design.pattern.solid.LSP.Solution;

public class Instagram implements SocialMedia, PostMediaManager {

    @Override
    public void publishPost(Object post) {
        System.out.println("publishPost");
    }

    @Override
    public void chatWithFriends() {
        System.out.println("chatWithFriends");
    }

    @Override
    public void sendPhotoAndVideo() {
        System.out.println("sendPhotoAndVideo");
    }
}
