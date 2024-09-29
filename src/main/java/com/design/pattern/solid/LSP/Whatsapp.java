package com.design.pattern.solid.LSP;

public class Whatsapp extends SocialMedia{
    @Override
    public void chatWithFriends() {
        System.out.println("Chat with friends");
    }

    @Override
    public void publishPost(Object post) {
    // Not applicable
    }


    @Override
    public void sendPhotoAndVideo() {
        System.out.println("Send photo and video");
    }

    @Override
    public void groupVideoCall(String user) {
        System.out.println("Group video call");
    }
}
