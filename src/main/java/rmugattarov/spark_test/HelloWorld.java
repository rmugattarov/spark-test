package rmugattarov.spark_test;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.*;

import static spark.Spark.*;

/**
 * Created by rmugattarov on 21.10.2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Map<String, Object> model = new HashMap<>();
        model.put("msg", "whaddup");
        List<String> list = Arrays.asList("one", "two", "three");
        model.put("list", list);
        get("/hello", (req, res) -> new ModelAndView(model, "template.vm"), new VelocityTemplateEngine());
    }
}
