package com.ba.boost.dependencyinversion.v1.worse;

public class Shelf {

 /*
 * After adding DVD class,
 * we should modify the Shelf class so that it can accept DVDs, too.
 * However, this would clearly break the Open/Closed Principle too.
 * */
    Book book;

    void addBook(Book book) {

    }

    void customizeShelf() {

    }
}
