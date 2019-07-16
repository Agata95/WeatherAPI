package com.javagda25.model;

//      <coord lon="-0.13" lat="51.51"/>

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "coord")
public class Coord {
    @XmlAttribute(name = "lon")
    private double lon;

    @XmlAttribute(name = "lat")
    private double lat;
}
