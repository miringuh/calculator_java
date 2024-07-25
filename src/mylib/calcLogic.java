package mylib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class calcLogic {
    files fs;
    ArrayList<Byte>val0;
    ArrayList<Byte>val1;
    ArrayList<Byte>val2;
    ArrayList<Byte>val3;
    ArrayList<Byte>val4;
    ArrayList<Byte>val5;
    ArrayList<Byte>sign;
    ArrayList<Byte>dot;
    // ^=94  %=37 +=43 *=42 -=45 /=47 (->40  )->41  .=46

    private int getFraction(ArrayList<Integer>dot){

        return 0;
    }

    private float bodmas(ArrayList<Integer>abuff,ArrayList<Integer>abuff_dot) throws FileNotFoundException {
        fs = new files(".panel.txt");
        int num= 0;
        for (int i = 0; i < sign.size(); i++) {
            if (sign.get(i)==47){
                if (num==0){
                    num=Math.floorDiv(abuff.get(i),abuff.get(i+1));
                }else{
                    num=Math.floorDiv(num,abuff.get(i));
                }
            }
        }// div
        for (int i = 0; i < sign.size(); i++) {//*
            if (sign.get(i)==42){
                if (num==0){
                    num=Math.multiplyExact(abuff.get(i),abuff.get(i+1));
                }else{
                    num=Math.multiplyExact(abuff.get(i),num);
                }
            }
        }// x
        for (int i = 0; i < sign.size(); i++) {
            if (sign.get(i)==43){// +
                if (num==0){
                    num= Math.addExact(abuff.get(i),abuff.get(i+1));
                    }else{
                    num= Math.addExact(abuff.get(i),num);
                }
            }
        }// +
        for (int i = 0; i < sign.size(); i++) {
            if (sign.get(i)==45){// -
                if (num==0){
                    num= Math.subtractExact(abuff.get(i),abuff.get(i+1));
                }else{
                    num= Math.subtractExact(abuff.get(i),num);
                }
            }
        }// -
        for (int i = 0; i < sign.size(); i++) {
            if (sign.get(i)==94){// ^
                if (num==0){
                    num=Math.multiplyExact(abuff.get(i),abuff.get(i));
                }else{
                    num=Math.multiplyExact(num,num);
                }
            }
        }// ^
        for (int i = 0; i < sign.size(); i++) {
            if (sign.get(i)==37){// %
                int upper;
                if (num==0){
                    upper = Math.multiplyExact(abuff.get(i), abuff.get(i + 1));
                }else{
                    upper = Math.multiplyExact(num, abuff.get(i + 1));
                }
                num= Math.floorDiv(upper,100);
            }
        }// %
        float val=0;
        if (dot.size()==0){val=num;}
        if (dot.size()>=1){val=(float) num /10;}
        if (dot.size()>=2){val= (float) num /10;};


        fs.writeFile(String.valueOf(val));
        return val;
    }

    private int readList(ArrayList<Byte> arr){
        fs = new files(".panel.txt");
        String s1;
        int val_0 = 0;
        int buff = 0;
        int size = arr.size();
        if (size == 6) {buff = 100000;}
        if (size == 5) {buff = 10000;}
        if (size == 4) {buff = 1000;}
        if (size == 3) {buff = 100;}
        if (size == 2) {buff = 10;}
        if (size == 1) {buff = 1;}

        for (Byte aByte : arr) {
            s1 = String.valueOf(aByte);// string
            val_0 += (Integer.parseInt(s1) - 48) * buff;
            buff /= 10;
        }
        return val_0;
    }
// ^=94  %=37 +=43 *=42 -=45 /=47 (->40  )->41 .=46
    private String calculate() throws IOException {
        fs = new files(".panel.txt");
        ArrayList<Integer> buffer=new ArrayList<>(10);
        ArrayList<Integer> buffer_dot=new ArrayList<>(10);
        if (!val0.isEmpty()){buffer.add(readList(val0));}
        if (!val1.isEmpty()){buffer.add(readList(val1));}
        if (!val2.isEmpty()){buffer.add(readList(val2));}
        if (!val3.isEmpty()){buffer.add(readList(val3));}
        if (!val4.isEmpty()){buffer.add(readList(val4));}
        if (!val5.isEmpty()){buffer.add(readList(val5));}
        for (Byte aByte : dot) {
            buffer_dot.add(Integer.valueOf(aByte));
        }
        float bodmas =(float) bodmas(buffer,buffer_dot);

        return String.valueOf(bodmas);
    }

    public String Logic() throws IOException {
        val0=new ArrayList<>(20);
        val1=new ArrayList<>(20);
        val2=new ArrayList<>(20);
        val3=new ArrayList<>(20);
        val4=new ArrayList<>(20);
        val5=new ArrayList<>(20);
        sign=new ArrayList<>(20);
        dot=new ArrayList<>(10);
        fs=new files(".panel.txt");
        String s = fs.readFile();
        byte[] bytes = s.getBytes();
          int size;
          // ^=94  %=37 +=43 *=42 -=45 /=47 (->40  )->41 .=46
          for (int i = 0; i < s.length(); i++) {
              size=sign.size();
              if (bytes[i]==43 || bytes[i]== 45 || bytes[i]==42|| bytes[i]==47||bytes[i]==94|| bytes[i]==37 ) {
                  sign.add(bytes[i]);
                  size = 10;
              }

              if (bytes[i]==46){
                  dot.add((byte) i);
                  size=10;
              }// dot

              if (size==0){val0.add(bytes[i]);}
              if (size==1){val1.add(bytes[i]);}
              if (size==2){val2.add(bytes[i]);}
              if (size==3){val3.add(bytes[i]);}
              if (size==4){val4.add(bytes[i]);}
              if (size==5){val5.add(bytes[i]);}
          }
        return calculate();
    }
}
