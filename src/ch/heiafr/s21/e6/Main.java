package ch.heiafr.s21.e6;

import java.io.Flushable;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.function.Supplier;

public class Main {

    static void writeSeveralTimes(int howMany, int v, Object o){
        while(howMany-- > 0){
            if(o instanceof PrintStream)
                ((PrintStream)o).write(v);
            else if (o instanceof StringWriter)
                ((StringWriter)o).write(v);
        }
    }

    static  <T> void callItSeveralTimes(int howMany, int v, Runnable s){
        while(howMany-- > 0){
           s.run();
        }

    }

    public static void main(String[] args){
        int v = 65;
        PrintStream ps = System.out;

        StringWriter pw = new StringWriter();
        writeSeveralTimes(10,65, ps);
        writeSeveralTimes(10,65, pw);
        callItSeveralTimes(10, 65, (Runnable) () -> ps.write(65));
        callItSeveralTimes(10, 65, (Runnable) () -> pw.write(65));

        System.out.println();
        System.out.println(pw);
    }

}
