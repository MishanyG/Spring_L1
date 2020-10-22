package HomeWork_L1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("HomeWork_L1")
public class AppConfig {
//    @Bean(name="cameraRoll")
    public CameraRoll cameraRoll() {
//        return new ColorCameraRoll();
        return new BlackAndWhiteCameraRoll();
    }
//    @Bean(name="camera")
    public Camera camera(CameraRoll cameraRoll){
        Camera camera = new CameraImpl();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
//    @Bean(name="helloMan")
    public HelloMan helloMan(@Value("Yuri") String name) {
        return new HelloManOnceSay(name);
    }
}

