/* Copyright (c) 2014, 2015 Qualcomm Technologies Inc

All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted (subject to the limitations in the disclaimer below) provided that
the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list
of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

Neither the name of Qualcomm Technologies Inc nor the names of its contributors
may be used to endorse or promote products derived from this software without
specific prior written permission.

NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.AnnotatedOpModeRegistrar;
import com.qualcomm.robotcore.eventloop.opmode.OpModeManager;
import com.qualcomm.robotcore.eventloop.opmode.OpModeRegister;
import org.firstinspires.ftc.robotcontroller.external.samples.ConceptNullOp;
import org.firstinspires.ftc.teamcode.debug.DevExample;

import org.firstinspires.ftc.teamcode.sensors.ColorTelemetry;
import org.firstinspires.ftc.teamcode.teleop.Drive;
import org.firstinspires.ftc.teamcode.teleop.FourWheelDrive;
import org.firstinspires.ftc.teamcode.teleop.TeleOpButtonPusher;
import org.firstinspires.ftc.teamcode.teleop.UpDown;

/**
 * {@link FtcOpModeRegister} is responsible for registering opmodes for use in an FTC game.
 * @see #register(OpModeManager)
 */
public class FtcOpModeRegister implements OpModeRegister {


    /**
     * {@link #register(OpModeManager)} is called by the SDK game in order to register
     * OpMode classes or instances that will participate in an FTC game.
     *
     * There are two mechanisms by which an OpMode may be registered.
     *
     *  1) The preferred method is by means of class annotations in the OpMode itself.
     *  See, for example the class annotations in {@link ConceptNullOp}.
     *
     *  2) The other, retired,  method is to modify this {@link #register(OpModeManager)}
     *  method to include explicit calls to OpModeManager.register().
     *  This method of modifying this file directly is discouraged, as it
     *  makes updates to the SDK harder to integrate into your code.
     *
     * @param manager the object which contains methods for carrying out OpMode registrations
     *
     * @see com.qualcomm.robotcore.eventloop.opmode.TeleOp
     * @see com.qualcomm.robotcore.eventloop.opmode.Autonomous
     */
    public void register(OpModeManager manager) {

        /**
         * Register OpModes implemented in the Blocks visual programming language.
         * We aren't using the Blocks programming language.
         */
        // BlocksOpMode.registerAll(manager);


        /**
         * Register OpModes tha t use the annotation-based registration mechanism.
         * This is how we register OpModes.
         */
        /*
         * When we register OpModes, we use Annotations.
         * The syntax is as follows:
         * manager.register("OpMode Display Name", OpModeName.class);
         * Only register an OpMode if it is in a testing or working state!
         */
        AnnotatedOpModeRegistrar.register(manager);
        //manager.register("Drive", Drive.class); // TeleOp
        manager.register("Four Wheel Drive", FourWheelDrive.class); // TeleOp
        manager.register("Assisted TeleOp Button Pusher", TeleOpButtonPusher.class); // TeleOp
//<<<<<<< Updated upstream
        manager.register("ColorTelemetry", ColorTelemetry.class); // TeleOp
        manager.register("UpDown", UpDown.class); // TeleOp
        manager.register("Drive to and Push Button", WorkingBeaconPusher.class); // Autonomous
        //Debug OpMode, remove before competition:
        manager.register("DevExample", DevExample.class);
//=======
        //manager.register("Autonomous Button Pusher", AutoButtonPusher.class);
        manager.register("ColorTelemetry", ColorTelemetry.class);
        manager.register("UpDown", UpDown.class);
        manager.register("Working Beacon Code", WorkingBeaconPusher.class);

//>>>>>>> Stashed changes
        /**
         * Any manual OpMode class registrations should go here.
         */
    }
}
