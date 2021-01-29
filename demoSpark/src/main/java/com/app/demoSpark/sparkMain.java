package com.app.demoSpark;

import com.app.demoSpark.models.Products;
import com.app.demoSpark.models.User;
import com.app.demoSpark.service.ProductService;
import com.app.demoSpark.service.ProductServiceImpl;
import com.app.demoSpark.service.UserService;
import com.app.demoSpark.service.UserServiceImpl;
import com.google.gson.Gson;

import java.util.List;

import static spark.Spark.*;


public class sparkMain {
    public static void main (String[] args) {

        UserService userService = new UserServiceImpl ();
        ProductService productService = new ProductServiceImpl ();

        //configure port
        port (8080);

        get ("/hello", (req, res) -> "Hello, world!");

        get ("/hello/:name", (req, res) -> {
            return "Hello, " + req.params (":name") + "!!";
        });

        options ("/*",
                (request, response) -> {
                    String accessControlRequestHeaders = request
                            .headers("Access-Control-Request-Headers");
                    if (accessControlRequestHeaders != null) {
                        response.header("Access-Control-Allow-Headers",
                                accessControlRequestHeaders);
                    }
                    String accessControlRequestMethod = request
                            .headers("Access-Control-Request-Method");
                    if (accessControlRequestMethod != null) {
                        response.header("Access-Control-Allow-Methods",
                                accessControlRequestMethod);
                    }
                    return "OK";
                });
        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));

        post ("/users/add", (req, res) -> {
            res.type ("application/json");

            User user = new Gson ().fromJson (req.body (), User.class);
            userService.addUSer (user);
            return new Gson ().toJson (user);
        });

        get ("/users", (req, res) -> {
            res.type ("application/json");
            return new Gson ().toJson (userService.getUsers ());
        });

        get ("/users/:id", (req, res) -> {
            res.type ("application/json");
            return new Gson ().toJson (userService.getUserById (req.params (":id")));
        });

        delete ("/users/delete/:id", (req, res) -> {
            res.type ("application/json");
            userService.deleteUserById (req.params (":id"));
            return new Gson ().toJson ("User deleted");
        });

        put ("/users/edit/:id", (req, res) -> {
            res.type ("application/json");
            User ue = new Gson ().fromJson (req.body (), User.class);

            User searchedUser = userService.getUserById (ue.getId ());
            if (searchedUser != null) {
                userService.editUser (ue);
                return new Gson ().toJson (ue);
            } else {
                return new Gson ().toJson ("User not found or error in edit");
            }

        });

        get ("/products", (req, res) -> {
            res.type ("application/json");
            List<Products> productsList = productService.getProducts ();
            if (productsList.size () > 0){
                return new Gson ().toJson (productsList);
            } else {
                return new Gson ().toJson ("No existe productos en stock");
            }
        });
/**
 * method from request by idProducts
 */
        get ("/products/:id", (req, res) -> {
            res.type ("application/json");
            return new Gson ().toJson (productService.getProductById (req.params (":id")));
        });

    }
}
