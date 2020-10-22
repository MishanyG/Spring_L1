package HomeWork_L1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("cameraRoll")
public class ColorCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("-1 цветной кадр");
    }
}
