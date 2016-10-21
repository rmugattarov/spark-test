package rmugattarov.spark_test;
import spark.route.RouteOverview;

import static spark.Spark.*;
/**
 * Created by rmugattarov on 21.10.2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        RouteOverview.enableRouteOverview();
        get("/hello/:name", (req, res) -> {
            return String.format("Hello %s!", req.params(":name"));
        });
    }
}
