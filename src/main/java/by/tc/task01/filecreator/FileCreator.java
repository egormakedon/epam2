package by.tc.task01.filecreator;

import java.io.*;
import java.util.List;

public class FileCreator {
    private final String DIRECTORY_PATH = "src/main/resources/";

    public void createFile(String filename) throws FileExistException, FileCreateException {
        File file = new File(DIRECTORY_PATH + filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
                printDataToFile(file);
            } catch (IOException e) {
                throw new FileCreateException("File hasn't created", e.getCause());
            }
        } else {
            throw new FileExistException("File has already created");
        }
    }

    private void printDataToFile(File file) throws FileCreateException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            FileData fileData = new FileData();
            List<List<String>> dataList = fileData.getDeviceList();

            for (List<String> devices : dataList) {
                for (String device : devices) {
                    pw.printf(device);
                    if (!device.equals(devices.get(devices.size() - 1))) {
                        pw.printf("\n");
                    }
                }

                if (!devices.equals(dataList.get(dataList.size() - 1))) {
                    pw.printf("\n\n");
                }
            }

        } catch (IOException e) {
            throw new FileCreateException("IOException with Writers", e.getCause());
        } finally {
            if (pw != null) pw.close();
        }
    }
}
