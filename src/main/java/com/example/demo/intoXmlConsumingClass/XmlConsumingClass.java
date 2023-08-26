package com.example.demo.intoXmlConsumingClass;

import com.example.demo.ConsumedClass;
import org.springframework.beans.factory.annotation.Autowired;

public class XmlConsumingClass {
    private ConsumedClass consumedClass;

    public ConsumedClass getConsumedClass() {
        return consumedClass;
    }

    @Autowired
    public void setConsumedClass(ConsumedClass consumedClass) {
        this.consumedClass = consumedClass;
    }
}
