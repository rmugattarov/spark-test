package rmugattarov.spark_test;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

/**
 * Created by rmugattarov on 21.10.2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Map<String, String> model = new HashMap<>();
        model.put("msg", "whaddup");
        get("/hello", (req, res) -> new ModelAndView(model, "template.vm"), new VelocityTemplateEngine());
    }
}
