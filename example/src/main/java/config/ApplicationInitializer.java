package config;

import com.chaojiwudi.mvc.init.Initializer;
import com.chaojiwudi.mvc.router.Router;
import controller.BooksController;
import controller.PostsController;
import core.annotation.Component;

@Component
public class ApplicationInitializer implements Initializer {

    @Override
    public void config(Router router) {

        router.resources("books", BooksController.class);

        router.get("/posts/:id", PostsController.class, PostsController::get);
        router.get("/posts/:id/edit", PostsController.class, PostsController::edit);
        router.post("/posts/:id", PostsController.class, PostsController::update);
    }

}
