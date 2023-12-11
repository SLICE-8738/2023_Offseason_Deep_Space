// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  
  private CANSparkMax backleft, backright, frontleft, frontright; // bottom left, bottom right, top left, top right
  private MotorControllerGroup leftM, rightM; // left and right motor controller groups
  private DifferentialDrive drivetrain; //differential drive

  /** Creates a new drivetrain. */
  public Drivetrain() {
     backleft = new CANSparkMax(15, MotorType.kBrushed);
     backright = new CANSparkMax(18, MotorType.kBrushed);
     frontleft = new CANSparkMax(16, MotorType.kBrushed);
     frontright = new CANSparkMax(17, MotorType.kBrushed);

     frontleft.setInverted(true);

    leftM = new MotorControllerGroup(backleft, frontleft);
    rightM = new MotorControllerGroup(backright, backleft);

    drivetrain = new DifferentialDrive(leftM, rightM);
  }

  public void drive(double fSpeed, double rotSpeed){
    drivetrain.arcadeDrive(fSpeed, rotSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
