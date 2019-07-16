package com.javagda25.model;

//  <temperature value="280.15" min="278.15" max="281.15" unit="kelvin"/>

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "temperature")
public class Temperature {
    @XmlAttribute(name = "value")
    private double value;

    @XmlAttribute(name = "min")
    private double min;

    @XmlAttribute(name = "max")
    private double max;

    @XmlAttribute(name = "unit")
    private String unit;
}
