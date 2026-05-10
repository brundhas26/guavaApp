package com.example;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

import com.google.common.collect.ImmutableList;

public class App {

    public static void main(String[] args) {

        // Immutable String List using Guava
        ImmutableList<String> fruits =
                ImmutableList.of("Apple", "Banana", "Cherry");

        System.out.println("Immutable List:");
        System.out.println(fruits);

        // Source and Destination Files
        File sourceFile = new File("source.txt");
        File destinationFile = new File("destination.txt");

        try {

            // Copy file contents
            FileUtils.copyFile(sourceFile, destinationFile);

            System.out.println("File copied successfully!");

        } catch (IOException e) {

            System.out.println("Error while copying file: "
                    + e.getMessage());
        }
    }
}
