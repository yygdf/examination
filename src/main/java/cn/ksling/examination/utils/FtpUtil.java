package cn.ksling.examination.utils;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FtpUtil {
    private static final String FTP_ADDRESS = "115.29.197.145";

    private static final int FTP_PORT = 21;

    private static final String FTP_USERNAME = "ftpuser";

    private static final String FTP_PASSWORD = "123123";

    private static final String FTP_BASE_PATH = "/www/wwwroot/yygdf/examination";

//    public static boolean uploadFile(String fileName, InputStream inputStream) {
//        boolean flag = false;
//        FTPClient ftpClient = new FTPClient();
//        try {
//            int replay;
//            ftpClient.connect(FTP_ADDRESS, FTP_PORT);
//            ftpClient.login(FTP_USERNAME, FTP_PASSWORD);
//            replay = ftpClient.getReplyCode();
//            if (!FTPReply.isPositiveCompletion(replay)) {
//                ftpClient.disconnect();
//
//                return false;
//            }
//            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
//            ftpClient.makeDirectory(FTP_BASE_PATH);
//            ftpClient.changeWorkingDirectory(FTP_BASE_PATH);
//            ftpClient.enterLocalPassiveMode();
//            ftpClient.storeFile(fileName, inputStream);
//            inputStream.close();
//            ftpClient.logout();
//            flag = true;
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (ftpClient.isConnected()) {
//                try {
//                    ftpClient.disconnect();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        return flag;
//    }

    public static boolean uploadFiles(List<String> fileNames, List<InputStream> inputStreams) {
        boolean flag = false;
        FTPClient ftpClient = new FTPClient();
        try {
            int replay;
            ftpClient.connect(FTP_ADDRESS, FTP_PORT);
            ftpClient.login(FTP_USERNAME, FTP_PASSWORD);
            replay = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(replay)) {
                ftpClient.disconnect();

                return false;
            }
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.makeDirectory(FTP_BASE_PATH);
            ftpClient.changeWorkingDirectory(FTP_BASE_PATH);
            ftpClient.enterLocalPassiveMode();
            for (int i = 0; i < fileNames.size(); i++) {
                ftpClient.storeFile(fileNames.get(i), inputStreams.get(i));
                inputStreams.get(i).close();
            }
            ftpClient.logout();
            flag = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftpClient.isConnected()) {
                try {
                    ftpClient.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return flag;
    }
}
