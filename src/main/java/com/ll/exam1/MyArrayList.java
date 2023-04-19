package com.ll.exam1;

public class MyArrayList<T> {

    private String[] data = new String[2];
    private int size = 0;


    public int size() {
        return size;
    }

    public boolean add(String element) {

        makeNewDataIfNotEnough();
        data[size] = element;
        size ++;

        return true;
    }

    private void makeNewDataIfNotEnough() {
        if ( ifNotEnough() ) {
            makeNewData();
        }
    }

    private void makeNewData() {
        //자리없으니까 그냥 두배해버린다.
        String[] newData = new String[data.length * 2];

        //새 창고로 옮긴다
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    private boolean ifNotEnough() {
        return size >= data.length - 1;
    }

    public String get(int index) {
        return data[index];
    }
}
