package com.study.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) //이 어노테이션이 생성될 수 있는 위치 지정, PARAMETER로 지정했으니 메소드의 파라미터로 선언된 객체에서만 사용가능ㄴ
@Retention(RetentionPolicy.RUNTIME)//어노테이션이 언제까지 살아 남아 있을지를 정하는 것
public @interface LoginUser { //이 파일을 어노테이션 클래스로 지정
}
