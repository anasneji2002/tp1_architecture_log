package com.directi.training.dip.refactored;

public class EncodingModuleClient {
    public static void main(String[] args) throws Exception {
        IReader fileReader = new FileReaderModule("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IWriter fileWriter = new FileWriterModule("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");

        EncodingModule fileEncoding = new EncodingModule(fileReader, fileWriter);
        fileEncoding.encode();

        IReader networkReader = new NetworkReaderModule("http://myfirstappwith.appspot.com/index.html");
        IWriter databaseWriter = new DatabaseWriterModule();

        EncodingModule networkEncoding = new EncodingModule(networkReader, databaseWriter);
        networkEncoding.encode();
    }
}
