package infra;

import controllers.CardController;

import java.util.HashMap;
import java.util.Map;

public class Configurations {

    public static final int PORT = 8901;

    public static Map<String, Controller> getRoutes() {
        Map<String, Controller> routes = new HashMap<>();
        routes.put("/card", new CardController());
        return routes;
    }
}
