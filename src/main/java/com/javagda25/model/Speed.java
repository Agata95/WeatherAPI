package com.javagda25.model;

//          <speed value="4.6" name="Gentle Breeze"/>

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "speed")
public class Speed {
    @XmlAttribute(name = "value")
    private double value;

    @XmlAttribute(name = "name")
    private String name;
}
