package HomeWork_L1;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UnpredictableCameraRoll {
    Class<?> usingCameraRollClass();
}