package lesson_03.database;

import java.util.logging.Logger;

public class MyConnection {

    private static final Logger LOGGER = Logger.getLogger(MyConnection.class.getName());

    public void execute(String query) {
        LOGGER.info("Executing query: " + query);
    }
}
