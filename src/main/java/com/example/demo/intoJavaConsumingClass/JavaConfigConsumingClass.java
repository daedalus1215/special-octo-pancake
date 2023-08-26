package com.example.demo.intoJavaConsumingClass;

import com.example.demo.intoXmlConsumingClass.XmlConsumingClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JavaConfigConsumingClass {
    private final XmlConsumingClass xmlConsumingClass;

    public JavaConfigConsumingClass(XmlConsumingClass xmlConsumingClass) {
        this.xmlConsumingClass = xmlConsumingClass;
    }

    public XmlConsumingClass getXmlConsumingClass() {
        return xmlConsumingClass;
    }
}
