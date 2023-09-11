package com.ba.boost.singleresponsibility.service;

import com.ba.boost.singleresponsibility.model.UserWallet;

public class UserWalletServiceImpl implements IUserWalletService {
    @Override
    public UserWallet createUserWallet() {
        UserWallet userWallet = new UserWallet(20000.0);
        return userWallet;
    }

    @Override
    public UserWallet getUserWallet() {
        return createUserWallet();
    }
}
