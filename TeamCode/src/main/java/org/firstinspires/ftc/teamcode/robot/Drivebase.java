package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.util.Arrays;
import java.util.List;

public class Drivebase {

//    Constructing the 4 motors used on a mecanum drive
    public DcMotor leftFrontDrive;
    public DcMotor leftBackDrive;
    public DcMotor rightFrontDrive;
    public DcMotor rightBackDrive;

    public Drivebase(HardwareMap hardwareMap, Telemetry telemetry){

//        Gets the motor from the hub, make sure the name matches the config on the Driver hub
//        TODO: Pull from the branch you previously worked on using the pull tool under the Git tab
        leftFrontDrive = hardwareMap.get(DcMotor.class, "");
        leftBackDrive = hardwareMap.get(DcMotor.class, "");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "");
        rightBackDrive = hardwareMap.get(DcMotor.class, "");

        leftFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        telemetry.update();
    }

//    TODO: create a function (we call meta drive) that will change the inputs based on the heading
//          of the robot, so it drives based on a global position, ask a lead for more clarification
    public void calculateMetaDrive(double y, double x, double rot){

        calculateDrivePowers();
    }



    public void calculateDrivePowers(double y, double x, double rot){

        setDrivePowers();
    }


//    Sends power to the drive motors
    public void setDrivePowers(double lf, double lb, double rf, double rb){
        leftFrontDrive.setPower(lf);
        leftBackDrive.setPower(lb);
        rightFrontDrive.setPower(rf);
        rightBackDrive.setPower(rb);
    }

}
