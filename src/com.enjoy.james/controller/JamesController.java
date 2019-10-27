package com.enjoy.james.controller;

import com.enjoy.james.annotion.EnjoyAutowired;
import com.enjoy.james.annotion.EnjoyController;
import com.enjoy.james.annotion.EnjoyRequestMapping;
import com.enjoy.james.annotion.EnjoyRequestParam;
import com.enjoy.james.service.JamesService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@EnjoyController
@EnjoyRequestMapping("/janmes")
public class JamesController {

    @EnjoyAutowired("JamesServiceImpl")
    private JamesService jamesService;

    @EnjoyRequestMapping("/query")
    public void query(HttpServletRequest request, HttpServletResponse response,
                      @EnjoyRequestParam("name")String name,@EnjoyRequestParam("age")String age){
        try {
            PrintWriter pw = response.getWriter();
            String result = jamesService.query(name,age);
            pw.write(result);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
