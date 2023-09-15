package com.ba.boost.dependencyinversion.v2.better;

import com.ba.boost.singleresponsibility.model.Product;

public class Shelf {

    /*
    *
    * Shelf can reference the Product interface instead of its implementations (Book and DVD).
    * The refactored code also allows us to
    * later introduce new product types (for instance, Magazine) that customers can put on their shelves, too.
    *
    *  The above code also follows the Liskov Substitution Principle,
    *  as the Product type can be substituted with both of its subtypes (Book and DVD) without breaking the program.
    *  At the same time, we have also implemented
    *  the Dependency Inversion Principle, as in the refactored code,
    *  high-level classes don’t depend on low-level classes, either.
     * */

    IProduct iProduct;

    void addProduct(IProduct iProduct) {

    }

    void customizeShelf() {

    }
}
