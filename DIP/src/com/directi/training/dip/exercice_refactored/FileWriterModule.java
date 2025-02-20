package com.directi.training.dip.refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterModule implements IWriter {
    private String filePath;

    public FileWriterModule(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String data) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        }
    }
}
