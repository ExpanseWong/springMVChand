package com.enjoy.james.annotion;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnjoyService{
    String value() default "";
}

