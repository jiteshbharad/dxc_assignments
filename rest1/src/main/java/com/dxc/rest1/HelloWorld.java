package com.dxc.rest1;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

