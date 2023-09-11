package com.ba.boost.interfacesegregation.example.v1.worse;

public interface IPrinter {

    //HP and Canon can print
    void print();


    //Only Canon can scan.
    void scan();
}
