package com.design.pattern.solid.LSP;

public class Instagram extends SocialMedia{
    @Override
    public void chatWithFriends() {
        System.out.println("Chat with friends");
    }

    @Override
    public void publishPost(Object post) {
        System.out.println("Publishing post");
    }

    @Override
    public void sendPhotoAndVideo() {
        System.out.println("Sending photo and video");
    }

    @Override
    public void groupVideoCall(String user) {
        // Not applicable
    }
}
