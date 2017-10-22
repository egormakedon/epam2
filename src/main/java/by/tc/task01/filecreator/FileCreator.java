package by.tc.task01.filecreator;

import java.io.*;
import java.util.List;

public class FileCreator {
    public File createFile() {
        final String FILENAME = "src/main/resources/devices_db.txt";
        File file = new File(FILENAME);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        addDataToFile(file);
        return file;
    }

    private void addDataToFile(File file) {
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
            e.printStackTrace();
        } finally {
            if (pw != null) pw.close();
        }
    }
}