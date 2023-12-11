// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  private CANSparkMax motor0; 
  /** Creates a new ExampleSubsystem. */
  public Intake() {
    motor0 = new CANSparkMax(0, MotorType.kBrushed); // PLACEHOLDER ID
  }

  public void grabIntake(){
    motor0.set(0.5);
  }

  public void dropOuttake(){
    motor0.set(-0.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
