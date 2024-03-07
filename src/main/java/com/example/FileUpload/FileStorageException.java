package com.example.FileUpload;

public class FileStorageException  extends RuntimeException{

    private String msj;

    public FileStorageException(String msj){
        this.msj=msj;
    }
    public String getMsj(){
        return msj;
    }
    public void setMsj(String msj){
        this.msj=msj;
    }
}
