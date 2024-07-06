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
      ArrayList<Byte>sign;
      ArrayList<Byte>ans;

    private long bodmas(ArrayList<Integer>abuff) throws FileNotFoundException {
        //       (->40,  )->41, *->42, +->43, -->45, /->47,
        fs = new files(".panel.txt");

        long num= 0L;
        for (int i = 0; i < sign.size(); i++) {
            if (sign.get(i)==47){// div
                if (num==0){
                    num=Math.floorDiv(abuff.get(i),abuff.get(i+1));
                }else{
                    num=Math.floorDiv(num,abuff.get(i));
                }
            }
        }
        for (int i = 0; i < sign.size(); i++) {
            if (sign.get(i)==42){// x
                if (num==0){
                    num=Math.multiplyExact(abuff.get(i),abuff.get(i+1));
                }else{
                    num=Math.multiplyExact(abuff.get(i),num);
                }
            }
        }
        for (int i = 0; i < sign.size(); i++) {
            if (sign.get(i)==43){// +
                if (num==0){
                    num= Math.addExact(abuff.get(i),abuff.get(i+1));
                }else{
                    num= Math.addExact(abuff.get(i),num);
                }
            }
        }
        for (int i = 0; i < sign.size(); i++) {
            if (sign.get(i)==45){// -
                if (num==0){
                    num= Math.subtractExact(abuff.get(i),abuff.get(i+1));
                }else{
                    num= Math.subtractExact(num,abuff.get(i));
                }
            }
        }
        fs.writeFile(String.valueOf(num));
        return num;
    }
    private int getSign(int val_a,int val_b, Byte val){
//       (->40,  )->41, *->42, +->43, -->45, /->47,
          int value=0;
          switch (val){
              case 42:// X
                 return Math.multiplyExact(val_a,val_b);
              case 43:// +
                 return  Math.addExact(val_a,val_b);
              case 45:// -
                 return  Math.subtractExact(val_a,val_b);
              case 47:// /
                  return Math.floorDiv(val_a,val_b);
              default:
                  return 0;
          }
    }
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
    private String calculate() throws IOException {
          fs = new files(".panel.txt");
          ArrayList<Integer> buffer=new ArrayList<>(10);
          if (!val0.isEmpty()){buffer.add(readList(val0));}
          if (!val1.isEmpty()){buffer.add(readList(val1));}
          if (!val2.isEmpty()){buffer.add(readList(val2));}
          if (!val3.isEmpty()){buffer.add(readList(val3));}
//      BUFFER [ O,1,2,3 ]
        long bodmas = bodmas(buffer);

//        String s = "";
//        ArrayList<Integer>local;
//          int size = sign.size();
//          switch (size){
//              case 0:
//                  s="Input some data!";
//                  return s;
//              case 1:
//                  int sign1 = getSign(buffer.get(0), buffer.get(1), sign.get(0));
//                  s = String.valueOf(sign1);
//                  fs.writeFile(s);
//                  return  s;
//
//              case 2:
//                  local=new ArrayList<>(1);
//                  local.add(getSign(buffer.get(0), buffer.get(1), sign.get(0)));
//                  local.add(getSign(local.get(0), buffer.get(2), sign.get(1)));
//                  s = String.valueOf(local.get(1));
//                  fs.writeFile(s);
//                  local.clear();
//                  return  s;
//              case 3:
//                  local=new ArrayList<>(2);
//                  local.add(getSign(buffer.get(0), buffer.get(1), sign.get(0)));//0
//                  local.add(getSign(local.get(0), buffer.get(2), sign.get(1)));//1
//                  s = String.valueOf(getSign(local.get(1), buffer.get(3), sign.get(2)));
//                  fs.writeFile(s);
//                  local.clear();
//                  return  s;
//              case 4:
//                  local=new ArrayList<>(3);
//                  local.add(getSign(buffer.get(0), buffer.get(1), sign.get(0)));
//                  local.add(getSign(local.get(0), buffer.get(2), sign.get(1)));
//                  local.add(getSign(local.get(1), buffer.get(3), sign.get(2)));
//                  s = String.valueOf(getSign(local.get(2),buffer.get(4), sign.get(3)));
//                  fs.writeFile(s);
//                  local.clear();
//                  return  s;
//              case 5:
//                  local=new ArrayList<>(3);
//                  local.add(getSign(buffer.get(0),buffer.get(1), sign.get(0)));
//                  local.add(getSign(local.get(0), buffer.get(2), sign.get(1)));
//                  local.add(getSign(local.get(1), buffer.get(3), sign.get(2)));
//                  local.add(getSign(local.get(2), buffer.get(4), sign.get(3)));
//                  s = String.valueOf(getSign(local.get(3),buffer.get(5), sign.get(4)));
//                  fs.writeFile(s);
//                  local.clear();
//                  return s;
//              case 6:
//                  local=new ArrayList<>(3);
//                  local.add(getSign(buffer.get(0), buffer.get(1), sign.get(0)));
//                  local.add(getSign(local.get(0), buffer.get(2), sign.get(1)));
//                  local.add(getSign(local.get(1), buffer.get(3), sign.get(2)));
//                  local.add(getSign(local.get(2), buffer.get(4), sign.get(3)));
//                  local.add(getSign(local.get(3), buffer.get(5), sign.get(4)));
//                  s = String.valueOf(getSign(local.get(4),buffer.get(6), sign.get(5)));
//                  fs.writeFile(s);
//                  local.clear();
//                  return s;
//              default:
//                  s="Overflow:max 6 arithmetics";
//                  return s;
//          }
        return String.valueOf(bodmas);
    }
    public String Logic() throws IOException {
          val0=new ArrayList<>(20);
          val1=new ArrayList<>(20);
          val2=new ArrayList<>(20);
          val3=new ArrayList<>(20);
          sign=new ArrayList<>(20);
          ans=new ArrayList<>(20);
          fs=new files(".panel.txt");
          String s = fs.readFile();
          byte[] bytes = s.getBytes();
//          +->43, -->45, *->42, /->47, (->40,  )->41
          int size=0;
          for (int i = 0; i < s.length(); i++) {
              size=sign.size();
              if (bytes[i]==43 || bytes[i]== 45 || bytes[i]==42|| bytes[i]==47||bytes[i]==40|| bytes[i]==41 ) {
                  sign.add(bytes[i]);
                  size = 10;
              }
              if (size==0){val0.add(bytes[i]);}
              if (size==1){val1.add(bytes[i]);}
              if (size==2){val2.add(bytes[i]);}
              if (size==3){val3.add(bytes[i]);}
          }
        return "testing";//calculate();
      }
}
