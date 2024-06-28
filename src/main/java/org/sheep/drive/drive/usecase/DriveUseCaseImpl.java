package org.sheep.drive.drive.usecase;

import org.sheep.drive.drive.controller.DriveRequest;
import org.sheep.drive.drive.controller.DriveResponse;
import org.sheep.drive.drive.dao.DriveDao;
import org.sheep.drive.drive.dao.DriveEntity;
import org.springframework.stereotype.Service;

@Service
public class DriveUseCaseImpl implements DriveUseCase {

    private final DriveDao driveDao;

    public DriveUseCaseImpl(DriveDao driveDao) {
        this.driveDao = driveDao;
    }

    /**
     * @param driveRequest 
     * @return
     */
    @Override
    public DriveResponse createFileUseCase(DriveRequest driveRequest) {
        System.out.println("in usecase");
        DriveEntity driveEntity = new DriveEntity();
        driveEntity.setFileName(driveRequest.getFileName());

        driveDao.createFile(driveEntity);

        return new DriveResponse();
    }
}
