package mylib;

import java.io.IOException;
import java.util.ArrayList;

public class calcLogic {
      files fs;
      ArrayList<Integer>val0;
      ArrayList<Integer>val1;
      ArrayList<Integer>val3;
      ArrayList<Integer>val4;
      ArrayList<Integer>ans;
      public void logic_add(ArrayList<Integer> v0,ArrayList<Integer>v1){
            for (int i = 0; i < v0.size(); i++) {
//                ans.add(v0.get(i));
            }
      }
      public void Logic() throws IOException {
            fs=new files("panel.txt");
            String s = fs.readFile();
            int bytex=0;
            byte[] bytes = s.getBytes();
            // 48-0,  57-9, 0.....9
            // 61-=, 45--, *-42, /-47 ,(-40, )-41, .-46
            for (int i = 0; i < bytes.length; i++) {
                  bytex = Integer.parseInt(String.valueOf(bytes[i]));
                  if (bytex==61){

                  };

            }
      }
}
