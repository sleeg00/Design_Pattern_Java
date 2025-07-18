package Adapter;

import java.io.*;

public interface FileIo {
    public void readFromFile(String fileName) throws IOException;
    public void writeToFile(String fileName) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
