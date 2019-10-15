package org.firstinspires.ftc.teamcoode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Hardware;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.robot.Robot;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name = "NewMechDrive", group = "Linear Opmode")

public class NewMechDrive extends LinearOpMode
{

private ElapsedTime runtime = new ElapsedTime();
private DcMotor frontLeftMotor = null;
private  DcMotor frontRightMotor = null;
private DcMotor backLeftMotor = null;
private  DcMotor backRightMotor = null;
@Override
public void runOpMode() {
telemetry.addData("Status", "Initialized");
telemetry.update();

frontLeftMotor = hardwareMap.dcMotor.get("frontLeft");
frontRightMotor = hardwareMap.dcMotor.get("frontRight");
backLeftMotor = hardwareMap.dcMotor.get("backLeft");
backRightMotor = hardwareMap.dcMotor.get("backRight");

frontLeftMotor.setDirection(DcMotor.Direction.REVERSE);
frontRightMotor.setDirection(DcMotor.Direction.FORWARD);
backLeftMotor.setDirection(DcMotor.Direction.REVERSE);
backRightMotor.setDirection(DcMotor.Direction.FORWARD);
double target_angle;

waitForStart();
runtime.reset();

while(opModeIsActive()) {
double r = Math.hypot(gamepad1.left_stick_x, gamepad1.left_stick_y);
double robotAngle = Math.atan2(gamepad1.left_stick_y, gamepad1.left_stick_x) - Math.PI / 4;
double rightX = gamepad1.right_stick_x;
final double v1 = r * Math.cos(robotAngle) + rightX;
final double v2 = r * Math.sin(robotAngle) - rightX;
final double v3 = r * Math.sin(robotAngle) + rightX;
final double v4 = r * Math.cos(robotAngle) - rightX;

frontLeftMotor.setPower(v1);
frontRightMotor.setPower(v2);
backLeftMotor.setPower(v3);
backRightMotor.setPower(v4);

}
}

 public double limit(double min, double max, double num)
    {
        return (num < min) ? min : ((num > max) ? max : num);
    }


}



