import static spark.Spark.*;

public class app {
    public static funciones f = new funciones();

    public static void main(String... args){
        port(getPort());
        get("log", (req,res) -> {
                Double log = funciones.log(Double.parseDouble(req.queryParams("value")));
            }
        );
        get("sin", (req,res) -> {
                    Double sin = funciones.sin(Double.parseDouble(req.queryParams("value")));
                }
        );
        get("cos", (req,res) -> {
                    Double cos = funciones.cos(Double.parseDouble(req.queryParams("value")));
                }
        );
        get("tan", (req,res) -> {
                    Double tan = funciones.tan(Double.parseDouble(req.queryParams("value")));
                }
        );
        get("exp", (req,res) -> {
                    Double exp = funciones.tan(Double.parseDouble(req.queryParams("value")));
                }
        );
        get("acos", (req,res) -> {
                    Double acos = funciones.acos(Double.parseDouble(req.queryParams("value")));
                }
        );
        get("asin", (req,res) -> {
                    Double asin = funciones.asin(Double.parseDouble(req.queryParams("value")));
                }
        );
        get("atan", (req,res) -> {
                    Double atan = funciones.atan(Double.parseDouble(req.queryParams("value")));
                }
        );
        get("sqrt", (req,res) -> {
                    Double sqrt = funciones.sqrt(Double.parseDouble(req.queryParams("value")));
                }
        );
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
