package diffy_Swerve.opMode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.acmerobotics.dashboard.config.Config;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.hardware.RevIMU;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import diffy_Swerve.robot.Hardware;

@TeleOp(name = "Deftones", group = "#TeleOp")
public class teleOP {

    static final boolean fieldCentric = false;

    @Override
    public void runOpMode() throws InterruptedException {

        MecanumDrive = new MecanumDrive(
                new Motor(hardwareMap, "pT1", Motor.GoBILDA.RPM_312),
                new Motor(hardwareMap, "pB1", Motor.GoBILDA.RPM_312),
                new Motor(hardwareMap, "pT2", Motor.GoBILDA.RPM_312),
                new Motor(hardwareMap, "pB2", Motor.GoBILDA.RPM_312),
                );
    }

    RevIMU imu = new RevIMU(hardwareMap);
        imu.init();

    GamepadEx driverOp = new GamepadEx(gamepad1);

    waitForStart();

    while(!isStopRequested()) {

    }
}
