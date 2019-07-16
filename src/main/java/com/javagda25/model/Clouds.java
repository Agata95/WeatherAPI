package com.javagda25.model;

//      <clouds value="90" name="overcast clouds"/>

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "clouds")
public class Clouds {
    @XmlAttribute(name = "value")
    private int value;

    @XmlAttribute(name = "name")
    private String name;
}
