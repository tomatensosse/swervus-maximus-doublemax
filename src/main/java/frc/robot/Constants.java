package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;

public final class Constants {
    public static final class DriveConstants {
        public static final double kMaxSpeed = 3.0; // 3 meters per second
        public static final double kMaxAngularSpeed = Math.PI; // 1/2 rotation per second
    }   
    public static final class KinematicConstants {
        // fix measurements
        public static final Translation2d m_frontLeftLocation = new Translation2d(0.381, 0.381);
        public static final Translation2d m_frontRightLocation = new Translation2d(0.381, -0.381);
        public static final Translation2d m_backLeftLocation = new Translation2d(-0.381, 0.381);
        public static final Translation2d m_backRightLocation = new Translation2d(-0.381, -0.381);
    } 
}
