package Ch34;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//애노테이션의 유지기간(프로그램 동작중인 상태에서만 실행) 

@Target({ElementType.TYPE,ElementType.METHOD}) // 어디에 붙일 수 있는지
public @interface CustomAnnotation {
		String value() default "";
		int number() default 0;
		boolean isOpen() default false;

}

