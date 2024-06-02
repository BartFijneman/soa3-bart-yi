package com.soa3.Pipeline;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {
    private List<String> steps;

    public Pipeline() {
        steps = new ArrayList<>();
    }

    public void addStep(String step) {
        steps.add(step);
    }

    public void showSteps() {
        for (String step : steps) {
            System.out.println(step);
        }
    }
}
