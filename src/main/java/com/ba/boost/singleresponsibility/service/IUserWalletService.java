package com.ba.boost.singleresponsibility.service;

import com.ba.boost.singleresponsibility.model.UserWallet;

public interface IUserWalletService {

    UserWallet createUserWallet();

    UserWallet getUserWallet();
}
