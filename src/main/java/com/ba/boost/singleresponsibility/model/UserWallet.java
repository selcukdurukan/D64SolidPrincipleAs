package com.ba.boost.singleresponsibility.model;

public class UserWallet {

    private Double userWallet;

    public UserWallet(Double userWallet) {
        this.userWallet = userWallet;
    }

    public Double getUserWallet() {
        return userWallet;
    }

    public void setUserWallet(Double userWallet) {
        this.userWallet = userWallet;
    }

    @Override
    public String toString() {
        return "UserWallet{" +
                "userWallet=" + userWallet +
                '}';
    }


}
