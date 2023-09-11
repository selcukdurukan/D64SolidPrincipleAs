package com.ba.boost.singleresponsibility.service;

import com.ba.boost.singleresponsibility.model.Address;
import com.ba.boost.singleresponsibility.model.Product;
import com.ba.boost.singleresponsibility.model.User;
import com.ba.boost.singleresponsibility.model.UserWallet;

public class CartServiceImpl implements ICartService {

    private final IUserService userService;
    private final IProductService productService;
    private final IAddressService addressService;
    private final IUserWalletService userWalletService;

    public CartServiceImpl(IUserService userService, IProductService productService,
                           IAddressService addressService, IUserWalletService userWalletService) {
        this.userService = userService;
        this.productService = productService;
        this.addressService = addressService;
        this.userWalletService = userWalletService;
    }

    @Override
    public String checkout() {
        User user = userService.getUser();
        Product product = productService.getProduct();
        Address address = addressService.getAddress();
        UserWallet userWallet = userWalletService.getUserWallet();

        if (user == null || product ==null || address == null) {
            throw new IllegalStateException();
        }

        if (userWallet.getUserWallet() < product.getPrice()) {
            throw new IllegalStateException();
        }

        return "Kullanıcı: " + user.getUserName() + "/n" +
                "Şu ürünü: " + product.getProductName() + "/n" +
                "Şu fiyata: " + product.getPrice() + " başarılı şekilde aldı.";
    }
}
