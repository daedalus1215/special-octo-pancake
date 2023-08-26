package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ConsumingClass {
    private final ConsumedClass consumedClass;

    public ConsumingClass(ConsumedClass consumedClass) {
        this.consumedClass = consumedClass;
    }

    public ConsumedClass getConsumedClass() {
        return this.consumedClass;
    }
}
