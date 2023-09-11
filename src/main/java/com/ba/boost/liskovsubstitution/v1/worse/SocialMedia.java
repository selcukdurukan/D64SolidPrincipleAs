package com.ba.boost.liskovsubstitution.v1.worse;

public abstract class SocialMedia {

    /*
    *
    * Child class Parent class'ın tüm özelliklerini kullanmalı.
    * Gereksiz hiç birşey alt sınıflara etki etmemeli, alt sınıflar ust sınıfların yerine geçebilmeli.
    * */

    //Facebook, Whatsapp, Instagram
    public abstract void publishPost();

    //Facebook, Instagram
    public abstract void sendPhotosAndVideos();

    //Whatsapp
    public abstract void groupVideoCall();

    //Facebook, Whatsapp, Instagram
    public abstract void chatWithFriend();
}
