package org.example.metrics;

import java.io.FileWriter;
import java.io.IOException;

public class CSVExporter {
    private FileWriter writer;

    public CSVExporter(String path) throws IOException {
        writer = new FileWriter(path);
        writer.write("ArraySize,ExecutionTime,Comparisons,ArrayAccess,Swaps,MemoryAllocations\n");
    }

    public void writeRow(int size, long time, int comparisons, int access,
                         int swaps, int allocations) throws IOException {
        writer.write(size+","+ time + "," + comparisons+ "," +access+ "," +swaps+ "," +allocations+ "\n");

    }
    public void close() throws IOException {
        writer.close();
    }
}
