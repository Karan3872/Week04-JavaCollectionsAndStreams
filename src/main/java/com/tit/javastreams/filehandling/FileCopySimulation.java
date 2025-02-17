package com.tit.javastreams.filehandling;

// Creating a class FileCopySimulation to demonstrate file copy operation
public class FileCopySimulation
{
    public static void main(String[] args)
    {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();

        // Source and destination file paths
        String sourceFile = "src/main/java/com/tit/javastreams/filehandling/Large_File.txt";
        String destinationFile = "src/main/java/com/tit/javastreams/filehandling/Copy_Large_File.txt";

        // Copying the file
        fileHandler.copyFile(sourceFile, destinationFile);
    }
}