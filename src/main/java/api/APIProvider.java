package api;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.staticFiles;

public class APIProvider {

    public void start()
    {
        port(80);
        staticFiles.location("/");
        get("/get", (req, res) -> "Hello world");
    }

}
