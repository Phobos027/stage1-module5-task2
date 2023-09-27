package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (List<Integer> list) -> {
            List <Integer> resultList = new ArrayList<>();
            for (Integer integer : list) {
                resultList.add(integer / divider);
            }
            return resultList;
        };
    }
}
