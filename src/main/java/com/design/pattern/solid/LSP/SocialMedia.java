package com.design.pattern.solid.LSP;

public abstract class SocialMedia {
    // @Support Whatsapp, Facebook, Instagram
    public abstract void chatWithFriends();

    // @Support Facebook, Instagram
    public abstract void publishPost(Object post);

    // @Support Whatsapp, Facebook, Instagram
    public abstract void sendPhotoAndVideo();

    // @Support
    public abstract void groupVideoCall( String  user);
}
