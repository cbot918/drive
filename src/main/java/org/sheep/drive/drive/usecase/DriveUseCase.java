package org.sheep.drive.drive.usecase;

import org.sheep.drive.drive.controller.DriveRequest;
import org.sheep.drive.drive.controller.DriveResponse;
import org.springframework.stereotype.Repository;


public interface DriveUseCase {
    DriveResponse createFileUseCase(DriveRequest driveRequest);
}
