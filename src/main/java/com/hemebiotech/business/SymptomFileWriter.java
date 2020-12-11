package com.hemebiotech.business;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SymptomFileWriter implements SymptomWriter {
    @Override
    public void writeOccurences(List<String> occurrenceSymptomList, String filName) {
        try {
            FileWriter writer = new FileWriter(filName);
            for (String entry : occurrenceSymptomList) {
                writer.write(entry + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
