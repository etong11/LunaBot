/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class HatchSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private TalonSRX hatchMotor;

  public HatchSubsystem(){
    hatchMotor=new TalonSRX(RobotMap.HATCH_MOTOR_PORT);
  }

  public void extendHatch(){
    hatchMotor.set(ControlMode.PercentOutput, 0.3);
  }

  public void retractHatch(){
    hatchMotor.set(ControlMode.PercentOutput, -0.3);
  }

  public void turnOffHatch(){
    hatchMotor.set(ControlMode.PercentOutput, 0);
  }

/*
//Uses double solenoid
  private DoubleSolenoid hatchSolenoid;

  public HatchSubsystem(){
    hatchSolenoid=new DoubleSolenoid(RobotMap.HATCH_SOLENOID_PORT1,RobotMap.HATCH_SOLENOID_PORT2);
  }

  public void retractHatch(){
    hatchSolenoid.set(DoubleSolenoid.Value.kReverse);
  }

  public void extendHatch(){
    hatchSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  public void turnOffHatch(){
    hatchSolenoid.set(DoubleSolenoid.Value.kOff);
  }
*/
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

}
