package frc.robot.lib.util;

import com.ctre.phoenix.sensors.WPI_CANCoder;
import com.ctre.phoenix.sensors.CANCoderConfiguration;
import com.ctre.phoenix.sensors.AbsoluteSensorRange;
import com.ctre.phoenix.sensors.SensorInitializationStrategy;

public class CTREConfigs {
    public static WPI_CANCoder swerveCancoderConfig(WPI_CANCoder CANcoder) { 
        CANcoder.configAbsoluteSensorRange(AbsoluteSensorRange.Unsigned_0_to_360);
        CANCoderConfiguration config = new CANCoderConfiguration();
        config.absoluteSensorRange = AbsoluteSensorRange.Unsigned_0_to_360;
        config.initializationStrategy = SensorInitializationStrategy.BootToAbsolutePosition;
        CANcoder.configAllSettings(config);
        CANcoder.configGetFeedbackTimeBase(10);
        return CANcoder;
    }
}
