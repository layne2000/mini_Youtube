package org.example.entity.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
//@Component
public @interface DataLimited {

}
