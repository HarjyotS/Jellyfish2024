package org.firstinspires.ftc.teamcode.drive;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp
public class sampleTeleop extends LinearOpMode {
    @Override
    public void runOpMode(){

        DcMotorEx leftFront = hardwareMap.get(DcMotorEx.class, "leftFront");
        DcMotorEx leftRear = hardwareMap.get(DcMotorEx.class, "leftRear");
        DcMotorEx rightRear = hardwareMap.get(DcMotorEx.class, "rightRear");
        DcMotorEx rightFront = hardwareMap.get(DcMotorEx.class, "rightFront");
        rightRear.setDirection(DcMotorEx.Direction.REVERSE);
        rightFront.setDirection(DcMotorEx.Direction.REVERSE);
        waitForStart();
        while(opModeIsActive()){

            double LeftDrive = -gamepad1.left_stick_y;
            double RightDrive =-gamepad1.right_stick_y;
            leftFront.setPower(LeftDrive);
            leftRear.setPower(LeftDrive);
            rightRear.setPower(RightDrive);
            rightFront.setPower(RightDrive);
        }

    }
}