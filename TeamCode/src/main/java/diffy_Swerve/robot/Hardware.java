package diffy_Swerve.robot;

import com.acmerobotics.dashboard.config.Config;
import com.arcrobotics.ftclib.controller.PIDFController;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoImplEx;

@Config
public class Hardware {
    private HardwareMap hardwareMap;

    public DcMotorEx pod1Top, pod1Bottom, pod2Top, pod2Bottom;
    //public Servo claw;
    public PIDFController p0, i0, d0, f0;
    public PIDFController p1, i1, d1, f1;
    public PIDFController p2, i2, d2, f2;
    public PIDFController p3, i3, d3, f3;

    /*
    public double motorPIDPower(double target) {

    }
    */

    public Hardware(HardwareMap hardwareMap){
        this.hardwareMap = hardwareMap;
        initializeMotors(false);
        //initializeServos();
    }

    private void initializeMotors(boolean auto) {
        pod1Top = initMotor("cm0", DcMotorEx.Direction.FORWARD);
        pod1Bottom = initMotor("cm1", DcMotorEx.Direction.REVERSE);
        //pod2Top = initMotor("cm2", DcMotorEx.Direction.FORWARD);
        //pod2Bottom = initMotor("cm3", DcMotorEx.Direction.FORWARD);
        //motorPIDPower = new PIDFController(RobotConstants.p, RobotConstants.i, RobotConstants.d, RobotConstants.f);
    }

    private DcMotorEx initMotor(String name, DcMotorEx.Direction direction) {
        DcMotorEx motor = hardwareMap.get(DcMotorEx.class, name);
        motor.setDirection(direction);
        motor.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        //motor.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);
        return motor;
    }

    /*
    private void initializeServos() {
        claw = initServo("cs0");
    }

    private Servo initServo(String name) {
        return (ServoImplEx) hardwareMap.get(Servo.class, name);
    }
     */
}

