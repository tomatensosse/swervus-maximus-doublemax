package frc.robot.lib.util;

public class Gearbox {

    private double gearRatio;
    
    public Gearbox(double drivingGear, double drivenGear){
        this.gearRatio = drivenGear / drivingGear;
    }

    public Gearbox(double gearRatio) {
        this.gearRatio = gearRatio;
    }

    public double calculate(double rot){
        return rot*gearRatio;
    }

    public double getRatio(){
        return gearRatio;
    }
}