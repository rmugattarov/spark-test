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
    private static String[] arr = new String[3];

    public static void main(String[] args) {
        Spark.staticFileLocation("/public");
        model.put("msg", "whaddup");

        get("/hello", (req, res) -> {
            model.put("msg", String.valueOf(Math.random()));
            for(int i=0; i <3; i++) {
                arr[i] = String.valueOf(Math.random());
            }
            model.put("arr", arr);
            return modelAndView;
        }, new VelocityTemplateEngine());
    }
}
