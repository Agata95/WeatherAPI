package com.javagda25.model;

//      <visibility value="10000"/>

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "visibility")
public class Visibility {
    @XmlAttribute(name = "value")
    private int value;
}
