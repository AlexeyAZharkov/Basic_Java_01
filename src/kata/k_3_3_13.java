package kata;

/**
 *
 */
public class k_3_3_13 {
    public static void main(String[] args) {

    }

    public static void moveRobot(Robot robot, int toX, int toY) {
//        int X = robot.getX();
//        int Y = robot.getY();
//        Direction direction = robot.getDirection();
//
//        if ((toX - X) > 0) {
//            while (direction != Direction.RIGHT) {
//                robot.turnRight();
//                direction = robot.getDirection();
//            }
//        } else {
//            while (direction != Direction.LEFT) {
//                robot.turnRight();
//                direction = robot.getDirection();
//            }
//        }
//
//        for (int i = 0; i < Math.abs(toX - X); i++) {
//            robot.stepForward();
//        }
//
//        if ((toY - Y) > 0) {
//            while (direction != Direction.UP) {
//                robot.turnRight();
//                direction = robot.getDirection();
//            }
//        } else {
//            while (direction != Direction.DOWN) {
//                robot.turnRight();
//                direction = robot.getDirection();
//            }
//        }
//
//        for (int i = 0; i < Math.abs(toY - Y); i++) {
//            robot.stepForward();
//        }
        Direction xDir = (toX > robot.getX()) ? Direction.RIGHT : Direction.LEFT;
        Direction yDir = (toY > robot.getY()) ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != xDir) {
            robot.turnRight();
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        while (robot.getDirection() != yDir) {
            robot.turnRight();
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }


    }
    }
    class Robot {

//        public Direction getDirection() {
//            // текущее направление взгляда
//        }
    }
    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }


