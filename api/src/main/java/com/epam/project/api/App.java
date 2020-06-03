package com.epam.project.api;

import com.epam.project.core.Utils;

public class App {
    public static void main(String[] args) {
        boolean res = Utils.isAllPositiveNumbers("12", "79");
        System.out.println(res);
    }
}

