/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class CargoSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private VictorSPX intakeMotor;
  private VictorSPX shooterMotor;

  public CargoSubsystem(){
      intakeMotor=new VictorSPX(RobotMap.INTAKE_MOTOR_PORT);
      shooterMotor=new VictorSPX(RobotMap.SHOOTER_MOTOR_PORT);

      shooterMotor.follow(intakeMotor);
  }

  public void cargoForward(){
    intakeMotor.set(ControlMode.PercentOutput, 1.0);
  }

  public void cargoReverse(){
    intakeMotor.set(ControlMode.PercentOutput, -1.0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
