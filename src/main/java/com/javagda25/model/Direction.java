package com.javagda25.model;

//          <direction value="90" code="E" name="East"/>

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "direction")
public class Direction {
    @XmlAttribute(name = "value")
    private int value;

    @XmlAttribute(name = "code")
    private String code;

    @XmlAttribute(name = "name")
    private String name;
}
