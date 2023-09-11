package com.ba.boost.dependencyinversion.v2.better;

public interface IProduct {

    /*
    * The solution is to create an abstraction layer for the lower-level classes (Book and DVD).
    * We’ll do so by introducing the Product interface, both classes will implement it.
    * */

    void seeReviews();

    void getSample();

}
