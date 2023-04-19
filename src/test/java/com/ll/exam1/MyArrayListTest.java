package com.ll.exam1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyArrayListTest {
    @Test
    @DisplayName("size()")
    void t1() {
        MyArrayList<String> list = new MyArrayList<>();
        assertThat(list.size()).isEqualTo(0);
    }

    @Test
    @DisplayName("add()")
    void t2() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");

        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("get(1)")
    void t3() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");

        assertThat(list.get(0)).isEqualTo("사과");
        assertThat(list.get(1)).isEqualTo("포도");
    }

    @Test
    @DisplayName("배열의 크기가 자동으로 늘어나야한다.")
    void t4() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");
        list.add("당근");

        assertThat(list.get(0)).isEqualTo("사과");
        assertThat(list.get(1)).isEqualTo("포도");
        assertThat(list.get(2)).isEqualTo("당근");
    }

}
