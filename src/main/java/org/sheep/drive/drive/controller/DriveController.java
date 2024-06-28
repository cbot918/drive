package org.sheep.drive.drive.controller;


import org.sheep.drive.drive.usecase.DriveUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drive")
public class DriveController {

    private final DriveUseCase driveUseCase;

    public DriveController(DriveUseCase driveUseCase) {
        this.driveUseCase = driveUseCase;
    }

    @PostMapping("/createFile")
    public void createFileController(@RequestBody DriveRequest driveRequest){

        System.out.println("in controller");

        driveUseCase.createFileUseCase(driveRequest);

    }
}
