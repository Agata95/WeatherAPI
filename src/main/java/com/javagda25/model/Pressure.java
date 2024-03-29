package com.javagda25.model;

//  <pressure value="1012" unit="hPa"/>

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "pressure")
public class Pressure {
    @XmlAttribute(name = "value")
    private int value;

    @XmlAttribute(name = "unit")
    private String unit;
}
