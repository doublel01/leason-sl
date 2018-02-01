package org.leason.learn.vm.outofmemoryerror;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆
 * Created by lee on 2018/1/30.
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
