import greenfoot.*;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;


public class FileTalker  
{
    private static String fileName = "data/save.txt";
    
    static { createSaveFile(); }
    
    public static void createSaveFile()
    {
        Path filePath = Paths.get(fileName);        
        
        if(Files.notExists(filePath) )
        {
            
            try{
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            writer.println("");
            writer.close();
            }
        
            catch(Exception ex) {  }
            
        }
    }
    
    public static void writeData(String title, int data)
    {
        Path filePath = Paths.get(fileName);
        boolean dataExists = false;     
        
        try{
            ArrayList<String> fileContent = new ArrayList<>(Files.readAllLines(filePath, StandardCharsets.UTF_8));
    
            for (int i = 0; i < fileContent.size(); i++) {
                String line = fileContent.get(i);
                    if (line.startsWith(title)) {
                        fileContent.set(i, title + data);
                        dataExists = true;
                        break;
                    }
            }        
            
            if(dataExists == false)
            {
                fileContent.add(title + ":" + data);
            }
    
            Files.write(filePath, fileContent, StandardCharsets.UTF_8);
        }   
        
        catch(Exception ex) {  }
    }
    
    public static void writeData(String title, String data)
    {
        Path filePath = Paths.get(fileName);
        boolean dataExists = false;
        String dataTitle = title + ":";
        
        try{
            ArrayList<String> fileContent = new ArrayList<>(Files.readAllLines(filePath, StandardCharsets.UTF_8));
    
            for (int i = 0; i < fileContent.size(); i++) {
                String line = fileContent.get(i);
                    if (line.startsWith(dataTitle)) {
                        fileContent.set(i, dataTitle + data);
                        dataExists = true;
                        break;
                    }
            }        
            
            if(dataExists == false)
            {
                fileContent.add(dataTitle + data);
            }
    
            Files.write(filePath, fileContent, StandardCharsets.UTF_8);
        }   
        
        catch(Exception ex) {  }
    }
    
    public static int readIntegerData(String title)
    {
        Path filePath = Paths.get(fileName);
        String data = "";    
        String dataTitle = title + ":";
        
        try{
            ArrayList<String> fileContent = new ArrayList<>(Files.readAllLines(filePath, StandardCharsets.UTF_8));
    
            for (int i = 0; i < fileContent.size(); i++) {
                String line = fileContent.get(i);
                    if (line.startsWith(dataTitle)) {
                        String[] dataArray = line.split(dataTitle);
                        if(dataArray.length > 1)
                        {
                            data = dataArray[1].trim();
                        }
                    }
            }      
        }   
        
        catch(Exception ex) {  }
        
        int output;        
        if(!data.equals(""))
        {
            output = Integer.parseInt(data);
        }
        else
        {
            output = 0;
        }
        
        return output;
    }
    
    public static String readStringData(String title)
    {
        Path filePath = Paths.get(fileName);
        String data = "";    
        String dataTitle =title + ":";
        
        try{
            ArrayList<String> fileContent = new ArrayList<>(Files.readAllLines(filePath, StandardCharsets.UTF_8));
    
            for (int i = 0; i < fileContent.size(); i++) {
                String line = fileContent.get(i);
                    if (line.startsWith(dataTitle)) {
                        String[] dataArray = line.split(dataTitle);
                        if(dataArray.length > 1)
                        {
                            data = dataArray[1].trim();
                        }
                    }
            }      
        }   
        
        catch(Exception ex) {  }
        
        return data;
    }
    
}
