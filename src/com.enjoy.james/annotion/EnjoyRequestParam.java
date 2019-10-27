package com.enjoy.james.annotion;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnjoyRequestParam{
    String value() default "";
}
