package org.sheep.drive.drive.controller;

public record DriveRequest (String fileName){
    public String getFileName(){
        return fileName;
    }
};
