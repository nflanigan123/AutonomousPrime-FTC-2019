package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackables;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackable;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackableDefaultListener;
import org.firstinspires.ftc.robotcore.external.matrices.OpenGLMatrix;
import org.firstinspires.ftc.robotcore.external.matrices.VectorF;
import java.util.Locale;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CompassSensor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.hardware.bosch.BNO055IMU;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.bosch.JustLoggingAccelerationIntegrator;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;  

import org.firstinspires.ftc.robotcore.external.Func;
import org.firstinspires.ftc.robotcore.external.navigation.Acceleration;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.robotcore.external.navigation.Position;
import org.firstinspires.ftc.robotcore.external.navigation.Velocity;
import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.matrices.OpenGLMatrix;
import org.firstinspires.ftc.robotcore.external.matrices.VectorF;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackable;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackableDefaultListener;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackables;

import java.util.ArrayList;
import java.util.List;

import static org.firstinspires.ftc.robotcore.external.navigation.AngleUnit.DEGREES;
import static org.firstinspires.ftc.robotcore.external.navigation.AxesOrder.XYZ;
import static org.firstinspires.ftc.robotcore.external.navigation.AxesOrder.YZX;
import static org.firstinspires.ftc.robotcore.external.navigation.AxesReference.EXTRINSIC;
import static org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer.CameraDirection.BACK;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="RedFoundationAutonomous", group="Linear Opmode")



public class FoundationAutonomous extends LinearOpMode  {
    
 public ElapsedTime mRunTime = new ElapsedTime(); //sets up a timer in theprogram
  boolean forward = true;
  boolean down = true; 

    
    private DcMotor frontLeftMotor = null;
    private  DcMotor frontRightMotor = null;
    private DcMotor backLeftMotor = null;
    private  DcMotor backRightMotor = null;
    private DcMotor elevatorMotor = null; 
     public void runOpMode() {
        
 frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeft");
 frontRightMotor = hardwareMap.get(DcMotor.class, "frontRight");
 backLeftMotor = hardwareMap.get(DcMotor.class, "backLeft");
 backRightMotor = hardwareMap.get(DcMotor.class, "backRight");
 elevatorMotor = hardwareMap.get(DcMotor.class, "elevatorMotor");
 
frontLeftMotor.setDirection(DcMotor.Direction.REVERSE);
frontRightMotor.setDirection(DcMotor.Direction.REVERSE);        
backRightMotor.setDirection(DcMotor.Direction.REVERSE);
backLeftMotor.setDirection(DcMotor.Direction.REVERSE);
elevatorMotor.setDirection(DcMotor.Direction.REVERSE);
        
         waitForStart();
        
         while (opModeIsActive()) {
            while(forward == true) {
             if(mRunTime.time() >= 0)
             {
             frontLeftMotor.setPower(1); 
             frontRightMotor.setPower(1);
             backLeftMotor.setPower(1);
              backRightMotor.setPower(1);
              elevatorMotor.setPower(0);
             }
             if(mRunTime.time() >= 2)
               {
                frontLeftMotor.setPower(0); 
                frontRightMotor.setPower(0);
                backLeftMotor.setPower(0);
                 backRightMotor.setPower(0);
                 
                 forward = false;
              
                 
                } 
                
               
                
               
             
            
                 
            }// while true
         }//while active 

    }// run OpMode
}// class
