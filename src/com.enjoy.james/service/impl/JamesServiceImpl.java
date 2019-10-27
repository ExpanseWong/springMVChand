package com.enjoy.james.service.impl;

import com.enjoy.james.annotion.EnjoyService;
import com.enjoy.james.service.JamesService;

@EnjoyService("JamesServiceImpl")
public class JamesServiceImpl implements JamesService {
    @Override
    public String query(String name, String password) {

        return "name ="+name + "age = " +password;
    }
}
