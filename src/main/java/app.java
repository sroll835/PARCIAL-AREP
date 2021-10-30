import static spark.Spark.*;

public class app {
    public static funciones f = new funciones();

    public static void main(String... args){
        port(getPort());
        get("log", (req,res) -> {
                Double log = funciones.log(Double.parseDouble(req.queryParams("value")));
                return log;
            }
        );
        get("sin", (req,res) -> {
                Double sin = funciones.sin(Double.parseDouble(req.queryParams("value")));
                return sin;
            }
        );
        get("cos", (req,res) -> {
                Double cos = funciones.cos(Double.parseDouble(req.queryParams("value")));
                return cos;
            }
        );
        get("tan", (req,res) -> {
                Double tan = funciones.tan(Double.parseDouble(req.queryParams("value")));
                return tan;
            }
        );
        get("exp", (req,res) -> {
                Double exp = funciones.tan(Double.parseDouble(req.queryParams("value")));
                return exp;
            }
        );
        get("acos", (req,res) -> {
                Double acos = funciones.acos(Double.parseDouble(req.queryParams("value")));
                return acos;
            }
        );
        get("asin", (req,res) -> {
                Double asin = funciones.asin(Double.parseDouble(req.queryParams("value")));
                return asin;
            }
        );
        get("atan", (req,res) -> {
                Double atan = funciones.atan(Double.parseDouble(req.queryParams("value")));
                return atan;
            }
        );
        get("sqrt", (req,res) -> {
                Double sqrt = funciones.sqrt(Double.parseDouble(req.queryParams("value")));
                return sqrt;
            }
        );
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8080;
    }
}
