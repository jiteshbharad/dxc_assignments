
package com.dxc.rest1;

import javax.jws.WebService;

@WebService(endpointInterface = "com.dxc.rest1.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

