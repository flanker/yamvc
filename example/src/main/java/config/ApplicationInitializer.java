package config;

import com.chaojiwudi.mvc.init.Initializer;
import com.chaojiwudi.mvc.router.Router;
import controller.HomeController;
import controller.PostsController;
import controller.UsersController;
import core.annotation.Component;

@Component
public class ApplicationInitializer implements Initializer {

    @Override
    public void config(Router router) {
        router.register("/", HomeController.class, HomeController::index);
        router.register("/about", HomeController.class, HomeController::about);
        router.register("/posts/:id", PostsController.class, PostsController::get);
        router.register("/posts/:id/edit", PostsController.class, PostsController::edit);
        router.get("/users/:id", UsersController.class, UsersController::get);
        router.post("/users/:id", UsersController.class, UsersController::update);
    }

}
