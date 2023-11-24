import frc.robot.Drivetrain;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Button;

public class RobotContainer {
    private final Drivetrain m_drive = new Drivetrain();

    private final XboxController controller = new XboxController(0);

    public RobotContainer() {
        m_drive.register();

        m_drive.setDefaultCommand(new DriveCommand(
                m_drive,
                () -> -modifyAxis(controller.getLeftY()), // Axes are flipped here on purpose
                () -> -modifyAxis(controller.getLeftX()),
                () -> -modifyAxis(controller.getRightX())
        ));

        new Button(controller::getBackButtonPressed)
                .whenPressed(m_drive::zeroGyroscope);
    }

    public DrivetrainSubsystem getM_drive() {
        return m_drive;
    }

    private static double deadband(double value, double deadband) {
        if (Math.abs(value) > deadband) {
            if (value > 0.0) {
                return (value - deadband) / (1.0 - deadband);
            } else {
                return (value + deadband) / (1.0 - deadband);
            }
        } else {
            return 0.0;
        }
    }

    private static double modifyAxis(double value) {
        // Deadband
        value = deadband(value, 0.05);

        // Square the axis
        value = Math.copySign(value * value, value);

        return value;
    }
}
