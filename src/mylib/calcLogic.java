package mylib;

import java.io.IOException;
import java.util.ArrayList;

public class calcLogic {
      files fs;
      ArrayList<Byte>val0;
      ArrayList<Byte>val1;
//      ArrayList<Byte>val3;
//      ArrayList<Byte>val4;
      ArrayList<Byte>sign;
      ArrayList<Byte>ans;

      private int sum2(ArrayList<Byte>obj1,ArrayList<Byte>obj2) throws IOException {
            fs = new files("panel.txt");
            String s1 = " ";
            int val_0 = 0;
            int buff = 0;
            int size = obj1.size();
            if (size == 6) {buff = 100000;}
            if (size == 5) {buff = 10000;}
            if (size == 4) {buff = 1000;}
            if (size == 3) {buff = 100;}
            if (size == 2) {buff = 10;}
            if (size == 1) {buff = 1;}

            for (int i = 0; i < obj1.size(); i++) {
                  s1 = String.valueOf(obj1.get(i));// string
                  val_0 += (Integer.parseInt(s1) - 48) * buff;
                  buff /= 10;
            }
            String s2;
            int buff1 = 0;
            int val_1 = 0;

            int size1 = obj2.size();
            if (size1 == 6) {buff1 = 100000;}
            if (size1 == 5) {buff1 = 10000;}
            if (size1 == 4) {buff1 = 1000;}
            if (size1 == 3) {buff1 = 100;}
            if (size1 == 2) {buff1 = 10;}
            if (size1 == 1) {buff1 = 1;}

            for (int i = 0; i < obj2.size(); i++) {
                  s2 = String.valueOf(obj2.get(i));// string
                  val_1 += (Integer.parseInt(s2) - 48) * buff1;
                  buff1 /= 10;
            }
            int sums = Math.addExact(val_0, val_1);

            String format = String.format("%s", sums);
            try {
                  fs.writeFile(format);
            } catch (IOException e) {
                  throw new RuntimeException(e);
            }
            return sums;
      }
      private int minus2(ArrayList<Byte>obj1,ArrayList<Byte>obj2) throws IOException {
            fs=new files("panel.txt");
            String s1=" ";
            int val_0=0;
            int buff=0;
            int size = obj1.size();
            if (size==6){buff=100000;}
            if (size==5){buff=10000;}
            if (size==4){buff=1000;}
            if (size==3){buff=100;}
            if (size==2){buff=10;}
            if (size==1){buff=1;}

            for (int i = 0; i < obj1.size(); i++) {
                  s1 = String.valueOf(obj1.get(i));// string
                  val_0+=(Integer.parseInt(s1)-48)*buff;
                  buff/=10;
            }
            String s2;
            int buff1=0;
            int val_1=0;

            int size1 = obj2.size();
            if (size1==6){buff1=100000;}
            if (size1==5){buff1=10000;}
            if (size1==4){buff1=1000;}
            if (size1==3){buff1=100;}
            if (size1==2){buff1=10;}
            if (size1==1){buff1=1;}

            for (int i = 0; i < obj2.size(); i++) {
                  s2 = String.valueOf(obj2.get(i));// string
                  val_1+=(Integer.parseInt(s2)-48)*buff1;
                  buff1/=10;
            }
            System.out.println(val_0-val_1);
            int sums=Math.subtractExact(val_0,val_1);

            String format = String.format("%s", sums);
            try {
                  fs.writeFile(format);
            } catch (IOException e) {
                  throw new RuntimeException(e);
            }
            return sums;
      }
      private int multiply2(ArrayList<Byte>obj1,ArrayList<Byte>obj2) throws IOException {
            fs=new files("panel.txt");
            String s1=" ";
            int val_0=0;
            int buff=0;
            int size = obj1.size();
            if (size==6){buff=100000;}
            if (size==5){buff=10000;}
            if (size==4){buff=1000;}
            if (size==3){buff=100;}
            if (size==2){buff=10;}
            if (size==1){buff=1;}

            for (int i = 0; i < obj1.size(); i++) {
                  s1 = String.valueOf(obj1.get(i));// string
                  val_0+=(Integer.parseInt(s1)-48)*buff;
                  buff/=10;
            }
            String s2;
            int buff1=0;
            int val_1=0;

            int size1 = obj2.size();
            if (size1==6){buff1=100000;}
            if (size1==5){buff1=10000;}
            if (size1==4){buff1=1000;}
            if (size1==3){buff1=100;}
            if (size1==2){buff1=10;}
            if (size1==1){buff1=1;}

            for (int i = 0; i < obj2.size(); i++) {
                  s2 = String.valueOf(obj2.get(i));// string
                  val_1+=(Integer.parseInt(s2)-48)*buff1;
                  buff1/=10;
            }
            int sums=Math.multiplyExact(val_0,val_1);

            String format = String.format("%s", sums);
            try {
                  fs.writeFile(format);
            } catch (IOException e) {
                  throw new RuntimeException(e);
            }
            return sums;
      }
      private int div2(ArrayList<Byte>obj1,ArrayList<Byte>obj2) throws IOException {
            fs=new files("panel.txt");
            String s1=" ";
            int val_0=0;
            int buff=0;
            int size = obj1.size();
            if (size==6){buff=100000;}
            if (size==5){buff=10000;}
            if (size==4){buff=1000;}
            if (size==3){buff=100;}
            if (size==2){buff=10;}
            if (size==1){buff=1;}

            for (int i = 0; i < obj1.size(); i++) {
                  s1 = String.valueOf(obj1.get(i));// string
                  val_0+=(Integer.parseInt(s1)-48)*buff;
                  buff/=10;
            }
            String s2;
            int buff1=0;
            int val_1=0;

            int size1 = obj2.size();
            if (size1==6){buff1=100000;}
            if (size1==5){buff1=10000;}
            if (size1==4){buff1=1000;}
            if (size1==3){buff1=100;}
            if (size1==2){buff1=10;}
            if (size1==1){buff1=1;}

            for (int i = 0; i < obj2.size(); i++) {
                  s2 = String.valueOf(obj2.get(i));// string
                  val_1+=(Integer.parseInt(s2)-48)*buff1;
                  buff1/=10;
            }
            int sums=Math.floorDiv(val_0,val_1);
            String format = String.format("%s", sums);
            try {
                  fs.writeFile(format);

            } catch (IOException e) {
                  throw new RuntimeException(e);
            }
            return sums;
      }

      public int Logic() throws IOException {
            val0=new ArrayList<>(20);
            val1=new ArrayList<>(20);
            sign=new ArrayList<>(4);
            ans=new ArrayList<>(20);
            fs=new files("panel.txt");
            int state=0;
            String s = fs.readFile();
            byte[] bytes = s.getBytes();
//          +->43, -->45, *->42, /->47,
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
                  }
            }
            // in future add for more signs
            int getForm=0;
            switch (sign.get(0)) {
                  case 43:
                        return sum2(val0, val1);//+
                  case 42:
                       return multiply2(val0, val1);//*
                  case 47:
                        return div2(val0, val1);// /
                  case 45:
                        return minus2(val0, val1);//-
                  default:
                        return 0;
            }
      }
}
