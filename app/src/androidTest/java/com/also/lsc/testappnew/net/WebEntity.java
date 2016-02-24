package com.also.lsc.testappnew.net;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lsc on 2016/2/24.
 */
public class WebEntity {
    private String methonName;
    private Map<String,String> map;
    private Class<?> obClass;
    private boolean isUpload;
    private File file;

    public WebEntity(){

    }

    public WebEntity(String methonName, Map<String, String> map, Class<?> obClass) {
        this.methonName = methonName;
        this.map = map;
        this.obClass = obClass;
    }

    public String getMethonName() {
        return methonName;
    }

    public void setMethonName(String methonName) {
        this.methonName = methonName;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Class<?> getObClass() {
        return obClass;
    }

    public void setObClass(Class<?> obClass) {
        this.obClass = obClass;
    }

    public boolean isUpload() {
        return isUpload;
    }

    public void setUpload(boolean upload) {
        isUpload = upload;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
