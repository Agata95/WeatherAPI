package com.javagda25.model;

//  <humidity value="81" unit="%"/>

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "humidity")
public class Humidity {
    @XmlAttribute(name = "value")
    private int value;

    @XmlAttribute(name = "unit")
    private String unit;
}
