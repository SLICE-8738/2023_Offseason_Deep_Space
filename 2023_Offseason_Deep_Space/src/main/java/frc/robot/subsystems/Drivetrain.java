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
  
  private CANSparkMax motorBL, motorBR, motorTL, motorTR; // bottom left, bottom right, top left, top right
  private MotorControllerGroup leftM, rightM; // left and right motor controller groups
  private DifferentialDrive dd;

  /** Creates a new drivetrain. */
  public Drivetrain() {
     motorBL = new CANSparkMax(15, MotorType.kBrushed);
     motorBR = new CANSparkMax(18, MotorType.kBrushed);
     motorTL = new CANSparkMax(16, MotorType.kBrushed);
     motorTR = new CANSparkMax(17, MotorType.kBrushed);

      leftM = new MotorControllerGroup(motorBL, motorTL);
      rightM = new MotorControllerGroup(motorBR, motorTR);

      dd = new DifferentialDrive(leftM, rightM);
  }

  public void drive(double fSpeed, double rotSpeed){
    dd.arcadeDrive(fSpeed, rotSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
