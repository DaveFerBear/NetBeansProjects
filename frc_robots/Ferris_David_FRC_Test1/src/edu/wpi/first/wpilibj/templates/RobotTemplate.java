/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.can.CANTimeoutException;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    //Drivetrain Jags
    CANJaguar FrontLeftMotor;
    CANJaguar RearLeftMotor;
    CANJaguar FrontRightMotor;
    CANJaguar RearRightMotor;
    //Intake + Feeder Victors
    Victor Intake;
    Victor Feeder1;
    Victor Feeder2;
    Relay RingLight;
    CANJaguar Turret; //Turret Jag
    CANJaguar Shooter; //Shooter Jag
    Joystick driverStick = new Joystick(1); //Jostick
    double ShooterSpeed = .9; //Create the variable for controlling shooter speed (set it to .9)

    public void robotInit() {
        //CREATE JAGS//
        try { //Drive Motors
            FrontLeftMotor = new CANJaguar(3);
            RearLeftMotor = new CANJaguar(2);
            FrontRightMotor = new CANJaguar(5);
            RearRightMotor = new CANJaguar(4);

            Intake = new Victor(3); //Create Intake Victor
            Feeder1 = new Victor(1); //Create Feeder1 Victor
            Feeder2 = new Victor(2); //Create Feeder2 Victor

            Turret = new CANJaguar(9); //Create Turret Jag

            Shooter = new CANJaguar(8); //Create shooter

            RingLight = new Relay(1); //Create the Relay for the Ringlight

        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {

////////////////////////////////////////////////////////////////////////////////
        // D R I V E T R A I N //
////////////////////////////////////////////////////////////////////////////////

        double leftSpeed; //Variable for left side motor speed
        double rightSpeed; //Variable for right side motor speed

        leftSpeed = (driverStick.getRawAxis(2) - driverStick.getRawAxis(3)); //Left speed is the difference in the left and right sticks
        rightSpeed = (driverStick.getRawAxis(2) + driverStick.getRawAxis(3)); //Right Speed is the sum of the left and right sticks
        try {

            //Sets the drive to the according double
            FrontLeftMotor.setX(leftSpeed * leftSpeed * leftSpeed); //Sets front left motor for double leftspeed
            RearLeftMotor.setX(leftSpeed * leftSpeed * leftSpeed); //Sets rear left motor for double leftspeed

            FrontRightMotor.setX(rightSpeed * rightSpeed * rightSpeed); //Sets front right motor for double rightspeed
            RearRightMotor.setX(rightSpeed * rightSpeed * rightSpeed); //Sets rear right motor for double rightspeed

        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }

////////////////////////////////////////////////////////////////////////////////
        // I N T A K E + F E E D E R //
////////////////////////////////////////////////////////////////////////////////

        if (driverStick.getRawButton(7)) { //Run intake in
            Feeder1.set(0.5);
            Feeder2.set(0.5);
            Intake.set(-0.5);

            RingLight.set(Relay.Value.kForward); //Turns the light on when the intake is run

        } else if (driverStick.getRawButton(8)) //Run intake out
        {
            Feeder1.set(-0.5);
            Feeder2.set(-0.5);
            Intake.set(0.5);
        } else {
            Feeder1.set(0);
            Feeder2.set(0);
            Intake.set(0);

            RingLight.set(Relay.Value.kOff); //If the intake is not run, turn ringlight off
        }

////////////////////////////////////////////////////////////////////////////////
        // T U R R E T //
////////////////////////////////////////////////////////////////////////////////

        try {
            Turret.setPositionReference(CANJaguar.PositionReference.kPotentiometer); //Config the potentiometer
            Turret.configPotentiometerTurns(10); //Set it up as a 10 turn pot

            //System.out.println("Pot Value: " + Turret.getPosition());

            if (driverStick.getRawButton(5)) { //If the turret right botton is pressed

                if (Turret.getPosition() > 8.5) { //Ttop if the left limit is reached
                    Turret.setX(0);

                } else {
                    Turret.setX(-0.4); //if not, turn the motor to the right
                }

            } else if (driverStick.getRawButton(6)) { //If the turret left button is pressed                                                                                                                                   

                if (Turret.getPosition() < 2.5) { //Stop if the right limit is reached
                    Turret.setX(0);

                } else {
                    Turret.setX(0.4); //If not, run the motor
                }
            } else { //If not button is pressed, do nothing
                Turret.setX(0);
            }

        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
            System.out.println("Turret Error!");
        }

////////////////////////////////////////////////////////////////////////////////
        // S H O O T E R //
////////////////////////////////////////////////////////////////////////////////

        try {
            //Shooter.configNeutralMode(CANJaguar.NeutralMode.kCoast); //Set the shooter in coast mode.

            if (driverStick.getRawButton(2)) { //Increase Wheel Speed
                if (ShooterSpeed <= .5) { //If the wheel speed is less than .5
                    ShooterSpeed += .1; //Increment wheel speed by .1
                } else { //If the wheel speed is greater than .5
                    ShooterSpeed += .05; //Incrememnt wheel speed by .05
                }
            }
            if (driverStick.getRawButton(1)) { //Increase Wheel Speed
                if (ShooterSpeed <= .5) { //If the wheel speed is less than .5
                    ShooterSpeed -= .1; //Decreese wheel speed by .1
                } else { //If the wheel speed is greater than .5
                    ShooterSpeed -= .05; //Decrease wheel speed by .05
                }
            }

            if (driverStick.getRawButton(4)) { //Kill the Wheel
                Shooter.setX(0);
            }

            Shooter.setX(ShooterSpeed); //Sets the shooter to the desired Speed (as controlled above)
            System.out.println("FlyWheel Speed: " + (ShooterSpeed * 100) + " %"); //Print Shooter Speed

        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
}