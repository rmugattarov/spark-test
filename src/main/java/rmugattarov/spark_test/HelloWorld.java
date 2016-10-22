package rmugattarov.spark_test;

import org.apache.velocity.app.Velocity;
import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.*;

import static spark.Spark.*;

/**
 * Created by rmugattarov on 21.10.2016.
 */
public class HelloWorld {
    private static Map<String, Object> model = new HashMap<>();
    private static ModelAndView modelAndView = new ModelAndView(model, "template.vm");

    public static void main(String[] args) {
        Spark.staticFileLocation("/public");
        model.put("msg", "whaddup");
        get("/hello", (req, res) -> {
            model.put("msg", String.valueOf(Math.random()));
            return modelAndView;
        }, new VelocityTemplateEngine());
    }
}
