/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class PuppyLegs extends Subsystem {

  public static TalonSRX PuppyLeg1;

  public PuppyLegs(){

    PuppyLeg1 = new TalonSRX(RobotMap.PuppyLeg1);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public double getencodevalue(){
    return PuppyLeg1.getSelectedSensorPosition();

  }
  
  public void setpower() {
    PuppyLeg1.set(ControlMode.PercentOutput, .5);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
