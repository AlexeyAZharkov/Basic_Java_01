package ru.example;

public class Kat_4_2_9 {
    public static void main(String... args) {

    }

    public void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//        RobotConnection robotConnection = null;
        boolean fromClose = false;
        for (int i = 1; i < 4; ++i) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                i = 4;
            } catch (RobotConnectionException e) {
                if (i == 3) {
                    throw e;
                }
            } catch (Throwable er) {
                throw er;
            }
        }

    }

    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }

    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);
        @Override
        void close();
    }

    public class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);

        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}

//    nt i = 1; i < 4; ++i) {
//        try {
//        robotConnection.moveRobotTo(toX, toY);
//        } catch (RobotConnectionException e) {
//        if (i == 3) {
//        System.out.println(e.getMessage());
//        }
//        } catch (Throwable e) {
//        System.out.println(e.getMessage());
//        robotConnectionManager.getConnection().close();
//        break;
//        }
//        finally {
//        robotConnectionManager.getConnection().close();
//        }
//        }