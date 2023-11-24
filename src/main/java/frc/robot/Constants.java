package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

public final class Constants {

    public static final int INTAKE_ID = 0;
    public static final int ELEVATOR_MASTER_ID = 0;
    public static final int ELEVATOR_SLAVE_ID = 0;
    public static final int CARRIAGE_ID = 0;
    
    public static final class Swerve{
        public static final double drivingGear = 6.86;
        public static final double drivenGear = 1;

        public static final double kDriveP = 2.432;
        public static final double kDriveI = 0.0;
        public static final double kDriveD = 0.0;
        public static final double kDriveS = 2.3289/10;
        public static final double kDriveV = 2.3289/10;
        public static final double kDriveA = 0.31447/10;
          
        public static final double kAngleP = 0.00884888;
    
        public static final double wheelCircumference = 2 * Math.PI  * Units.inchesToMeters(1.9325 );
    
        public static final double kMaxSpeed = Units.feetToMeters(15.2); // 16.2 feet per second
        public static final double kMaxAngularSpeed = 2*Math.PI; // 1/2 rotation per second
        public static final double kModuleMaxAngularAcceleration = 2 * Math.PI; // radians per second squared
            
        public static final double kLength = 0.48530;
        public static final double kWidth = 0.48530;
        //public static final double kLength = 0.75;
        //public static final double kWidth = 0.75;
    
        public static final SwerveDriveKinematics kinematics =
            new SwerveDriveKinematics(
                new Translation2d(kLength / 2., kWidth / 2.),
                new Translation2d(kLength / 2., -kWidth / 2.),
                new Translation2d(-kLength / 2., kWidth / 2.),
                new Translation2d(-kLength / 2., -kWidth / 2.)
            );
                
            
        // Constraint for the motion profilied robot angle controller
            public static final TrapezoidProfile.Constraints kThetaControllerConstraints =
            new TrapezoidProfile.Constraints(
            kMaxAngularSpeed, kModuleMaxAngularAcceleration);
        }
    
    public static final boolean kGyroReversed = true;
    
    
    public static class OperatorConstants {
        public static final int kDriverControllerPort = 0;
    }

    public static final class KinematicConstants {
        // fix measurements
        public static final Translation2d m_frontLeftLocation = new Translation2d(0.381, 0.381);
        public static final Translation2d m_frontRightLocation = new Translation2d(0.381, -0.381);
        public static final Translation2d m_backLeftLocation = new Translation2d(-0.381, 0.381);
        public static final Translation2d m_backRightLocation = new Translation2d(-0.381, -0.381);
    } 
}
