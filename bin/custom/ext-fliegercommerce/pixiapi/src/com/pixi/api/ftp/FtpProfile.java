package com.pixi.api.ftp;

import java.util.Arrays;

public class FtpProfile {

    /**
     * FTP address
     */
    private String ftpAddress;
    /**
     * FTP user name
     */
    private String ftpUserName;
    /**
     * FTP password
     */
    private String ftpUserPassword;
    /**
	 * 
	 */
    private String[] folders;


    /**
     * @return the ftpAddress
     */
    public String getFtpAddress() {
        return ftpAddress;
    }


    /**
     * @param ftpAddress
     *            the ftpAddress to set
     */
    public void setFtpAddress(String ftpAddress) {
        this.ftpAddress = ftpAddress;
    }


    /**
     * @return the ftpUserName
     */
    public String getFtpUserName() {
        return ftpUserName;
    }


    /**
     * @param ftpUserName
     *            the ftpUserName to set
     */
    public void setFtpUserName(String ftpUserName) {
        this.ftpUserName = ftpUserName;
    }


    /**
     * @return the ftpUserPassword
     */
    public String getFtpUserPassword() {
        return ftpUserPassword;
    }


    /**
     * @param ftpUserPassword
     *            the ftpUserPassword to set
     */
    public void setFtpUserPassword(String ftpUserPassword) {
        this.ftpUserPassword = ftpUserPassword;
    }


    /**
     * @return the folder
     */
    public String[] getFolders() {
        return folders;
    }


    /**
     * @param folder
     *            the folder to set
     */
    public void setFolders(String[] folder) {
        this.folders = folder;
    }


    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "FtpProfile [ftpAddress=" + ftpAddress + ", ftpUserName=" + ftpUserName
                + ", ftpUserPassword=" + ftpUserPassword + ", folder=" + Arrays.toString(folders)
                + "]";
    }
}