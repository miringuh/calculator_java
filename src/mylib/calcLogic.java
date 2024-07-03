package mylib;

import java.io.IOException;
import java.util.ArrayList;

public class calcLogic {
      files fs;
      ArrayList<Byte>val0;
      ArrayList<Byte>val1;
      ArrayList<Byte>val2;
      ArrayList<Byte>val3;
      ArrayList<Byte>sign;
      ArrayList<Byte>ans;
      private int readList(ArrayList<Byte> obj3){
            fs = new files(".panel.txt");
            String s1;
            int val_0 = 0;
            int buff = 0;
            int size = obj3.size();
            if (size == 6) {buff = 100000;}
            if (size == 5) {buff = 10000;}
            if (size == 4) {buff = 1000;}
            if (size == 3) {buff = 100;}
            if (size == 2) {buff = 10;}
            if (size == 1) {buff = 1;}

          for (Byte aByte : obj3) {
              s1 = String.valueOf(aByte);// string
              val_0 += (Integer.parseInt(s1) - 48) * buff;
              buff /= 10;
          }
            return val_0;
      }

      private int sum2(ArrayList<Byte>obj1,ArrayList<Byte>obj2) throws IOException {
          int high = readList(obj1);
          int low = readList(obj2);
          int sums = Math.addExact(high, low);
            String format = String.format("%s", sums);
            try {
                  fs.writeFile(format);
            } catch (IOException e) {
                  throw new RuntimeException(e);
            }
            return sums;
      }
      private int minus2(ArrayList<Byte>obj1,ArrayList<Byte>obj2) throws IOException {
          int high = readList(obj1);
          int low = readList(obj2);
          int sums = Math.subtractExact(high, low);
            String format = String.format("%s", sums);
            try {
                  fs.writeFile(format);
            } catch (IOException e) {
                  throw new RuntimeException(e);
            }
            return sums;
      }
      private int multiply2(ArrayList<Byte>obj1,ArrayList<Byte>obj2) throws IOException {
          int high = readList(obj1);
          int low = readList(obj2);
            int sums=Math.multiplyExact(high,low);
            String format = String.format("%s", sums);
            try {
                  fs.writeFile(format);
            } catch (IOException e) {
                  throw new RuntimeException(e);
            }
            return sums;
      }
      private int div2(ArrayList<Byte>obj1,ArrayList<Byte>obj2) throws IOException {
          int high = readList(obj1);
          int low = readList(obj2);
            int sums=Math.floorDiv(high,low);
            String format = String.format("%s", sums);
            try {
                  fs.writeFile(format);

            } catch (IOException e) {
                  throw new RuntimeException(e);
            }
            return sums;
      }

      private int sum3(ArrayList<Byte>obj3) throws IOException {
            int base = sum2(val0, val1);
            int next = readList(val2);
          return base+next;
      }

      public int Logic() throws IOException {
            val0=new ArrayList<>(20);
            val1=new ArrayList<>(20);
            val2=new ArrayList<>(20);
            val3=new ArrayList<>(20);
            sign=new ArrayList<>(20);
            ans=new ArrayList<>(20);
            fs=new files(".panel.txt");
            int state=0;
            String s = fs.readFile();
            byte[] bytes = s.getBytes();

//          +->43, -->45, *->42, /->47,(->40,  )->41
            for (int i = 0; i < s.length(); i++) {
                  if(state==1){
                        val1.add(bytes[i]);
                  }
                  if (bytes[i]==43 || bytes[i]== 45 || bytes[i]==42|| bytes[i]==47){
                        sign.add(bytes[i]);
                        state=1;
                  }
                  if(state==0){
                        val0.add(bytes[i]);
                  }///////////////////////
                  if(bytes[i]==40){// (
                        state=2;
                  }
                  if(bytes[i]==41){// )
                        state=3;
                  }////////////////////////
                  if (state==2){
                       val2.add(bytes[i]);
                  }
                  if (state==3){
                        val3.add(bytes[i]);
                  }
            }
            // in future add for more signs
          for (Byte aByte : sign) {
              return switch (aByte) {
                  case 43 -> sum2(val0, val1);//+
                  case 42 -> multiply2(val0, val1);//*
                  case 47 -> div2(val0, val1);// /
                  case 45 -> minus2(val0, val1);// -
                  default -> 0;
              };
          }
            return state;
      }
}
