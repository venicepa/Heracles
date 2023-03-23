package com.yhao.service;

import java.util.ArrayList;
import java.util.List;

public class EasonService {


    public void insertEason(String aliasName, int age, String number) {

    }

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        if (list1 != null) {
            mergedList.addAll(list1);
        }
        if (list2 != null) {
            mergedList.addAll(list2);
        }
        return mergedList;
    }

}
