package lesson_03.database;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;

public class ConnectionPool {

    private static ConnectionPool instance;
    private final BlockingQueue<MyConnection> pool;
    private static final int MAX_CONNECTIONS = 5;

    private static final Logger LOGGER = Logger.getLogger(ConnectionPool.class.getName());

    private ConnectionPool() {
        pool = new LinkedBlockingQueue<>(MAX_CONNECTIONS);
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            pool.add(new MyConnection());
        }
        LOGGER.info("Connection pool created with " + MAX_CONNECTIONS + " connections");
    }

    public static synchronized ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    public MyConnection getConnection() {
        try {
            LOGGER.info("Connection requested from pool");
            return pool.take();
        } catch (InterruptedException e) {
            LOGGER.severe("Error getting connection: " + e.getMessage());
            return null;
        }
    }

    public void releaseConnection(MyConnection connection) {
        if (connection != null) {
            pool.offer(connection);
            LOGGER.info("Connection returned to pool");
        }
    }

    public int getAvailableConnections() {
        return pool.size();
    }
}
