package org.leason.learn.vm.outofmemoryerror;

import java.util.ArrayList;
import java.util.List;

/**
 * 永久代
 * Created by lee on 2018/1/31.
 */
public class PermGenOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
