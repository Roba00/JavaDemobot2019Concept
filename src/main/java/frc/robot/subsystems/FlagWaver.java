/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.RobotMap;
import frc.robot.commands.FlagWaveTeleOp;

/**
 * Add your docs here.
 */
public class FlagWaver extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  final Spark flagMotor;
  public final double flagSpeed;

  public FlagWaver()
  {
    flagMotor = new Spark(RobotMap.flagMotorPort);
    flagSpeed = 0.25;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new FlagWaveTeleOp());
  }

  public void setMotorSpeed(double speed)
  {
      flagMotor.setSpeed(speed);
  }

  public void runFlag(double flagSpeed, boolean flagStartButton, boolean flagStopButton)
  {
    boolean shouldFlagWave = false;

    if (flagStartButton)
    {
      shouldFlagWave = true;
    }
    else if (flagStopButton)
    {
      shouldFlagWave = false;
    }

    if (shouldFlagWave)
    {
      setMotorSpeed(flagSpeed);
    }
    else if (!shouldFlagWave)
    {
      setMotorSpeed(0.0);
    }
  }
}
