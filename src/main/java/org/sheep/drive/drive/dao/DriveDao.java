package org.sheep.drive.drive.dao;

import org.springframework.stereotype.Service;

@Service
public interface DriveDao {
    public DriveEntity getFileById(String id);
    public DriveEntity[] getFiles();
    public DriveEntity createFile(DriveEntity driveEntity);
}
