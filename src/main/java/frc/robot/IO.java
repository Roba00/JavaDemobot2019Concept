package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.buttons.*;
import frc.robot.RobotMap;


public class IO
{
/////////////////////////////////////////////////////////////////////////////////////////////////////////////    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Joystick  
    private final Joystick leftJoy = new Joystick(RobotMap.leftJoyPort);
    private final Joystick rightJoy = new Joystick(RobotMap.rightJoyPort);
    private final static Joystick mechJoy = new Joystick(RobotMap.mechJoyPort);
  
    public final static Button mechButton1 = new JoystickButton(mechJoy, 1),
        mechButton2 = new JoystickButton(mechJoy, 2),
        mechButton3 = new JoystickButton(mechJoy, 3),
        mechButton4 = new JoystickButton(mechJoy, 4),
        mechButton5 = new JoystickButton(mechJoy, 5),
        mechButton6 = new JoystickButton(mechJoy, 6),
        mechButton7 = new JoystickButton(mechJoy, 7),
        mechButton8 = new JoystickButton(mechJoy, 8),
        mechButton9 = new JoystickButton(mechJoy, 9),
        mechButton10 = new JoystickButton(mechJoy, 10),
        mechButton11 = new JoystickButton(mechJoy, 11),
        mechButton12 = new JoystickButton(mechJoy, 12);
    
    public final double getLeftJoyX()
    {
        return leftJoy.getX();
    }
    public final double getLeftJoyY()
    {
        return leftJoy.getY();
    }
    public final double getRightJoyX()
    {
        return rightJoy.getX();
    }
    public final double getRightJoyY()
    {
        return rightJoy.getY();
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////        
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Xbox Controller    
    private final XboxController gamepad = new XboxController(RobotMap.gamepadPort);
  
    public final boolean aButton = gamepad.getAButton(),
        bButton = gamepad.getBButton(),
        xButton = gamepad.getXButton(),
        yButton = gamepad.getYButton(),
        leftBumperButton = gamepad.getBumper(Hand.kLeft),
        rightBumperButton = gamepad.getBumper(Hand.kRight),
        leftStickButton = gamepad.getStickButton(Hand.kLeft),
        rightStickButton = gamepad.getStickButton(Hand.kRight);

    public final boolean aButtonPressed = gamepad.getAButtonPressed(),
        bButtonPressed = gamepad.getBButtonPressed(),
        xButtonPressed = gamepad.getXButtonPressed(),
        yButtonPressed = gamepad.getYButtonPressed(),
        leftBumperButtonPressed = gamepad.getBumperPressed(Hand.kLeft),
        rightBumperButtonPressed = gamepad.getBumperPressed(Hand.kRight),
        leftStickButtonPressed = gamepad.getStickButtonPressed(Hand.kLeft),
        rightStickButtonPressed = gamepad.getStickButtonPressed(Hand.kRight);

    public final boolean aButtonReleased = gamepad.getAButtonReleased(),
        bButtonReleased = gamepad.getBButtonReleased(),
        xButtonReleased = gamepad.getXButtonReleased(),
        yButtonReleased = gamepad.getYButtonReleased(),
        leftBumperButtonReleased = gamepad.getBumperReleased(Hand.kLeft),
        rightBumperButtonReleased = gamepad.getBumperReleased(Hand.kRight),
        leftStickButtonReleased = gamepad.getStickButtonReleased(Hand.kLeft),
        rightStickButtonReleased = gamepad.getStickButtonReleased(Hand.kRight);

    public final int getGamepadDpadAngle()
    {
        return gamepad.getPOV();
    }

    public final double getGamepadLeftTrigger()
    {
        return gamepad.getTriggerAxis(Hand.kLeft);
    }

    public final double getGamepadRightTrigger()
    {
        return gamepad.getTriggerAxis(Hand.kRight);
    }

    public final double getGamepadLeftStickX()
    {
        return gamepad.getX(Hand.kLeft);
    }

    public final double getGamepadLeftStickY()
    {
        return gamepad.getY(Hand.kLeft);
    }

    public final double getGamepadRightStickX()
    {
        return gamepad.getX(Hand.kRight);
    }

    public final double getGamepadRightStickY()
    {
        return gamepad.getY(Hand.kRight);
    }
}