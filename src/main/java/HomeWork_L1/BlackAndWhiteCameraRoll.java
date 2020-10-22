package HomeWork_L1;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Component("cameraRoll")
@UnpredictableCameraRoll(usingCameraRollClass = ColorCameraRoll.class)
public class BlackAndWhiteCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("-1 черно-белый кадр");
    }
}
