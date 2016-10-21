package rmugattarov.spark_test;
import static spark.Spark.*;
/**
 * Created by rmugattarov on 21.10.2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World, azaza!");
    }
}
