package com.design.pattern.solid.LSP.Solution;

public class Whatsapp implements SocialMedia, SocialVideoCallManager {

    @Override
    public void chatWithFriends() {
        System.out.println("Chat with friends");
    }

    @Override
    public void sendPhotoAndVideo() {
        System.out.println("Send photo and video");
    }

    @Override
    public void groupVideoCall(String... user) {
        System.out.println("Group video call");
    }
}
