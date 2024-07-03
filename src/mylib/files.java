package mylib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class files {
    String Filename;
    public files(String filename){
        this.Filename=filename;
    }

    public String readFile()throws FileNotFoundException {
        FileInputStream reads=new FileInputStream(this.Filename);
        try{
            byte[] bytes = reads.readAllBytes();
            return new String(bytes);
        }catch (IOException e){
            System.out.println("ERROR "+e);
            return null;
        }
    }
    public void writeFile(String word)throws FileNotFoundException {
        try{
            FileOutputStream writes=new FileOutputStream(this.Filename);
            writes.write(word.getBytes());
            writes.close();

        }catch (IOException e){
            System.out.println("file write error");
        }

    }
    public void flushFile() throws FileNotFoundException {
        FileOutputStream flash=new FileOutputStream(this.Filename);
        try {
            flash.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
