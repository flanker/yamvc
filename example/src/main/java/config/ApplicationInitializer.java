package config;

import com.chaojiwudi.mvc.init.Initializer;
import com.chaojiwudi.mvc.router.Router;
import controller.HomeController;
import core.annotation.Component;

@Component
public class ApplicationInitializer implements Initializer {

    @Override
    public void config(Router router) {
        router.register("/", HomeController.class, HomeController::index);
        router.register("/about", HomeController.class, HomeController::about);
    }

}
