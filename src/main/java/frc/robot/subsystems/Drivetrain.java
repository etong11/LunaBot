/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;


/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private CANSparkMax leftSpark;
  private CANSparkMax rightSpark;
  private DifferentialDrive diffDrive;

  public Drivetrain(){
    leftSpark=new CANSparkMax(RobotMap.LEFT_SPARK_PORT, CANSparkMaxLowLevel.MotorType.kBrushless);
    rightSpark=new CANSparkMax(RobotMap.RIGHT_SPARK_PORT, CANSparkMaxLowLevel.MotorType.kBrushless);
    diffDrive=new DifferentialDrive(leftSpark, rightSpark);
  }

  public void drive(double leftSpeed, double rightSpeed){
    diffDrive.tankDrive(leftSpeed, rightSpeed);
  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TankDrive());
  }
}
