package com.tit.javastreams.filterstreams;

// Creating a class FileConversionSimulation to demonstrate file conversion operations
public class FileConversionSimulation {
    public static void main(String[] args) {
        // Creating an object of FileConverter
        FileConverter converter = new FileConverter();

        // Source and destination file paths
        String sourceFile = "src/main/resources/Large_Text_File.txt";
        String destFile = "src/main/resources/Destination.txt";

        // Converting uppercase letters to lowercase in the file
        converter.convertUppercaseToLowercase(sourceFile, destFile);
    }
}
