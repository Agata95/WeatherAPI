package com.javagda25.model;

//      <weather number="701" value="mist" icon="50d"/>

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "weather")
public class Weather {
    @XmlAttribute(name = "number")
    private int number;

    @XmlAttribute(name = "value")
    private String value;

    @XmlAttribute(name = "icon")
    private String icon;
}
