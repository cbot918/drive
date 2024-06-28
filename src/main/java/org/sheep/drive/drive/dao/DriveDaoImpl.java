package org.sheep.drive.drive.dao;

import org.springframework.stereotype.Service;

@Service
public class DriveDaoImpl implements DriveDao {

    private final DriveRepository driveRepository;

    public DriveDaoImpl(DriveRepository driveRepository) {
        this.driveRepository = driveRepository;
    }

    /**
     * @param driveEntity
     * @return
     */
    @Override
    public DriveEntity createFile(DriveEntity driveEntity) {
        System.out.println("in dao");
        System.out.println(driveRepository.save(driveEntity));

        return null;
    }

    /**
     * @param id 
     * @return
     */
    @Override
    public DriveEntity getFileById(String id) {
        return null;
    }

    /**
     * @return 
     */
    @Override
    public DriveEntity[] getFiles() {
        return new DriveEntity[0];
    }


}
