import Utils.Robot;
import Utils.RobotUtils;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot(RobotUtils.generarNombreRobot());
        robot.generarCarga();

        System.out.println(robot);
        for (int i = 0; i < 5; i++) {

        }
    }
}
