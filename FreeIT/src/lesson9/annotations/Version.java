package lesson9.annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {

	double numberOfVersion();

	String nameOfVersion() default "Nougat";

}
