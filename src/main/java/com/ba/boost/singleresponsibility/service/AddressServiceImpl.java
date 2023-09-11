package com.ba.boost.singleresponsibility.service;

import com.ba.boost.singleresponsibility.model.Address;

public class AddressServiceImpl implements IAddressService {
    @Override
    public Address createAddress() {
        Address address1 = new Address("Turkey", "Nigde", "Candan");
        return address1;
    }

    @Override
    public Address getAddress() {
        return createAddress();
    }
}
