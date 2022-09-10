package com.aditya.trywithresources;
import java.io.*;

public  class Example {
    protected int y=10;
      static void writeHello()
      {

      }
    public static void main(String[] args) {
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(new File("C:\\Users\\ADITYA SHARMA\\Downloads\\LiveStreamRest\\ExceptionHandling\\src\\main\\java\\com\\aditya\\trywithresources\\demo.txt")));
        BufferedReader bufferedReader1=new BufferedReader(new FileReader(new File("C:\\Users\\ADITYA SHARMA\\Downloads\\LiveStreamRest\\ExceptionHandling\\src\\main\\java\\com\\aditya\\trywithresources\\demo2.txt"))))
        {
        while(bufferedReader.read()!=-1)
        {
            System.out.println(bufferedReader.readLine());
        }
            System.out.println("--------------------------EXIT FILE 1--------------------------------\n");
            while(bufferedReader1.read()!=-1)
            {
                System.out.println(bufferedReader1.readLine());
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
